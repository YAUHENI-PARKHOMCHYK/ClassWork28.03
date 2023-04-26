package lesson7;

import lesson6.list.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachTester {

    public static void main(String[] args) {

        List<String> rivers = new ArrayList<>(Arrays.asList("Volga", "Danube", "Rein", "Sena"));
        for(String river: rivers)
        {
            System.out.println(river);
        }
        for(int i =0; i<rivers.size(); i++){
            System.out.println(rivers.get(i));
        }
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);


    }
}
