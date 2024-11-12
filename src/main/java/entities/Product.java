package entities;

import java.util.Objects;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product obj) {
        return price.compareTo(obj.getPrice());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Product product = (Product) object;
        return Objects.equals(getName(), product.getName()) && Objects.equals(getPrice(), product.getPrice());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + Objects.hashCode(getPrice());
        return result;
    }
}
