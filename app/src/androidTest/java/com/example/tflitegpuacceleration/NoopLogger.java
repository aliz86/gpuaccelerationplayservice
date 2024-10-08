/*
 * Copyright 2023 The TensorFlow Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.tflitegpuacceleration;

import com.example.tflitegpuacceleration.logger.Logger;

/** Logs no output. Used in instrumentation tests. */
class NoopLogger implements Logger {

  @Override
  public void error(String msg, Exception e) {}

  @Override
  public void info(String msg) {}

  @Override
  public void clear() {}
}
