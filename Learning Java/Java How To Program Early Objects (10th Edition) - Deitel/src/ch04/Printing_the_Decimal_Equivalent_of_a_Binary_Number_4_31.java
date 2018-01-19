package ch04;
import java.util.Scanner;
public class Printing_the_Decimal_Equivalent_of_a_Binary_Number_4_31 {
    public static void main(String[] args) {
        int remainder=0;
        int decimal=0;
        int powerOf2=1;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your binary number: ");
        int binary = input.nextInt();
        int originalBinary = binary;


        while(binary!=0){

            remainder=binary%10;
            binary=binary/10;
//            System.out.printf("\nbinary = %d", binary);
//            System.out.printf("\nremainder = %d", remainder);
            decimal= decimal+(remainder*powerOf2);
            powerOf2=powerOf2*2;

        }
        System.out.printf("\n%d in binary is %d in decimal", originalBinary,decimal);
    }
}
