/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_8_1;

/*
Program uses a method to get a valid integer from the user
If the user enters a value that isn’t a valid integer, the
catch block catches the error and forces the loop to repeat.
*/


import java.util.*;                             //import all the classes from the java.util package

public class GetInteger
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " + i);
    }
    public static int GetAnInteger()            //constructor
    {
        while (true)                          
        {
            try
            {
                return sc.nextInt();            //statement that gets the input from the user and returns it to the methods called
            }
            catch (InputMismatchException e)   // thrown when an invalid input is entered
            {
                sc.next();                     //called to disposes of incorrect input, then loop repeats
                System.out.print("That's not "
                    + "an integer. Try again: ");
            }
        }
    }
}
