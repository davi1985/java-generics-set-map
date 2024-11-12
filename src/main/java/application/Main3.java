package application;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(5, 2, 10);

        printList(listNumbers);
    }

    private static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
