package homeWork5;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {

        while (true) {
            System.out.println(calculator());
            finishApp();
        }
    }

    public static String calculator() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1 number:");
        double firstNumber = scanner.nextInt();

        System.out.println("Select the operation: +, -, /, *");
        String operator = scanner.next();

        System.out.println("Enter the 2 number:");
        double secondNumber = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
        }
        return "Type: 'exit' to close or try again";
    }

    public static void finishApp() {
        Scanner closeApp = new Scanner(System.in);
        if (closeApp.next().equals("exit")) System.exit(0);
    }
}
