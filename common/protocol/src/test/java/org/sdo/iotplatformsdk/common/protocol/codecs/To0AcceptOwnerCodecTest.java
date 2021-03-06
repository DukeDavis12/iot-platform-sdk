/*******************************************************************************
 * Copyright 2020 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package org.sdo.iotplatformsdk.common.protocol.codecs;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.CharBuffer;
import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.sdo.iotplatformsdk.common.protocol.codecs.To0AcceptOwnerCodec;
import org.sdo.iotplatformsdk.common.protocol.types.To0AcceptOwner;

class To0AcceptOwnerCodecTest {

  To0AcceptOwnerCodec to0AcceptOwnerCodec;
  To0AcceptOwner to0AcceptOwner;
  static StringWriter writer;

  @BeforeAll
  static void beforeAll() {
    writer = new StringWriter();
  }

  @BeforeEach
  void beforeEach() {
    to0AcceptOwnerCodec = new To0AcceptOwnerCodec();
    to0AcceptOwner = Mockito.mock(To0AcceptOwner.class);
  }

  @Test
  void test_Encoder() throws IOException {
    Mockito.when(to0AcceptOwner.getWs()).thenReturn(Duration.ZERO);
    to0AcceptOwnerCodec.encoder().apply(writer, to0AcceptOwner);
  }

  @Test
  void test_Decoder() throws IOException {

    CharBuffer charBufferto0AcceptOwner = Mockito.mock(CharBuffer.class);
    Mockito.when(charBufferto0AcceptOwner.get()).thenReturn('{').thenReturn('"').thenReturn('w')
        .thenReturn('s').thenReturn('"').thenReturn(':').thenReturn('}');
    to0AcceptOwnerCodec.decoder().apply(charBufferto0AcceptOwner);
  }
}
