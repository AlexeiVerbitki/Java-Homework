package Fig10_04_09;
import java.util.Scanner;
public class Comparison {


    // main method begins execution of Java application
    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user
        int equals;
        equals =  number1==number2 ? number1: number2;
        //String one[]{}
    }
} // end class Comparison