package homeWork.homeWork3;

import java.util.Arrays;

public class SummArray {

        public static void main(String[] args) {
            int a [][] = {
                    {1,2,3},
                    {4},
                    {-10}
            };


            int [] c = {1,2,3};
            int [] d = {3,5};
            System.out.println(
                    Arrays.toString(removeDuplicates(c,d))
            );

            print2DArray(a);
        }

        public static int [] removeDuplicates(int [] a, int [] b)
        {
            int [] c = new int[a.length + b.length];
            for(int i = 0; i < a.length; i++)
            {
                c[i] = a[i];
            }
            for(int i = 0; i < b.length; i++)
            {
                c[i + a.length] = b[i];
            }
            Arrays.sort(c);
            int [] d = new int[c.length];
            int current = c[0];
            int index = 1;
            d[0]=c[0];
            for(int i = 1; i < c.length; i++)
            {
                if(current != c[i])
                {
                    d[index] = c[i];
                    index++;
                }
                current = c[i];
            }
            int [] e = new int[index];
            for(int i = 0; i < e.length; i++)
            {
                e[i] = d[i];
            }
            return e;
        }





        public static void print2DArray(int [][] a)
        {
            System.out.println("[");
            for(int i = 0; i < a.length; i++)
            {
                System.out.println(
                        Arrays.toString(a[i])
                );
            }
            System.out.println("]");
        }


        public static int sumOf2DArray(int [] [] a)
        {
            int sum = 0;
            for(int i = 0; i < a.length; i++)
            {
                for(int j = 0; j < a[i].length; j++)
                {
                    sum += a[i][j];
                }
            }
            return sum;
        }


    }
