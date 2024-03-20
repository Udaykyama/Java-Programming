/*name:UDAY KYAMA 
date: March 6th 2022
program description: This form of code represents practice regarding parameters and return types,  as well as utilizing scanner classes 
self garde:100
*/
import java.util.*;
public class kyamaa
{
}
class Carbill
{
  /* the complete main method is given do not make any channges*/ 
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      description();
         
      calculateGasTravel(kb);
      for(int i = 1; i <= 60; i++)
         System.out.print("%");
      System.out.println();   
      calculateElectricTravel(kb);    
   }
   /*This method calculates the total cost charging the battery, Stops represents the number of the charges*/
   
   public static double chargeCost(int stops, double pricePerCharge)
   {
      return stops * pricePerCharge;  
   }
   
   /*This method caluclates the total monet spend on the gas to travel */
   public static double gasCost(double distance, double milesPerGallon, double costPerGallon)
   {
      return (distance / milesPerGallon) * costPerGallon;
   }
   
   /*This method caluclates the number of the stops needed to charge the battery.
    milePerCharge represents the number of the miles  driven with a fully charged battery*/ 
   public static int stops(double distance, double milePerCharge)
   {
      return (int) (distance / milePerCharge); 
   }
   /*This method caluclate the hours of travel taking your gas car*/
   public static double travelHoursGasCar(double distance , double speed)
   {
      return distance / speed; 
   }
   
   /*This method calculates the hours traveling using your electric car
   stops represenst the number of the times the car needs to be charged
   hoursPerStop represents the time it takes to fully charge your car
   distance represents the total distace traveled
   speed represents the speed of the car
   */
   public static double travelHoursWithElectricCar(int stops, double hoursPerStop, double distance, double speed)
   {
      return ((hoursPerStop * stops) + (distance/speed));    
      }
   
   /*This method calculates the cost and the time to travel with a gas car*/
   public static void calculateGasTravel(Scanner kb)
   {
      System.out.println("\nTraveling with a gas car\n");
      
      //prompt the user to enter the number of the miles to travel 
      System.out.print("Enter the total number of the miles you are traveling: ");
      
      double distance = kb.nextDouble(); //declare a varibale and read the user's input and outputs the distance
      System.out.print("Enter the speed of your car: "); //prompt the user to enter the speed
      double speed = kb.nextDouble();// declare a variable and read the user's input and outputs the speed
      System.out.print("Enter the miles per gallon: "); //prompt the user to enter the miles per gallon
      double milesPerGallon = kb.nextDouble();// declare a variable and read the user's input and outputs miles per gallon
      System.out.print("Enter the cost per gallon: ");//prompt the user to enter the cost per gallon
      double costPerGallon = kb.nextDouble(); // declare a variable and read the user's input and ouputs cost per gallon

   
      System.out.println("\nTraveling with your gas car: ");
      
      //display the hours of travel and the cost of the travel overrall
       double hours = travelHoursGasCar(distance,speed);//call the method travelHourWithGasCar with the proper parameters
       System.out.print("Hours  ");  
       System.out.println(hours);
     
      double cost = gasCost(distance, milesPerGallon, costPerGallon); //calls the method gasCar with the proper parameters
      System.out.print("Cost  ");
      System.out.println(cost);
      
            
   }
   public static void calculateElectricTravel(Scanner kb)
   {
   
      System.out.println("\nTraveling with an electric car\n");
      
      System.out.print("Enter the total number of the miles you are traveling: "); //prompt the user to enter total miles traveling
      double distance = kb.nextDouble();// declare a variable to read the input distance
      
      System.out.print("Enter the speed of your car: ");//prompt the user to enter the speed
      double speed = kb.nextDouble();   //declare a variable to read the speed
      
      System.out.print("Enter the number of miles that you can travel with a fully charged battery: "); //prompt the user to enter the miles that can be driven with a fully charged battery
      double milePerCharge = kb.nextDouble(); //declare a variable and read the input of milesPerCharge
      
      System.out.print("Enter the number of hours it takes to charge your car: "); //prompt the user to enter the number of the hours it takes to fully charge the car battery
      double hoursPerStop = kb.nextDouble(); //declares a variable and reads the input hoursPerStop
      
      System.out.print("Enter the amount of money you need each time to fully charge the battery of your car: "); //prompts the user to enter the cost per battery charge
      double pricePerCharge = kb.nextDouble(); //declares a variable and reads the input pricePerCharge
      
      
      
      
      
      
      
    
          System.out.println("\nTraveling with your electric car\n");
      int number_stop = stops(distance, milePerCharge);//calls the method stops with the proper parameters
      double hours = travelHoursWithElectricCar (number_stop, hoursPerStop, distance, speed); //calls the method travelHourswithElectric with the proper parameters
      System.out.print("Hours of travel ");
      System.out.println(hours);
      
      double cost = chargeCost (number_stop, pricePerCharge);  //calls the method chargeCost with the proper parameters
      System.out.print("Charge cost ");
      System.out.println(cost); 
      
                   
   }

/* displays the description of the code */
   public static void description()
   {
      for(int i = 1; i <= 80; i++)
         System.out.print("%");
      System.out.println();
      System.out.println("I can calculate the cost and the time to travel to your destination ");
      System.out.println("I will provide the information for both gas car and the electric car.");
      System.out.println("Just answer some simple questions"); 
      for(int i = 1; i <= 80; i++)
         System.out.print("%");
      System.out.println();
   
       
   }
    
}