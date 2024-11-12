package application;

import services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<String> service = new PrintService();

        System.out.print("How many values ? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String value = scanner.next();
            service.addValue(value);
        }

        service.print();

        System.out.println("First: " + service.first());

        scanner.close();
    }
}