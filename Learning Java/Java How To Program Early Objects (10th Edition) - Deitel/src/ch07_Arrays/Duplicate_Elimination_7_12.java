package ch07_Arrays;

import java.util.Scanner;

public class Duplicate_Elimination_7_12 {


    public static void main(String[] args) {
        int[] array = new int [5];

        Scanner input = new Scanner(System.in);
        for (int i=0; i<5;i++){
            int trigger=0;
            while(trigger ==0) {
                System.out.printf("\nEnter number between 10 and 100: ");
                array[i] = input.nextInt();
                if (array[i] >= 10 && array[i] <= 100) {
                    trigger = 1;
                    if (i == 0)
                        System.out.printf("Nummber %d is unique\n", array[0]);
                    if (i > 0 && array[i] != array[i - 1])
                        System.out.printf("Nummber %d is unique\n", array[i]);
                }
                else
                    System.out.printf("between 10 and 100, not %d", array[i]);
            }
        } // end if

    } // end main
}
