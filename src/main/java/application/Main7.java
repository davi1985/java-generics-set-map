package application;

import entities.Client;

public class Main7 {
    public static void main(String[] args) {
        Client c1 = new Client("Mary", "mary@email.com");
        Client c2 = new Client("Mary", "mary@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
    }
}
