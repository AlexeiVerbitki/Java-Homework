package ch02;
import java.util.Scanner;
public class Exercise_2_32 {
    public static void main(String[] args) {
        int positive, negative, zeros,a,s,d,f,g;
        positive =0;
        negative =0;
        zeros =0;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        s = input.nextInt();
        d = input.nextInt();
        f = input.nextInt();
        g = input.nextInt();

        if (a > 0) positive++;
        else if (a < 0) negative++;
        else if (a == 0) zeros++;

        if (s > 0) positive++;
        else if (s < 0) negative++;
        else if (s == 0) zeros++;

        if (d > 0) positive++;
        else if (d < 0) negative++;
        else if (d == 0) zeros++;

        if (f > 0) positive++;
        else if (f < 0) negative++;
        else if (f == 0) zeros++;

        if (g > 0) positive++;
        else if (g < 0) negative++;
        else if (g == 0) zeros++;

        System.out.printf("Number of Positive = %d\n", positive);
        System.out.printf("Number of Negative = %d\n", negative);
        System.out.printf("Number of Zeros = %d\n", zeros);



    }
}
