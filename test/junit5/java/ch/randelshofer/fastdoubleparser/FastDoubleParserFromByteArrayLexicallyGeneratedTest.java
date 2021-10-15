/*
 * @(#)FastDoubleParserLexcicallyGeneratedTest.java
 * Copyright © 2021. Werner Randelshofer, Switzerland. MIT License.
 */

package ch.randelshofer.fastdoubleparser;

import java.nio.charset.StandardCharsets;

public class FastDoubleParserFromByteArrayLexicallyGeneratedTest extends AbstractLexicallyGeneratedTest {
    @Override
    protected double parse(String str) {
        return FastDoubleParserFromByteArray.parseDouble(str.getBytes(StandardCharsets.ISO_8859_1));
    }
}
