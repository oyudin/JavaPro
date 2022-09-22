package homeWork4;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(comparator(1, 8));
        printNumber(1);
        System.out.println(validateNumber(-1));
        printString("Bob", 2);
        System.out.println(guessYear(100));

    }

    public static void printThreeWords() {
        System.out.println("""
                Orange
                Banana
                Apple""");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("The sum is positive");
        } else System.out.println("The sum is negative");
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else System.out.println("Green");
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    public static boolean comparator(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumber(int a) {
        if (a < 0) System.out.println("Negative number");
        else System.out.println("Positive number");
    }

    public static boolean validateNumber(int a) {
        return a < 0;
    }


    public static void printString(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

    public static boolean guessYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}