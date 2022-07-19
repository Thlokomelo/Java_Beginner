/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_3_5;

public class RoundingApp {
    public static void main(String[] args)
    {
        
        //Declarations and assignments
        double x = 29.4;
        double y = 93.5;
        double z = -19.3;

        //Returns the integer that is closest to the argument
        System.out.println("round(x) = " + Math.round(x));   
        System.out.println("round(y) = " + Math.round(y));
        System.out.println("round(z) = " + Math.round(z));
        System.out.println();
        
        //Returns the smallest double value that is an integer and is greater than or equal to the value of the argument.
        System.out.println("ceil(x) = " + Math.ceil(x));
        System.out.println("ceil(y) = " + Math.ceil(y));
        System.out.println("ceil(z) = " + Math.ceil(z));
        System.out.println();
        
        //Returns the largest double value that is an integer and is less than or equal to the value of the argument.        
        System.out.println("floor(x) = " + Math.floor(x));
        System.out.println("floor(y) = " + Math.floor(y));
        System.out.println("floor(z) = " + Math.floor(z));
        System.out.println();
        
        //Returns the double value that is an integer and is closest to the value of the argument
        System.out.println("rint(x) = " + Math.rint(x));
        System.out.println("rint(y) = " + Math.rint(y));
        System.out.println("rint(z) = " + Math.rint(z));
    }
} 

