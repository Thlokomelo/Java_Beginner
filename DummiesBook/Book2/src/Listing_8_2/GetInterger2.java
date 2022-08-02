/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_8_2;

/**
 * Program shows a version of the GetInteger method that uses a while loop to
 * avoid the exception.
 */
import java.util.*;                           //imports java.util package

public class GetInterger2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " + i);
    }

    public static int GetAnInteger()                //Contructor method
    {
        while (!sc.hasNextInt())                   //While-loop with conditional expresion which calls the hasNestInt method
        {                                           //to see whether next value is an integer. Whole-loop Repeats as long as value is false
            sc.nextLine();                         //calls nextLine to discard the bad data 
            System.out.print("That's not "         //Displays error message
                    + "an integer. Try again: ");
        }
        return sc.nextInt();                      //Gets the input from the user and returns it to the methods called
    }
}
