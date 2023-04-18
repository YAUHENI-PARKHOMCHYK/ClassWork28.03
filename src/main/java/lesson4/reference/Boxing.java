package lesson4.reference;

import lesson4.animals.Cat;

import java.util.ArrayList;
import java.util.List;

public class Boxing {
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = new Integer(10);

        List<Integer> integers = new ArrayList<>();

        Integer i2 = 10;
        if(i2 < 100)
            System.out.println("Hello");

        int a =10;
        int b =10;

        System.out.println(a==b);


        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));

        Cat c1 = new Cat("Trifon");
        Cat c2 = new Cat("Trifon");



        System.out.println(c1.equals(c2));
        Object o;




    }

}
