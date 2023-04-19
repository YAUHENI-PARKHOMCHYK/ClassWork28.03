package homeWork.homeWork3;

import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {


        int[] binar = new int[]{-5, 1, 2, 5, 7, 8, 9, 12, 14};
        Scanner scanner = new Scanner(System.in);
        int find = scanner.nextInt();
        int index = binar.length/2;

        for (int i = 0; i < binar.length; i++) {

        if(find > binar[index]){
            index = index + index/2;
        }if(find < binar[index]){
            index = index - index/2;
            }else{
                System.out.println("Число которое вы искали под индексом: " + index);
            }



        }
    }
}
