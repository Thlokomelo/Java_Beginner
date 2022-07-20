/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_6_5;

/*
Program uses the string codes PRESIDENTIAL, ELITE, DELUXE, SUPER, and STANDARD as the car wash
types, instead of the letters A through E.
*/

import java.util.Scanner;

public class CarWashStringApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();                             // string variable assigned to sc for input to be stored

        String details = "";

        switch (s.toUpperCase()) {                       //string variable converted to uppercase to avoid variation from user input                               
            case "PRESIDENTIAL":
                details += "\tNew Car Scent, plus . . . \n";
            case "ELITE":
                details += "\tTire Treatment, plus . . . \n";
            case "DELUXE":
                details += "\tLeather/Vinyl Treatment, plus . . . \n";
            case "SUPER":
                details += "\tWax, plus . . . \n";
            case "STANDARD":
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That�s not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
