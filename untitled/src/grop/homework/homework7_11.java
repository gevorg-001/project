package grop.homework;

import java.util.ArrayList;

public class homework7_11 {
    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(8);
        arrayList.add(5);
        ArrayList<Object> myArray = new ArrayList<>();
        myArray.add(3);
        myArray.add(9);
        myArray.add(7);
        myArray.add(6);
        System.out.println(arrayList.equals(myArray));

    }
}

