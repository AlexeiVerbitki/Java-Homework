package ch04;
import java.util.Scanner;
public class Palindromes_4_30 {
    public static void main(String[] args) {
        int tensofthousands;
        int thousands;
        int hundsreds;
        int tens;
        int units;
        int stop = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your number: ");
        int x = input.nextInt();
//        int x = 12345;

            do {
                if (x<=99999 && x>=-99999) {
                    tensofthousands = x / 10000;
                    thousands = (x / 1000) % 10;
                    hundsreds = (x / 100) % 100 % 10;
                    tens = (x / 10) % 1000 % 100 % 10;
                    units = x % 10000 % 1000 % 100 % 10;
//                    System.out.printf("\ntensofthousands = %d\n", tensofthousands);
//                    System.out.printf("thousands = %d\n", thousands);
//                    System.out.printf("hundsreds = %d\n", hundsreds);
//                    System.out.printf("tens = %d\n", tens);
//                    System.out.printf("units = %d\n", units);

                    if (tensofthousands == units && thousands == tens) {
                        System.out.printf("\nThe entered number is a Palindromes, congrats!");
                        stop = 1;
                    } else
                        if (tensofthousands==0 && thousands==units && hundsreds==tens){
                            System.out.printf("\nThe entered number is a Palindromes, congrats!");
                            stop = 1;
                        }
                        else
                            if (tensofthousands==0 && thousands==0 && hundsreds==units){
                                System.out.printf("\nThe entered number is a Palindromes, congrats!");
                                stop = 1;
                            }
                            else
                                if (tensofthousands==0 && thousands==0 && hundsreds==0 && tens==units){
                                System.out.printf("\nThe entered number is a Palindromes, congrats!");
                                stop = 1;
                            }
                            else
                                if (tensofthousands==0 && thousands==0 && hundsreds==0 && tens==0){
                                    System.out.printf("\nThe entered number is a Palindromes, congrats!");
                                    stop = 1;
                                }
                        else  {
                        System.out.printf("\nThe number you entered is not a Palindromes, please try again");
                        System.out.printf("\nEnter your number again: ");
                        x = input.nextInt();
                    }
                }
                else {
                    System.out.printf("\nThe number must have not more than 5 digits, try again : ");
                    x = input.nextInt();
                }
            } while (stop == 0);
        }



    }

