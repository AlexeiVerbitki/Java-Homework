package ch06;
import java.util.Scanner;
public class Displaying_a_Square_of_Any_Character_6_19 {


    public void squareOfAsterisks(char character){
        Scanner input = new Scanner(System.in);
        int counter=0;
        int counter2=0;
        int counter3=0;
        int rows=0;
        System.out.printf("Enter the square side: ");
        int asterisk = input.nextInt();

//        int asterisk=10;
//        int asterisk2=10;


        while(counter < asterisk){
            System.out.printf("%c",character);
            counter++;
        }

        while(rows < (asterisk-2)){
            System.out.printf("\n%c",character);
            while (counter3<(asterisk-2)){
                System.out.printf(" ");
                counter3++;
            }
            System.out.printf("%c", character);
            counter3=0;
            rows++;
        }
        System.out.printf("\n");
        while(counter2 < asterisk){
            System.out.printf("%c",character);
            counter2++;
        }

    } // end method

    public static void main(String[] args) {
        Displaying_a_Square_of_Any_Character_6_19 print = new   Displaying_a_Square_of_Any_Character_6_19();
        print.squareOfAsterisks('#');
    }
}
