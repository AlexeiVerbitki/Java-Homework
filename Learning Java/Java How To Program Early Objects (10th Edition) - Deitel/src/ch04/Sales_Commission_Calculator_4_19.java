package ch04;
import java.util.Scanner;
public class Sales_Commission_Calculator_4_19 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0;
        double itemPrice = 0;
        double totalValue=0;


            System.out.printf("Item\t\tValue\n");
            while (itemPrice >=0){
                counter++;

                System.out.printf("%d\t\t\t",counter);
                itemPrice = input.nextDouble();
                System.out.printf("commission = %.2f%n", itemPrice * 0.09);
                if (itemPrice >0)
                    totalValue+= itemPrice;
            }
            double commission = totalValue * 0.09;
            double totalPay = commission + 200;
            System.out.printf("The total value of sales this month is: %.2f\n", totalValue);
            System.out.printf("The total commission of sales this month is: %.2f\n", commission);
            System.out.printf("The total pay for  this month is: %.2f\n", totalPay);


    }
}
