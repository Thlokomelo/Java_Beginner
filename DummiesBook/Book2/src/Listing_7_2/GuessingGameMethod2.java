/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_7_2;

/*
Program shows the benefits of using methods that return values. It uses four methods in
addition to main
*/

import java.util.Scanner;

public class GuessingGameMethod2 {

    static Scanner sc = new Scanner(System.in);           //object created and assigned

    public static void main(String[] args) {              //main method
        System.out.println("Let�s play a guessing game!");
        do {                                              //do-loop
            playARound();                                 //method called to play one round of the game
        } while (askForAnotherRound());                   //while-loop calling a method to determine if user wants to play another round
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() {               //method plays one round of the guessing game. It doesn’t return a value

        //Declarations
        boolean validInput;
        int number, guess;
        String answer;

        // Pick a random number
        number = getRandomNumber();          //calls the method to get a random number between 1 and 10....
                                             //The value returned by this methodis stored in the numbe

        // Get the guess
        System.out.println("\nI�m thinking of a number "
                + "between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();                 //method called to get the user’s guess. This method returns a number between 1 and 10, which is stored in the guess variable.


// Check the guess
        if (guess == number) {
            System.out.println("You�re right!");
        } else {
            System.out.println("You�re wrong!"
                    + " The number was " + number);
        }
    }

    public static int getRandomNumber() {        //method returns a random number between 1 and 10  makes sure that it is between...     
                                                 //1 and 10, and returns the guess if it’s within the acceptable range
        return (int) (Math.random() * 10) + 1;   //random number is calculated using the Math.random method

    }

    public static int getGuess() {                         //method gets the user’s guess, which returns an int value
        while (true) {                                     ////method uses a while loop, which exits only when the user enters a number between 1 and 10
            int guess = sc.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 and 10. "
                        + "Try again: ");
            } else {
                return guess;
            }
        }
    }

    public static boolean askForAnotherRound() {    //method asks the user to play another round and returns a boolean value...
                                                    // to indicate whether the user wants to continue playing
        while (true) {                              //while-loop which exits only when the user enters a valid Y or N response.  
           
            //Declaration
            String answer;
            
            System.out.print("\nPlay again? (Y or N) ");
            answer = sc.next();                         
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
