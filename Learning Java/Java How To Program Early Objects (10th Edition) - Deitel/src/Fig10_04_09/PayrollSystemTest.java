package Fig10_04_09;
// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest 
{
   public static void main(String[] args) 
   {
      // create subclass objects
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee(
         "Sue", "Jones", "333-33-3333", 10000, .06);
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
      Invoice Invoice1 = new Invoice("Shlang","Gardening", 2, 20.0);

//      System.out.println("Employees processed individually:");
//
//      System.out.printf("%n%s%n%s: $%,.2f%n%n",
//         salariedEmployee, "earned", salariedEmployee.earnings());
//      System.out.printf("%s%n%s: $%,.2f%n%n",
//         hourlyEmployee, "earned", hourlyEmployee.earnings());
//      System.out.printf("%s%n%s: $%,.2f%n%n",
//         commissionEmployee, "earned", commissionEmployee.earnings());
//      System.out.printf("%s%n%s: $%,.2f%n%n",
//         basePlusCommissionEmployee,
//         "earned", basePlusCommissionEmployee.earnings());

      // create four-element Employee array
//      Employee[] employees = new Employee[5];
       Payable [] arrayPayable = new Payable[5];

      // initialize array with Employees
       arrayPayable[0] = salariedEmployee;
       arrayPayable[1] = hourlyEmployee;
       arrayPayable[2] = commissionEmployee;
       arrayPayable[3] = basePlusCommissionEmployee;
       arrayPayable[4] = Invoice1;

      System.out.printf("Employees processed polymorphically:%n%n");
      
      // generically process each element in array employees
      for (Payable currentEmployee : arrayPayable)
      {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
      } // end for Cycle

      // get type name of each object in employees array
      for (int j = 0; j < arrayPayable.length; j++)
         System.out.printf("Employee %d is a %s%n", j,
                 arrayPayable[j].getClass().getSimpleName());
   } // end main
} // end class PayrollSystemTest
