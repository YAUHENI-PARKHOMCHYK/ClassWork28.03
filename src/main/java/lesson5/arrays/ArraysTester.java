package lesson5.arrays;

import java.util.Arrays;

public class ArraysTester {
    public static void main(String[] args) {
        int [] a = new int []{1, 7, 5, 3, -20};
        int [] b = new int[2];

        String [] movies = new String[]{"Apocalypse now", "Taxi driver", "Tango and cache" };
        String [] songs = {"Rasputin", "Never let me down again" };

        test(new String[]{"abc"});
        test(songs);
        System.out.println(a.length);
        System.out.println(songs);
        System.out.println(
                Arrays.toString(songs)
        );
        songs[1] = "November rain";
        System.out.println(
        format(movies)
        );
        int [] [] c = new int[][]{
                {1, 3, 5},
                {4},
                {-10, 20, -40, 5}
        };
        // напишите функцию которая принимает на вход два массива целых любой длины и
        // возвращает новый массив целых суммарной длины с элементами
        // взодных массивов [1,2,3], [4,5,6] -> [1,2,3,4,5,6]
//        public static int [] concatenate(int [] f, int [] e)
//        {
//            int[] d = new int[f.length + e.length];
//            int counter = 0;
//            for (int j : f) {
//                d[counter++] = j;
//            }
//            for (int j : e) {
//                d[counter++] = j;
//            }
//            return d;
//
//            System.out.println(
//                    Arrays.toString(
//                            concatenate(new int[]{1, 2, 3}, new int[]{4, 5, 6, 7})
//                    )
//            );

        }


//        int result;
//        int [] d = new int[];
//        for (int i =0; i<c.length; i++){
//
//            for(int j = 0; j<c[i].length; j++){
//
//                result = c[i][j];
//            }
//        }

//        System.out.println( c[2][2]);
//    }
    public static String format(String [] s) {
        // [Rasputin, Never let me down again]
        String result = "";
        result += "[";
        for (int i = 0; i < s.length; i++)
        {
            if(i != 0)
            {
                result += ", ";
            }
            result += s[i];
        }
        result += "]";
        return result;
    }

    public static  void test (String[] s){

    }
}
