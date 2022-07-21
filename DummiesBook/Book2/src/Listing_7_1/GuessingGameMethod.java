/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_7_1;

// Program places the body of the main while loop in a separate method.


import java.util.Scanner;

public class GuessingGameMethod {                           

    static Scanner sc = new Scanner(System.in);                    //SC object created and assigned 
    static boolean keepPlaying = true;                             //boolean object created and assigned as true

    public static void main(String[] args) {                      //main method
        System.out.println("Lets play a guessing game!");

        while (keepPlaying) {                                     //while loop with expression
            playARound();                                         //method called
        }
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() {                             //method created
        
        //Declarations
        boolean validInput;                                       
        int number, guess;
        String answer;

        // Pick a random number
        number = (int) (Math.random() * 10) + 1;                //number assigned using a math.random method to calculate a random number
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");

        // Get the guess
        System.out.print("What do you think it is? ");
        do {                                                   //do-while loop
            guess = sc.nextInt();                              //guess assigned as sc to store input and nextInt method used to get input from the user 
            validInput = true;                                 //validInput assigned as true
            if ((guess < 1) || (guess > 10)) {                 //if statement with conditional expression
                System.out.print("I said, between 1 "
                        + "and 10. Try again: ");
                validInput = false;                            //validInput assigned as false, if conditions above are met
            }
        } while (!validInput);                                 //while loop with expression

        // Check the guess
        if (guess == number) {                                 //if statement with expression
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong!"
                    + " The number was " + number);
        }
        // Play again?
        do {                                                   //do-while loop
            System.out.print("\nPlay again? (Y or N)");
            answer = sc.next();                                //answer assigned as sc
            validInput = true;                                 //validInput assigned as true
            if (answer.equalsIgnoreCase("Y")); else if (answer.equalsIgnoreCase("N")) {
                keepPlaying = false;
            } else {
                validInput = false;                               //validInput assigned as true
            }
        } while (!validInput);                                    //takes you back to this while-loop
    }
}
