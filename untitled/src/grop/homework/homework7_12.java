package grop.homework;

import java.util.ArrayList;

public class homework7_12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("5");
        arrayList.add("1");
        arrayList.add("5");
        arrayList.add("8");

        ArrayList<Object> myArray = new ArrayList<>();
        myArray.add("15");
        myArray.add("2");
        myArray.add("4");
        myArray.add("6");
        System.out.println(myArray.containsAll(arrayList));

    }
}
