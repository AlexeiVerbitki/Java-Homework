package ch06;
import java.util.Scanner;

public class Temperature_Conversions_6_22 {


    public double celsius(double temperature) {
        return 5.0 / 9.0 * (temperature - 32);
    }

    public double fahrenheit(double temperature) {
        return 9.0 / 5.0 * temperature + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int trigger = 0;
        System.out.printf("Please choose a temperature: ");
        double temperature = input.nextDouble();

        while (trigger == 0) {
        System.out.printf("\nTo convert to Fahrenheit enter F;\tTo convert to Celsius enter F\n[F/N]: ");
        String select = input.next();

            switch (select) {
                case "F": case"f":
                    Temperature_Conversions_6_22 celsiusTO = new Temperature_Conversions_6_22();
                    System.out.printf("\n%.2f in celsius is %.2f in fahrenheit", temperature, celsiusTO.fahrenheit(temperature));
                    trigger=1;
                    break;

                case "C": case "c":
                    Temperature_Conversions_6_22 fahrenheitTO = new Temperature_Conversions_6_22();
                    System.out.printf("\n%.2f in fahrenheit is %.2f in celsius", temperature, fahrenheitTO.celsius(temperature));
                    trigger=1;
                    break;

                default:
                    System.out.printf("Your selection is not valid, please try again\n");
                    break;
            }

        }
    }
}
