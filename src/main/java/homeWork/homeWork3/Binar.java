package homeWork.homeWork3;

import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {


        int[] binar = new int[]{-5, 1, 2, 5, 7, 8, 9, 12, 14};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число которое хотите найти: ");
        int search = scanner.nextInt();

        int maxIndex = binar.length;
        int minIndex = 0;
        int result = 0;

            while (minIndex <= maxIndex){

                int middleIndex = (minIndex + maxIndex)/2;


        if(search == binar[middleIndex]){
            result = middleIndex;
            System.out.println("Число которое вы искали под индексом: " + result);
            break;
        }else if(binar[middleIndex]<search){
            minIndex += middleIndex + 1;

        }
        else if(binar[middleIndex]>search){
            maxIndex -= middleIndex - 1;
            }


        }



        }

    }

