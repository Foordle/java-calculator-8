package calculator;

public class NumberSummer {
    public int sum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            int num;
            try{
                num = Integer.parseInt(number);
            }catch (NumberFormatException e){
                throw new IllegalArgumentException("들어온값이 숫자가 아님");
            }

            if(num<=0){
                throw new IllegalArgumentException("들어온값이 숫자가 음수임");
            }
            sum += num;
        }
        return sum;
    }
}
