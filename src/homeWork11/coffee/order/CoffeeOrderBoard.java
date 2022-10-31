package homeWork11.coffee.order;

import java.util.*;

public class CoffeeOrderBoard {

    LinkedList<Order> orders = new LinkedList<>();

    public void add(Order order) {
        orders.addLast(order);
    }

    public void deliver() {
        orders.pollFirst();
    }

    public void deliver(int turnNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == turnNumber) {
                orders.remove(order);
                break;
            }
        }
    }

    public void draw(LinkedList<Order> orders) {
        System.out.println("=============" + "\n" + "Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + "  | " + order.getCustomerName());
        }
    }

    @Override
    public String toString() {
        return "CoffeeOrderBoard{" +
                "orders=" + orders +
                '}';
    }
}
