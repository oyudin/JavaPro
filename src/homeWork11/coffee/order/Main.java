package homeWork11.coffee.order;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(1, "Oleksandr");
        Order order2 = new Order(2, "John");
        Order order3 = new Order(3, "Smith");
        Order order4 = new Order(3, "Smith2");
        Order order5 = new Order(5, "Walter");
        Order order6 = new Order(6, "Walter");

        CoffeeOrderBoard coffeeOrderBoard1 = new CoffeeOrderBoard();

        coffeeOrderBoard1.add(order1);
        coffeeOrderBoard1.add(order2);
        coffeeOrderBoard1.add(order3);
        coffeeOrderBoard1.add(order4);
        coffeeOrderBoard1.add(order5);
        coffeeOrderBoard1.add(order6);


        coffeeOrderBoard1.deliver();
        coffeeOrderBoard1.deliver(6);


        System.out.println(coffeeOrderBoard1.orders);

       coffeeOrderBoard1.draw(coffeeOrderBoard1.orders);

    }
}
