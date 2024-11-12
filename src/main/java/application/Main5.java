package application;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number firstNumber = list.get(0);
//        list.add(12); -> error compilation (covariancia)

        List<Object> myObjects = new ArrayList<Object>();
        myObjects.add("Davi");
        myObjects.add("Silva");

        List<? super Number> myNums = myObjects;
        myNums.add(10);
        myNums.add(3.14);

        var y = myNums.get(0);
//        Number x = myNums.get(0);
    }

}
