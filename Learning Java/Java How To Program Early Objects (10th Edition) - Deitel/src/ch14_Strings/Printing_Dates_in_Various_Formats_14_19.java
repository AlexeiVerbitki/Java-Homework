package ch14_Strings;/*(Printing Dates in Various Formats) Dates are printed in several common formats. Two of
the more common formats are
04/25/1955 and April 25, 1955*/
import java.util.Scanner;

public class Printing_Dates_in_Various_Formats_14_19 {
    String[] months =  {"","January", "February","March","April","May","June","July","August","September","October","November", "December"};
    StringBuilder convertedMonth = new StringBuilder();

    public void convert (String date){
        String[] dateParts =date.split("/");
        String monthInLetters = months[Integer.parseInt(dateParts[0])];

        convertedMonth.append(monthInLetters).append(" ").append(dateParts[1]).append(", ").append(dateParts[2]);
        System.out.printf("Converted date: %s",convertedMonth);
    }

    public boolean dateIsCorrect(String dateInDigits){
        boolean validation;
        String[] dateParts =dateInDigits.split("/");

        if(dateInDigits.matches("\\d{2}/\\d{2}/\\d{4}") &&                   //format
                Integer.parseInt(dateParts[0])>0 && Integer.parseInt(dateParts[0])<=12 && //month
                Integer.parseInt(dateParts[1])>0 && Integer.parseInt(dateParts[1])<=31 && //day
                Integer.parseInt(dateParts[2])>1900)
            validation =true;
        else {
            validation = false;
            System.out.printf("\nThe date is in an incorrect format, please try again\n");
        }
        return validation;
    }

    public static void main(String[] args) {
        Printing_Dates_in_Various_Formats_14_19 date = new Printing_Dates_in_Various_Formats_14_19();
        Scanner input = new Scanner(System.in);

        int trigger=0;
        while(trigger==0) {
            System.out.printf("\nEnter your date in month/day/year format: \n");
            String inputDate = input.nextLine();
            if (date.dateIsCorrect(inputDate)){
                date.convert(inputDate);
                trigger=1;
            }
//            else {
//                System.out.printf("The date is in an incorrect format, please try again\n");
//            }
        }
    }
}

