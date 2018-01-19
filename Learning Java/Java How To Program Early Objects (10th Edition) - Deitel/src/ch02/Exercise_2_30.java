package ch02;
import java.util.Scanner;
public class Exercise_2_30 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int x = input.nextInt();
        int unit, tens, hundreds, thousands, tensofthousands;

        tensofthousands = x /10000;
        thousands = x%10000/1000;
        hundreds = x%1000/100;
        tens = x%100/10;
        unit = x%10;

        System.out.printf("%d\t %d\t %d\t %d\t %d\t", tensofthousands, thousands, hundreds, tens, unit );

    }
}
