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

package org.sdo.iotplatformsdk.common.protocol.types;

@SuppressWarnings("serial")
public class EpidKey11 extends EpidKey {

  public EpidKey11(byte[] groupId) {
    super(groupId);
  }

  @Override
  public String getAlgorithm() {
    return getType().toString();
  }

  @Override
  public String getFormat() {
    return getType().toString();
  }

  @Override
  public KeyType getType() {
    return KeyType.EPIDV1_1;
  }
}
