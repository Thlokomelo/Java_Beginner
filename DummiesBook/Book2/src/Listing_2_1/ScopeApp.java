/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_2_1;

public class ScopeApp
{		
    static int x;                               //class variable declared
    public static void main(String[] args)
    {
        x = 5;                                  //class variable initialised                            
        System.out.println("main: x = " + x);
        myMethod();
    }
    public static void myMethod()
    {
        int y;                                  //local variable declared
        y = 10;	                                //local variable initialised
        if (y == x + 5)	
        {
            int z;                             //local variable declared
            z = 15;	                       //local variable initialised
            System.out.println("myMethod: z = " + z);
        }	
        System.out.println("myMethod: x = " + x);
        System.out.println("myMethod: y = " + y);
    }	
}