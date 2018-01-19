package ch06;
import java.util.Scanner;
public class Parking_Charges_6_8 {
    double total;
    int car=1;

    public double getTotal() {
        return total;
    }

    public int getCar() {
        return car;
    }

    public void calculateCharges(double hours) {
        if (hours<24) {
            if (hours != -1) {
                double parkingCost = 2;
                if (hours > 3 && hours < 24)
                    parkingCost += (int) hours * 0.5;
                if (hours == 24)
                    parkingCost = 10;
                total += parkingCost;
                car++;
                System.out.printf("Car %d owes $%.2f\n", getCar(), parkingCost);

            }
        }
        else{
            System.out.printf("You can't have more than 24 hours");
        }
    }

    public static void main(String[] args) {
        double hours=0;

        Parking_Charges_6_8 parking = new Parking_Charges_6_8();
        Scanner input = new Scanner (System.in);

        while(hours!=-1) {

            System.out.printf("\nEnter the amount of parking hours for car %d: ", parking.getCar());
            hours = input.nextDouble();
            parking.calculateCharges(hours);
        }
        System.out.printf("-----------------\nThe total for yesterday for %d cars is: $%.2f", parking.getCar()-1, parking.getTotal());
    }
}
