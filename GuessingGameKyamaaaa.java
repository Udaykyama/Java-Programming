/*
Name: UDAY KYAMA
Date: 04/10/2022
Program Description: This program prompts the user to enter a minimum value and a maximum value. Then generates a random number within the user input limits and the user has to guess it.
To assist the user, the program will notify whether the entered value is lower or higher than the randomly generated number. When the user correctly guesses the number, the program will
show the number of tries it took to get the correct answer.
Self Grade: My grade for this assignment is 100 (excluing the self grade) because;
   - Proper and consistent indentation is kept throughout the program.
   - Comments are provided to explain the function of the program and it's sub-sections.
   - The program compiles and runs as expected, and produce the exact output as shown in the assignment.
   - Self grade is provided.
*/

import java.util.*;

public class GuessingGameKyamaaaa
{  
   /*
   Main method
   */
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
   
      menu();
      data(kb);
   }
   
   /*
   This method asks the user for a low value and a high value, until the user enters valid values the process is repeated. Then the "operation" method is called.
   Finally the user is asked whether he/she wants to play again.
   */
   public static void data(Scanner kb)
   {  
      int tries = 0;
     
      String replay = "yes"; 
       
      while (replay.equalsIgnoreCase("yes"))
      {         
         System.out.print("Enter a low value: ");    
         
         int low = kb.nextInt();
          
         System.out.print("Enter a high value: ");
         
         int high = kb.nextInt();
          
         while (high < low) //Will repeat until the user enter values that matches the condition.
         {
            System.out.println("You entered incorrect min or max values");
            
            System.out.print("Enter a low value: ");
            
            low = kb.nextInt();
            
            System.out.print("Enter a high value: ");
            
            high = kb.nextInt();
         
         }
         
         operation(kb, low, high);
                     
         System.out.print("\nDo you want to play again? ");
         
         replay = kb.next();
         
         System.out.println();
      }
       
   }
   
   /*
   This method should display a description of the game.
   */
   public static void menu()
   {   
      System.out.println("Hello Player! Let's play a little game. Your mission, should you choose to accept it, is to guess the number I'm thinking of." + 
         "\nYou may enter a minimum and a maximum value, the number I am going to think of will be inbetween those limits." + 
         "\nIncluding the LIMITS themselves. Once started I will inform you whether my number is higher or lower than your guess." + 
         "\nOnly after you get it right, you can end this game.");
      System.out.println();
      
      for (int i = 0; i <= 124; i++)
         System.out.print("-");
      System.out.println();
      System.out.println(); //For extra space    
   }
   
   /*
   This method accepts the three given paramters , generates a random number between 
   low and high. keeps asking the user to enter a guess until the user makes a correct guess.
   */
   public static void operation(Scanner kb, int low, int high)
   {
      Random rand = new Random(); 
      
      int number = rand.nextInt(high - low +1) + low;
      
      int count = 0; 
      
      System.out.println("\nI'm thinking of a number between " + low + " and " + high+ " ...");
      
      int guess = 0;
      
      while (guess != number) //Will repeat until the user inputs the correct number.
      {
         count++;
          
         System.out.print("\nYour guess? :");
          
         guess = kb.nextInt();
          
         if (guess < number)
         {
            System.out.println("Higher");
         }
         else if (guess > number)
         {
            System.out.println("Lower");   
         }   
      }
      
      System.out.println("\nYou got it right in " + count + " guesses");
   }
}