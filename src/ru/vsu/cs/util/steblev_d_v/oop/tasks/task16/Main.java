package ru.vsu.cs.util.steblev_d_v.oop.tasks.task16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(3);
        readOnlyArrayList readList = new readOnlyArrayList(list);
        System.out.println("Исходник: " + list);
        System.out.println("readOnly: " + readList);

//        readList.add(1);
//        test.set(1, 2);

        writeOnlyArrayList writeList = new writeOnlyArrayList(list);
        writeList.get(1);
    }
}
