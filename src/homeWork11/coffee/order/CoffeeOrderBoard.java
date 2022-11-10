package homeWork11.coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    HashMap<Integer, Order> orders = new HashMap<>();
    int counter = 1;

    public void add(Order order) {

        if (!orders.containsKey(order.getOrderNumber()))
            orders.put(order.getOrderNumber(), order);
        else System.err.println("The order already exists: " + order);
    }

    public Order deliver() {
        orders.remove(counter);
        counter++;
        return orders.get(counter);
    }

    public Order deliver(int turnNumber) {
        for (Order order : orders.values()) {
            if (order.getOrderNumber() == turnNumber) {
                orders.remove(order.getOrderNumber());
                break;
            }
        }
        return orders.get(turnNumber);
    }


    public void draw(HashMap<Integer, Order> orders) {
        System.out.println("=============" + "\n" + "Num | Name");
        for (Order order : this.orders.values()) {
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
