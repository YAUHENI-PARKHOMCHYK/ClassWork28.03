package lesson7;

import lesson6.list.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {

        List<String> rivers = new ArrayList<>(Arrays.asList("Volga", "Danube", "Rein", "Sena"));

        Iterator<String> riversIterator = rivers.iterator();
//        System.out.println(riversIterator.hasNext());
//        System.out.println(riversIterator.next());
//        System.out.println(riversIterator.hasNext());
//        System.out.println(riversIterator.next());
//        System.out.println(riversIterator.hasNext());
//        System.out.println(riversIterator.next());
//        System.out.println(riversIterator.hasNext());
//        System.out.println(riversIterator.next());

//        for(int i=0; i<rivers.size();i++){
//            System.out.println(riversIterator.hasNext());
//            System.out.println(riversIterator.next());
//        }
        while (riversIterator.hasNext())
            System.out.println(riversIterator.next());

        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> arryIterator = list.iterator();
        while (arryIterator.hasNext())
            System.out.println(arryIterator.next());


        // для того чтобы foreach работал
        // контейнер должен реализовывать интерфейс Iterable<T>
        for(int i : list)
        {
            System.out.println("foreach " + i
            );
        }

    }
}
