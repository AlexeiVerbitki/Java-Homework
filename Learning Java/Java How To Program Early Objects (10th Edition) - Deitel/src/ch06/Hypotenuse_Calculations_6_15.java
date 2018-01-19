package ch06;
import java.util.Scanner;
public class Hypotenuse_Calculations_6_15 {

    public static double hypotenuse(double side1, double side2){

        double hypotenuse= Math.sqrt(Math.pow(side1,2)+ Math.pow(side2,2));
        return hypotenuse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        System.out.printf("Triangle\t Side 1\tSide 2\t hypotenuse\n");

            System.out.printf("1\t\t\t 3.0\t 4.0\t %03.1f\n",hypotenuse(3,4));
            System.out.printf("2\t\t\t 5.0\t12.0\t %03.1f\n",hypotenuse(5,12));
            System.out.printf("3\t\t\t 8.0\t15.0\t %03.1f\n",hypotenuse(8,15));

//            for (int i=1; i<4;i++){
//
//                System.out.printf("%d %-5.2f %-5.2f%-5.2f",i,side1=input.nextInt(),side2=input.nextInt(),hypotenuse(side1,side2));
//            }
        }
} // end class
