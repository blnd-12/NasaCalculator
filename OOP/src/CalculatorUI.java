import java.util.Scanner;

public class CalculatorUI {
    private final Scanner scan = new Scanner(System.in);


    void calculatorUI(){

        msg("Enter fist Number: ");
        int firstNum = scan.nextInt();

        msg("Enter operator: ");
        String symbol = scan.next();

        msg("Enter second Number: ");
        int secondNum = scan.nextInt();

        CalculatorService calculator = new CalculatorService(firstNum, symbol, secondNum);

        switch (symbol) {
            case "+" -> calculator.sum();
            case "-" -> calculator.minus();
        }

    }


    private void msg(String msg){
        System.out.print(msg);
    }
}
