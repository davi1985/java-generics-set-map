package application;

import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String path = "in.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();

            while (line != null) {
                list.add(Integer.parseInt(line));
                line = reader.readLine();
            }

            Integer result = CalculationService.max(list);
            System.out.println("Max: " + result);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
