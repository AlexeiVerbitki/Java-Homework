package Fig10_04_09;
import java.util.Scanner;
//2.5.2 Declaring Class Addition
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner to obtain input from the command window
        int number1;
        int number2;
        int sum;
        System.out.println("Enter first number");
        number1 = input.nextInt(); // read first number from user

        System.out.println("enter second number");
        number2 = input.nextInt(); // read second number from user

        sum = number1 + number2;
        System.out.printf("Sum = %d%n", sum);

    } // end method main
} // end class Addition