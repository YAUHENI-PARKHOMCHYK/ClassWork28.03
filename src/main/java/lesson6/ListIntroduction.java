package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("France");
        countries.add("Germany");
        countries.add("Denmark");
        System.out.println(countries);
        countries.add(1, "Poland"); // Добавление элемента по индексу
        System.out.println(countries);
        System.out.println(countries.size()); //Размер списка
        System.out.println(countries.get(3));// вывод одного элемента по индексу
        countries.set(0, "Norway"); //замена элемента
        System.out.println(countries);
//        countries.add(8,"Andorra");

        countries.remove(0);
        countries.remove("Poland");
        countries.add("Chad");
        countries.contains("Denmark"); // Есть ли элемент в списке
        System.out.println(countries.indexOf("Denmark"));//индекс позиции элемента
        countries.stream().filter(s -> s.length() > 5).forEach(System.out::println);

        printStringsGreaterThan4(countries);


        List<String> names = Arrays.asList("Max", "Amalia", "Dina", "Sergey");
        System.out.println(names);

        List<String> capitals = new ArrayList<>(
                Arrays.asList("Warsaw", "Vilnius", "Riga", "Berlin")
        );
        capitals.add("Prague");
        System.out.println(capitals);

        countries.addAll(capitals);
        System.out.println(countries);

        System.out.println(
                compare(
                        Arrays.asList("Dima", "Max", "Sveta"),
                        Arrays.asList("Dima", "Anna", "Alina")
                )
        );

        // в коллекциях могут быть только объекты ссылочных типов
        // List<int> b; !!!
        List<Integer> ints = new ArrayList<>();




    }
    // напишите функцию которая принимает на вход два списка строк одинаковой длины
    // и возвращает список Boolean - true если элементы с одним и тем-же индексом
    // попарно одинаковы и false наоборот
    // [Dima, Max, Sveta], [Dima, Anna, Alina] -> [true, false, false]
    public static List<Boolean> compare(List<String> a, List<String> b)
    {
        List<Boolean> r = new ArrayList<>();
        for(int i = 0; i < a.size(); i++)
        {
//            if(a.get(i).equals(b.get(i)))
//                r.add(true);
//            else
//                r.add(false);
            r.add(
                    a.get(i).equals(b.get(i))
            );
        }
        return r;




}





    // Напишите функцию котороая принимает List<String> и распечатывает только
    // элементы длины больше 5
    public static void printStringsGreaterThan4(List<String> a)
    {
     for(int i =0; i<a.size(); i++){

         if(a.get(i).length() > 5){
             System.out.println(a.get(i));
         }
     }
        // Напишите функцию котороая принимает List<String> и распечатывает только
        // элементы длины больше 5
//        public static void printStringsGreaterThan4(List<String> a)
//        {
//        for(int i = 0; i < a.size(); i++)
//        {
//            if(a.get(i).length() > 5)
//                System.out.println(a.get(i));
//        }
//            for (String s : a) {
//                if (s.length() > 5)
//                    System.out.println(s);
//            }
//        }



        // до 20:10
    }





}
