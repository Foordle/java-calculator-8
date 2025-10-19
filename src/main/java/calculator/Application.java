package calculator;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.\n");
        String inputMSG = Console.readLine();

        //Calculator calculator = new Calculator();
        //int result = calculator.add();
        int result = 0;
        System.out.println("결과 : " + result);
    }
}
