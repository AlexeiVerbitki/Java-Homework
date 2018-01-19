package ch04;
import java.util.Scanner;
public class Exercise_4_17_Gas_Mileage {
    public static void main(String[] args) {
        int counter = 0;
        Scanner input = new Scanner(System.in);
        int mileage = 0;
        int gallons = 0;
        int totalMileage = 0;
        int totalGallons = 0;
        float average =0;

        do {
            counter++;
            System.out.printf("Enter the mileage for trip %d: ", counter);
            mileage = input.nextInt();
            System.out.printf("Enter the gallons for trip %d: ", counter);
            gallons = input.nextInt();
            float mph = mileage / gallons;
            System.out.printf("\nTrip %d was %d miles long and used %d gallons so the mph is %.2f\n", counter, mileage, gallons, mph);
            totalMileage = totalMileage + mileage;
            totalGallons = totalGallons + gallons;
            System.out.printf("------------------\n");

        } while (mileage >=0 || gallons >=0);

        System.out.printf("The total mileage is: %d\n", totalMileage-mileage);
        System.out.printf("The total gallons used are: %d\n", totalGallons-gallons);
        average = (float)(totalMileage-mileage) / (float)(totalGallons-gallons);
        System.out.printf("The average mph is: %f\n", average);

    }
}
