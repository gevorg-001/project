package grop.homework;

import java.util.ArrayList;

public class homework7_15 {
    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.set(1, 2);
        arrayList.clear();
        System.out.println(arrayList);
    }
}
