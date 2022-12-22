package homeWork14;

import java.time.LocalDate;
import java.util.*;

public class Product {

    List<Product> products = new ArrayList<>();
    private String type;
    private int price;
    private int idNumber;
    private boolean discount;
    private LocalDate createDate;

    public Product(String type, int price, boolean discount, LocalDate createDate, int idNumber) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = createDate;
        this.idNumber = idNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "products=" + products +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", idNumber=" + idNumber +
                ", discount=" + discount +
                ", createDate=" + createDate +
                '}';
    }
}
