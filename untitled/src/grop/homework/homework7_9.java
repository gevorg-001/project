package grop.homework;

import java.util.ArrayList;

public class homework7_9 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("97");
        arrayList.add("7");

        ArrayList<String> myList = new ArrayList<>();
        myList= (ArrayList<String>) arrayList.clone();
        System.out.println(myList);
    }
}
