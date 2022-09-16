package lesson3;

public class Main {
    public static void main(String[] args) {

        userDepositeInfo("Bob", "White", 1000, 2.5f, 1);
        userDepositeInfo("Bob", "White", 1000, 2.5f, 5);
        userDepositeInfo("Bob", "White", 1000, 2.5f, 10);
    }

    public static void userDepositeInfo(String name, String surname, int sum, float percentage, int depositYear) {
        float deposit = sum / 100 * percentage * depositYear;
        float totalSum = sum + deposit;
        System.out.println( name + " " + surname + " Sum of Deposit = " + deposit + " after " + depositYear
                + " years total sum = " + totalSum);
    }
}
