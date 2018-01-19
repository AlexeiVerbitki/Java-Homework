package Fig10_04_09;
import java.util.Scanner;
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.setName(name);
        this.balance=balance;
    }
    public Account(){
        this.name = "";
        this.balance = 0.0;

    }

    public String getName(){
        return this.name;
    }

    void setName(String name){
        if (name=="John" ) System.out.println("\nJohn is not a permitted name");
        else this.name=name;
    }

    public double getBalance() {
        return balance;
      }
      void setBalance(double balance) {
          if (balance > 0.0)
              this.balance = balance;
      }

      void deposit (double DepositAmount){
        if( DepositAmount > 0.0) {
            balance = DepositAmount + balance;
                }
        else System.out.println("\nTo withdraw money, please use another menu");
    }
        void withdraw (double withdrawAmount){
            if (withdrawAmount < this.balance) {
                balance -= withdrawAmount;
            }  else System.out.println("Withdrawal amount exceeded account balance.");
        }

}// end Account class
 class AccountTest{
     public static void main(String[] args) {
         Account account = new Account("",100);
         Scanner input = new Scanner(System.in);
//         System.out.println("The current account name is: " + account.getName());
         System.out.print("Enter the account name: ");
         String accountName = input.nextLine();
         account.setName(accountName);

         System.out.println("The account "+ account.getName() + " current balance is: "+ account.getBalance());

         System.out.print("Enter the amount you would like to deposit: ");

         double amountToDeposit = input.nextInt();
         account.deposit(amountToDeposit);

         System.out.print("Enter the amount you would like to withdraw: ");
         double amountToWidraw = input.nextInt();
         account.withdraw(amountToWidraw);


         System.out.println("\nThe account name was set to: " + account.getName());
         if (amountToDeposit > 0) {
                          System.out.println("\nYour have deposited: " + amountToDeposit);
         } else {
             System.out.println("You can not deposit a negative amount: ");
         }
         double a = account.getBalance();
         if (amountToWidraw < account.getBalance()){
             System.out.println("You have withdrawn: " + amountToWidraw);
         }
         else System.out.println("Your withdrawal was not succesful");

         System.out.println("\nYour total current deposit is: " + account.getBalance());


     }

 } // end class AccountTest