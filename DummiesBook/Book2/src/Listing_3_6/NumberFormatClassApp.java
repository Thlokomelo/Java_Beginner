/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_3_6;

import java.text.NumberFormat;

public class NumberFormatClassApp {

    static NumberFormat cf                             //cf created as class variable, & assigned
            = NumberFormat.getCurrencyInstance();   

    public static void main(String[] args) {
        
        //Declarations
        printMyAllowance();
        printCostOfPaintBallGun();
    }

    public static void printMyAllowance() {              //method created
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance: "              //uses class variable (cf)
                + cf.format(myAllowance));
    }

    public static void printCostOfPaintBallGun() {       //method created
        double costOfPaintBallGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of Paint Ball Gun: "     //uses class variable (cf)
                + cf.format(costOfPaintBallGun));
    }
}
