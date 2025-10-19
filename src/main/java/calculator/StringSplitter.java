package calculator;

import java.util.regex.Pattern;

public class StringSplitter {

    private static final String DEFAULT_DELIMITERS = ",|:";

    public String[] split(String text) {
        if (text.startsWith("//")) {
            return splitWithCustomDelimiter(text);
        }
        return text.split(DEFAULT_DELIMITERS);
    }

    private String[] splitWithCustomDelimiter(String text) {
        int delimiterEndIdx = text.indexOf("\\n"); // \n이 아니라 \\n -> 첫번째 \Idx
        if (delimiterEndIdx == -1) {
            throw new IllegalArgumentException();
        }

        String customDelimiter = text.substring(2, delimiterEndIdx);
        String numberString = text.substring(delimiterEndIdx + 2);

        return numberString.split(customDelimiter);
    }
}
