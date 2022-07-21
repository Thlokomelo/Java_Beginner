/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_7_3;

//Program shows the benefits of methods that accept parameters. 

import java.util.Scanner;

public class GuessingGameMethod3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lets play a guessing game!");
        do {
            playARound(1, getRandomNumber(7, 12));            //method called to play one round of the game.    //The values for min and max are passed as literals
                                                             //method is called to set the value for the max to a random number from 7 to 12.
        } while (askForAnotherRound("Try again?"));
        System.out.println("\nThank you for playing!");
    }

    public static void playARound(int min, int max) {      
                                                           
        //DEclarations
        boolean validInput;                                   
        int number, guess;
        String answer;

        // Pick a random number
        number = getRandomNumber(min, max);      //method passes the values of min and max as parameters to set the range for the random numbers  
   

        // Get the guess
        System.out.println("\nI'm thinking of a number "
                + "between " + min + " and " + max + ".");
        System.out.print("What do you think it is? ");
        guess = getGuess(min, max);                      //method now passes the range of acceptable guesses to the getGuess method.

        // Check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong!"
                    + " The number was " + number);
        }
    }

    public static int getRandomNumber(int min, int max) {    //method specifies the min and max parameters
        return (int) (Math.random()
                * (max - min + 1)) + min;
    }

    public static int getGuess(int min, int max) {          //method accepts min and max parameters
        while (true) {
            int guess = sc.nextInt();
            if ((guess < min) || (guess > max)) {         //uses min and max values to validate the users input
                System.out.print("I said, between "
                        + min + " and " + max
                        + ". Try again: ");
            } else {
                return guess;                           //if the number is outside the acceptable range, the return stmnt is not executed
            }                                           //..and the while-loop repeats
        }
    }

    public static boolean askForAnotherRound(String prompt) {     //method accepts a variable to use as a string prompt
        while (true) { 
            
            //Declaration
            String answer;
            
            System.out.print("\n" + prompt + " (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
