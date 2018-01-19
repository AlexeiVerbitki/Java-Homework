package ch04;
import java.util.Scanner;
public class Tabular_Output_4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=1;
        System.out.printf("N\t10*n\t100*n\tt1000*n\n");
        while(counter <6) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\n", counter, counter * 10, counter * 100, counter * 1000 );
            counter++;
        }


    }
}
