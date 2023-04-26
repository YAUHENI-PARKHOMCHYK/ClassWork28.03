package homeWork.homeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {


        int binar[] = {-5, 1, 2, 5, 7, 8, 9, 12, 14};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число которое хотите найти: ");
        int search = scanner.nextInt();

        System.out.println("Число которое вы искали под индексом: " + binarySearch(binar,search));

    }

    public static int binarySearch(int [] binarSearch, int value)
    {

        int maxIndex = binarSearch.length-1;
        int minIndex = 0;


            while (minIndex <= maxIndex){

                int middleIndex = (minIndex + maxIndex)/2;


        if(binarSearch[middleIndex]<value){
            minIndex = middleIndex + 1;

        }
        else if(binarSearch[middleIndex]>value){
            maxIndex = middleIndex - 1;
            }
        else
                return middleIndex;

        }


        return minIndex -1;
    }
}

