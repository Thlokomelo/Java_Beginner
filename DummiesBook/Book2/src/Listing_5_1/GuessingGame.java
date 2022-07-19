/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_5_1;

/*
program implements a simple guessing game in which the computer picks a number
between 1 and 10, and you have to guess the number

*/

import java.util.Scanner;

public class GuessingGame {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true;                        //Defines a boolean variable named keepPlaying that is initialised to true
        System.out.println("Let's play a guessing game!"); 
        while (keepPlaying) {                              //while loop with conditional expression
            boolean validInput;                            //Defines a boolean variable used to indicate whether the user’s input is valid

            int number, guess;                             //while loop statement: int variables declared
            String answer;                                 ////while loop statement: string variable declared
            
            // Pick a random number
            number = (int) (Math.random() * 10) + 1;
            
            // Get the guess
            System.out.println("\nI'm thinking of a number "
                    + "between 1 and 10.");
            System.out.print("What do you think it is? ");
            do {
                guess = sc.nextInt();                        //takes input from user
                validInput = true;                           //sets the input to true if valid
                if ((guess < 1) || (guess > 10)) {           //compares the user’s guess with the computers number
                    System.out.print("I said, between 1 and 10. "
                            + "Try again: ");
                    validInput = false;                      //sets the input to false if not valid
                }
            } while (!validInput);                           //gets a valid guess from the user
            
            // Check the guess
            if (guess == number) {
                System.out.println("You�re right!");
            } else {
                System.out.println("You�re wrong! "
                        + "The number was " + number);
            }
            
            // Play again?
            do {
                System.out.print("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y")); else if (answer.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                } else {
                    validInput = false;
                }
            } while (!validInput);
        }
        System.out.println("\nThank you for playing!");
    }
}
