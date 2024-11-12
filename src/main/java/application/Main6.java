package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<>();

        copy(myInts, myObjects);
        printList(myObjects);

        copy(myDoubles, myObjects);
        printList(myObjects);
    }

    public static void copy(List<? extends Number> from, List<? super Number> to) {
        for (Number n : from) {
            to.add(n);
        }
    }

    public static void printList(List<?> list) {
        for (Object object : list) System.out.print(object + " ");

        System.out.println();
    }

//    public static void copy(List<? extends Number> from, List<? super Number> to) {
//        for (Number n : from) to.add(n);
//    }
}
