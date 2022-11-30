package homeWork14;

import java.util.*;
import java.util.stream.Collectors;

public class ProductMethods {

    public static List<Product> getBooksPriceOver250(List<Product> productList) {
        System.out.println("Books price over 250:");
        productList = productList.stream()
                .filter(s -> s.getType().equals("Book") && s.getPrice() >= 250)
                .toList();

        System.out.println(productList);
        return productList;
    }

    public static List<Product> booksWithDiscount(List<Product> productList) {
        System.out.println("\nBooks with discount: ");
        productList = productList.stream()
                .filter(s -> s.getType().equals("Book") && (s.isDiscount()))
                .peek(product -> product.setPrice(product.getPrice() - product.getPrice() / 100 * 10)).toList();

        System.out.println(productList);
        return productList;
    }

    public static Product cheapestBook(List<Product> productList) throws NoSuchElementException {
        System.out.println("\nThe cheapest book: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the category: ");

        String enteredCategory = scanner.next();
        scanner.close();

        return productList.stream()
                .filter(s -> s.getType().equals(enteredCategory))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }

    public static List<Product> lastProducts(List<Product> productList) {
        System.out.println("\nThe latest products: ");

        productList = productList.stream()
                .sorted((o1, o2) -> o2.getCreateDate().compareTo(o1.getCreateDate()))
                .limit(3)
                .toList();

        System.out.println(productList);
        return productList;
    }

    public static String getTotalSum(List<Product> productList) {
        System.out.println("\nThe total sum of books this year: ");
        int sumOfProducts = productList.stream()
                .filter(s -> s.getCreateDate().getYear() == 2022 && s.getType().equals("Book") && s.getPrice() <= 75)
                .mapToInt(Product::getPrice).sum();

        System.out.println(sumOfProducts);
        return "Total sum: " + sumOfProducts;
    }

    public static Map<String, List<Product>> groupedProductsByType(List<Product> productList) {
        System.out.println("\nProducts grouped by type: ");

        Map<String, List<Product>> groupedByType = productList
                .stream()
                .collect(Collectors.groupingBy(Product::getType));

        groupedByType.forEach(((String, products) -> {
            System.out.println(String);
            products.forEach(System.out::println);
            System.out.println();
        }));
        return groupedByType;
    }
}