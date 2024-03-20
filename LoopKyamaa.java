    /*
    1.UDAY KYAMA 
    2. 02-24-2022
    3. This is program is all about "GALLON CONVERTER" Which shows How to convert Gallons into liters by using different main method and static method.
    4. I myself declare as 100/100 points because i met all requirements by doing this program using all what i have learnt in the week module and i have used the formuals according to the values to get know how many pennies .
    */

    public class LoopKyamaa
    {
    public static final double Gallon=3.78;// This is a variable which shows one gallon == how many liters
    public static void main (String[] args)// Main method 
    {
    description();// Calling the method by description
    converstion(); // Clling the method by conversion        
    }// This shows the end of the main method by closing the bracket
    public static void description()// Another method which is outside the main method
    {
    for(int i=1;i<=50;i++)//for loop intializing the integer then we have given the condtion and increment 
    {
    System.out.print("%");// This helps us in printing the modulus sign on the top of output
    }
    System.out.println("");
    System.out.println("This program converts gallons into litter");// This line is going to show what's happening in the program
    System.out.println("One Gallon is equal to 3.78 litter");
    System.out.println("");
    for(int i=1;i<=50;i++)// for loop intializing the integer then condition and increment for the menu end
    {
    System.out.print("%");//It gives the ouptput for what to  be printed in the loop
    }
      
    }
    public static void converstion()// this shows the another method
    {
    System.out.println("");
    System.out.println("Gallon litter");// Introduction for this method 
    System.out.println("");

    for(int i=1;i<10;i++) // Intilizing the loop and giving its condition 
    {
    System.out.print(i +"   "+ (int) (i*Gallon)+"\n");// used the formula for converting it  i as gallon and i*gallon is litre
    } // end for the loop
     
    } // end for the method  
    }// end for the main class