package calculator;

public class InputValidator {
    public boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }
    public void validateNumbers(String[] numbers) {
        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                if (num <= 0) {
                    throw new IllegalArgumentException("validateNumbers:들어온 숫자가 0 혹은 음수임" + num);
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("validateNumbers:들어온 값이 숫자가 아님: " + number, e);
            }
        }
    }
}
