package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Main10 {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        products.add(new Product("Tv", 900.0));
        products.add(new Product("Notebook", 1200.0));
        products.add(new Product("Tablet", 400.0));

        Product p = new Product("Notebook", 1200.0);

        System.out.println(products.contains(p));
    }
}
