package ch04;
import java.util.Scanner;

public class Find_the_Largest_Number_4_21 {
    public static void main(String[] args) {
        int counter = 1;
        int number = 0;
        int previousNumber=0;
        int largest = 0;
        int secondLargest=0;
        Scanner input = new Scanner(System.in);


        while(counter<6) {
            System.out.printf("Enter the number of sales for salesperson %d: ", counter);
            number = input.nextInt();
            if (largest <= number) largest = number;
            if (secondLargest <  number & number < largest) secondLargest = number;
            if (secondLargest < previousNumber & previousNumber<largest) secondLargest = previousNumber;

            counter++;
            previousNumber = largest;

            System.out.printf("\nLargest number of sales is: %d", largest);
            System.out.printf("\nThe Second largest number of sales is: %d", secondLargest);
            System.out.printf("\n-------------------\n");
            }


        System.out.printf("\nLargest number of sales is: %d", largest);
        System.out.printf("\nthe Second largest number of sales is: %d", secondLargest);

    }

}// end Find_the_Largest_Number_4_21