package homeWork11.coffee.order;

import java.util.*;

public class CoffeeOrderBoard {

    LinkedList<Order> orders = new LinkedList<>();

    int number = 1;

    public void add(Order order) {
        orders.addLast(order);
        order.setNumber(number);
        number++;
    }


    public void deliver() {
        orders.pollFirst();
    }

    public void deliver(int number) {
        for (Order order : orders) {
            if (order.getNumber() == number) {
                orders.remove(order);
                break;
            }
        }
    }

    public void draw() {
        System.out.println("=============" + "\n" + "Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getCustomerName());
        }
    }

    @Override
    public String toString() {
        return "CoffeeOrderBoard{" +
                "orders=" + orders +
                '}';
    }
}
