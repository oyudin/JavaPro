package homeWork11.coffee.order;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order("Oleksandr");
        Order order2 = new Order("John");
        Order order3 = new Order("Walter");
        Order order4 = new Order("Smith");
        Order order5 = new Order("John");
        Order order6 = new Order("John");

        CoffeeOrderBoard coffeeOrderBoard1 = new CoffeeOrderBoard();

        coffeeOrderBoard1.add(order1);
        coffeeOrderBoard1.add(order2);
        coffeeOrderBoard1.add(order3);
        coffeeOrderBoard1.add(order4);
        coffeeOrderBoard1.add(order5);
        coffeeOrderBoard1.add(order6);

        coffeeOrderBoard1.deliver();
        coffeeOrderBoard1.deliver(4);

        coffeeOrderBoard1.draw();
    }
}
