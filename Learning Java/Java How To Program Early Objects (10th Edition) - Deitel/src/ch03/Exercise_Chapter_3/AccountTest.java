package ch03.Exercise_Chapter_3;// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import ch03.fig03_08.Account;

import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args) 
   {
      ch03.fig03_08.Account account1 = new ch03.fig03_08.Account("Jane Green", 50.00);
      ch03.fig03_08.Account account2 = new ch03.fig03_08.Account("John Blue", -7.53);



      // display initial balance of each object
//
       displayAccount(account1);
       displayAccount(account2);

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);
      account1.deposit(depositAmount); // add to account1's balance

      // display balances
//      System.out.printf("%s balance: $%.2f%n",
//         account1.getName(), account1.getBalance());
//      System.out.printf("%s balance: $%.2f%n%n",
//         account2.getName(), account2.getBalance());
       displayAccount(account1);
       displayAccount(account2);

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

       displayAccount(account1);
       displayAccount(account2);

      System.out.printf("Enter the ammount you would like to withdraw from account1: ");
      double withdrawAmount = input.nextDouble();
      account1.withdraw(withdrawAmount);

      // display balances
//
       displayAccount(account1);
       displayAccount(account2);
   } // end main

      public static void displayAccount(Account accountToDisplay) {
          System.out.printf("%s balance: $%.2f%n",
                  accountToDisplay.getName(), accountToDisplay.getBalance());
   } // end method displayAccount
} // end class AccountTest