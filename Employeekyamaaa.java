/*
Name: UDAY KYAMA
Date: 05/08/2022
Program Description: This program prompts the  its calculate the salary of the salesperson working for the 
company. Every salesperson has a base salary and a commission that they get.
Self Grade: My grade for this assignment is 100 (excluing the self grade) because;
   - Proper naming conventions are followed.
   - Proper and consistent indentation is kept throughout the program.
   - Comments are provided to explain the function of the program and it's sub-sections.
   - The program compiles and runs as expected, and produce the exact output as shown in the assignment.
   - Self grade is provided.
*/

public class Employeekyamaaa

{
   private String first;
   private String last;
   private double baseSalary;
   private double commission;
   private double sales;

   public Employee(String f, String l, double pay, double comm)
   {
      first = f;
      last = l;
      baseSalary = pay;
      commission = comm;
   }
   public String getFirst()
   {
      return first;
   }
   public String getLast()
   {
      return last;
   }
   public double getBaseSalary()
   {
      return baseSalary;
   }
   public double getCommissions()
   {
      return commission;
   }

   public void setFirst(String f)
   {
      first = f;
   }
   public void setLast(String l)
   {
      last = l;
   }
   public void setBaseSalary(double salary)
   {
      baseSalary = salary;
   }
   public void setCommissions(double comm)
   {
      commission = comm;
   }
   public double calculateCommission()
   {
      double comms = ((sales * commission) / 100);
      return comms;
   }
   public double getMonthlyPaid()
   {
      double c = calculateCommission();
      double s = baseSalary;
      double p = c + s;
      return p;
   }
   public void sale(double amount)
   {
      sales = sales + amount;
   }
   public void reduceSale(double amount)
   {
      sales = sales - amount;
   }
   public String toString()
   {
      String s = "First name: " + first;
      s = s + "\nLast name: " + last;
      s = s + "\nBase Salary: " + baseSalary;
      s = s + "\nSales Amount: " + sales;
      return s;
   }
}

class EmployeeDriver
{
   public static void main(String[] args)
   {
      Employee e1 = new Employee("Alex","Rodriguze",3000,5);
      e1.sale(2000);
      e1.sale(5000);
      e1.sale(3000);
      e1.sale(1200);
      e1.reduceSale(5000);
      e1.sale(345);
      double commission1 = e1.calculateCommission();
      double pay1 = e1.getMonthlyPaid();
      System.out.println(e1.toString());
      System.out.println("The total commission you made is: " + commission1);
      System.out.println("Your total pay for this month is: " + pay1);
   }
}