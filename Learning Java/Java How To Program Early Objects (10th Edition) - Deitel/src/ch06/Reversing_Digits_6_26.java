package ch06;
import java.util.Scanner;
public class Reversing_Digits_6_26 {

    public static void reverse(int number){
        System.out.printf("Reverse number: ");
        while (number!=0){
            System.out.printf("%d",number%10);
            number=number/10;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();
        reverse(number);
    }
}
