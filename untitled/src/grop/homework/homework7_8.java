package grop.homework;

import java.util.ArrayList;
import java.util.Comparator;

public class homework7_8 {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.sort((Comparator<? super Integer>) arrayList);
        System.out.println(arrayList);
    }
}
