package calculator;

public class StringSplitter {

    private static final String DEFAULT_DELIMITERS = ",|:";

    public String[] split(String text) {
        if (text.startsWith("//")) {
            // customDelimiter으로 ->
        }
        return text.split(DEFAULT_DELIMITERS);
    }
}
