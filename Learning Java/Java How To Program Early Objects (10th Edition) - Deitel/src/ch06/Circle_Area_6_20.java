package ch06;
import java.util.Scanner;
public class Circle_Area_6_20 {
    double r;

    public double circleArea (){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the circle radius: "); r  = input.nextDouble();
        double area= Math.PI*Math.pow(r,2);
        return area;
    }

    public static void main(String[] args) {
        Circle_Area_6_20 circle = new Circle_Area_6_20();
        System.out.printf("The area is: %.2f if a circle has a radius of: %.2f\n", circle.circleArea(), circle.r);
    }
}
// Hotel by uznati kakoi varian triemlimee. Varian snizu proshe
//no metod circleArea namnogo menee reusable. Etot varian ea napisal pervym.

//package PaulDitelJava.ch06;
//        import java.util.Scanner;
//public class Circle_Area_6_20 {
//
//    public static void circleArea (){
//        Scanner input = new Scanner(System.in);
//        System.out.printf("Enter the circle radius: "); double r  = input.nextDouble();
//        double area= Math.PI*Math.pow(r,2);
//        System.out.printf("The circle area with a radius of %.2f is: %.2f\n",r,area);
//    }
//
//    public static void main(String[] args) {
//        circleArea();
//    }
//}
