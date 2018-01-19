package ch04;
import java.util.Scanner;
public class Square_of_Asterisks_4_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0;
        int counter2=0;
        int counter3=0;
        int rows=0;
        System.out.printf("Enter the square side: ");
        int asterisk = input.nextInt();
        int asterisk2 = asterisk;
//        int asterisk=10;
//        int asterisk2=10;


        while(counter < asterisk){
            System.out.printf("*");
            counter++;
        }

        while(rows < (asterisk-2)){
            System.out.printf("\n*");
                while (counter3<(asterisk-2)){
                    System.out.printf(" ");
                    counter3++;
                }
            System.out.printf("*");
                counter3=0;
            rows++;
        }
        System.out.printf("\n");
        while(counter2 < asterisk2){
            System.out.printf("*");
            counter2++;
        }
    }
}
