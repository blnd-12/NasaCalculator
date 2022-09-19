public class CalculatorService {

    int firstNum;

    String symbol;
    int secondNum;
    private int result;

    CalculatorService(int firstNum, String symbol , int secondNum) {

        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.symbol = symbol;
    }

    public void sum() {
        result = this.firstNum + this.secondNum;
        System.out.println(result);
    }

    public void minus() {
        result = this.firstNum - this.secondNum;
        System.out.println(result);

    }


}
