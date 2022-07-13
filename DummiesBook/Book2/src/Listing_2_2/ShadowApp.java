/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_2_2;

public class ShadowApp
{		
    static int x;                             //class variable declared	
    public static void main(String[] args)
    {
        x = 5;	                              //class variable initialised
        System.out.println("x = " + x);
        int x;	                              //local variable declared (Shadow variable)
        x = 10;	                               //local variable initialised, shadows class variable
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " +  //shadow variable accessed specifying a class name/variable
            ShadowApp.x);	
    }	
}		

