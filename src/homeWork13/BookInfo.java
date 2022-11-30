package homeWork13;

import java.util.Scanner;

public class BookInfo {

    public static String pathToBook = "src/homeWork13/books/" + bookTitle() + ".txt";
    public static String pathToStatistic = "src/homeWork13/bookStatistic/statistics.txt";

    public static String bookTitle() {
        System.out.println("Enter the book title: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}