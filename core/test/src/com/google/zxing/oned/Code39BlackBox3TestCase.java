/*
 * Copyright 2008 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.oned;

import com.google.zxing.MultiFormatReader;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.AbstractBlackBoxTestCase;

import java.io.File;

/**
 * @author dswitkin@google.com (Daniel Switkin)
 */
public final class Code39BlackBox3TestCase extends AbstractBlackBoxTestCase {

  public Code39BlackBox3TestCase() {
    super(new File("test/data/blackbox/code39-3"), new MultiFormatReader(), BarcodeFormat.CODE_39);
    addTest(17, 17, 0.0f);
    addTest(17, 17, 180.0f);
  }

}