package lesson6.list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTester {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        list.add(0,0);
        System.out.println(list);
    }
}
