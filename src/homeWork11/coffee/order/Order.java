package homeWork11.coffee.order;

public class Order {

    private final String customerName;
    private Integer number;

    public Order(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerName() {
        return customerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", number=" + number +
                '}';
    }
}
