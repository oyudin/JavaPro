package homeWork14;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> books = new ArrayList<>();

        books.add(new Product("Book", 100, true, LocalDate.ofYearDay(2018, 10), 1));
        books.add(new Product("Book", 200, false, LocalDate.ofYearDay(2019, 10), 2));
        books.add(new Product("Book", 250, true, LocalDate.ofYearDay(2020, 10), 3));
        books.add(new Product("Book", 300, false, LocalDate.ofYearDay(2021, 10), 4));
        books.add(new Product("Book", 75, false, LocalDate.ofYearDay(2022, 10), 5));
        books.add(new Product("Magazine", 500, true, LocalDate.now(), 6));


        ProductMethods.getBooksPriceOver250(books);

        ProductMethods.booksWithDiscount(books);

        ProductMethods.cheapestBook(books);

        ProductMethods.lastProducts(books);

        ProductMethods.getTotalSum(books);

        ProductMethods.groupedProductsByType(books);
    }
}
