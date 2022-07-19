/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_3_3;

public class MathFunctionsApp {

    public static void main(String[] args) {
        
        int a = 100;
        int b = -50;
        int c = 3;
        double x = 25.0;
        double y = 3.0;
        double z = 4.0;

        System.out.println("abs(b)    = " + Math.abs(b));        //Returns absolute value of int b
        System.out.println("cbrt(x)   = " + Math.cbrt(x));       //Returns Cube Root of y
        System.out.println("exp(z)    = " + Math.exp(z));        //Returns exponent of z
        System.out.println("hypot(y,z)= " + Math.hypot(y, z));   //Returns exponent of Z
        System.out.println("log(y)    = " + Math.log(y));        //Returns the natural logarithm of y
        System.out.println("log10(y)  = " + Math.log10(y));      //Returns the base 10 logarithm of y
        System.out.println("max(a, b) = " + Math.max(a, b));     //Returns the larger variable between a and b
        System.out.println("min(a, b) = " + Math.min(a, b));     //Returns the smaller variable between a and b
        System.out.println("pow(a, c) = " + Math.pow(a, c));     //Returns the value of a raised to the power of the c
        System.out.println("random()  = " + Math.random());      //Returns a random number that’s > or = to 0.0 but < 1.0
        System.out.println("signum(b) = " + Math.signum(b));     //Returns a number that represents the sign of b 
        System.out.println("sqrt(x)   = " + Math.sqrt(y));       //Returns the square root of y
    }
}


/* Signum:
-1.0 for negative numbers
1.0 for positive numbers
0.0 for Zero
*/