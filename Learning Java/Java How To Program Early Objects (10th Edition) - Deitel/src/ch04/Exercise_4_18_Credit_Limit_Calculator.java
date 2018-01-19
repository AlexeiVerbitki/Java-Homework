package ch04;

public class Exercise_4_18_Credit_Limit_Calculator {
    String account;
    double itemsValue;
    double beginingBalance;
    double credit;
    double allowedCredit;
    double endBalance;

    Exercise_4_18_Credit_Limit_Calculator(String account, double itemsValue, double beginingBalance, double credit, double allowedCredit ) {
        this.account = account;
        this.itemsValue = itemsValue;
        this.beginingBalance = beginingBalance;
        this.credit = credit;
        this.allowedCredit = allowedCredit;
    }
        public void displayBlance(){
//        endBalance = allowedCredit - (beginingBalance + itemsValue + credit);
            endBalance = beginingBalance + itemsValue - credit;
        if (allowedCredit >= endBalance)
            System.out.printf("Your projected balance at the end of the month is : %.2f",endBalance);
        else
            System.out.printf("Credit limit exceeded");

    }


    public static void main(String[] args) {
            Exercise_4_18_Credit_Limit_Calculator credit = new Exercise_4_18_Credit_Limit_Calculator(
                    "Mrs. Dorsey", 5000,1000,3000,10000);
            credit.displayBlance();


    }
}
