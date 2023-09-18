package ru.vsu.cs.util.steblev_d_v.oop.tasks.task16;

/**
 * @author: Danila Steblev
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);

        WriteOnlyList<Integer> test = new WriteOnlyList<>(list);
        test.get(1);
                List<Integer> list1 = new LinkedList<>();
//
//
//        SingletonList single = new SingletonList(1);
//        single.get(0);
//
//
//        System.out.println(single);
//        ReadOnlyList<Integer> read0 = new ReadOnlyList<>(list);
//        ReadOnlyList<Integer> read = new ReadOnlyList<>(list1);
//
//        list.add(1);
//        list1.add(1);
//        System.out.println(list);
//        System.out.println(list1);
////
//        read0.toString();
//        System.out.println(read0);
////        read.get(0);

    }
}
