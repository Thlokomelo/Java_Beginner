/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_8_3;

/**
 Program shows a contrived but helpful example that demonstrates how to use
the finally clause
 */

public class CrazyWithZeros {

    public static void main(String[] args) {
        try {                                             
            int answer = divideTheseNumbers(5, 0);       
        } catch (Exception e) {                              //catches any exceptions thrown by line 16 (Previous line)
            System.out.println("Tried twice, "
                    + "still didn't work!");
        }
    }

    public static int divideTheseNumbers(int a, int b)
            throws Exception {                              //method declares that it throws an Exception
        int c;
        try {
            c = a / b;                                         //first attempt to divide the numbers
            System.out.println("It worked!");                 //Excecuted if first attempt is successful
        } catch (Exception e) {                               //Catches the exception
            System.out.println("Didn't work the first time.");
            c = a / b;                                        //second attempt to divide the numbers
            System.out.println("It worked the second time!");
        } finally {                                           //Executed no matter what happens, cleans up any mess in the program e.g. the second attempt
            System.out.println("Better clean up my mess.");
        }
        System.out.println("It worked after all.");          //executed if the division worked
        return c;                                            //returns the answer
    }
}
