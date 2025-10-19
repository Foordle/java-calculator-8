package calculator;

public class Calculator {
    private final InputValidator validator = new InputValidator();
    private final StringSplitter splitter = new StringSplitter();
    private final NumberSummer summer = new NumberSummer();

    public int add(final String text) {

        if (validator.isEmpty(text)) {
            return 0;
        }

        String[] numbers = splitter.split(text);
        return summer.sum(numbers);
    }

}
