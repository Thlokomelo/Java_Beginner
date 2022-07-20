/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_6_3;

/*
Program displays all the products you get when you
order a specific package. It works by testing the package codes in a switch statement
in reverse order
*/

import java.util.Scanner;

public class CarWashApp {

    static Scanner sc = new Scanner(System.in);                 //object created and assigned

    public static void main(String[] args) {                    //main method
        System.out.println("The car wash application!\n\n");    //prints msg with 2 line spaces after it
        System.out.print("Enter the package code: ");           //prints msg
        String s = sc.next();                                   //string variable assigned as sc, sc stores out user input
        char p = s.charAt(0);

        String details = "";                                     //string variable assigned to accept user input

        switch (p) {                                             //switch statement with expression, 
            case 'E':                                           //....followed by case constants that accomodate upper and lower case letters
            case 'e':
                details += "\tNew Car Scent, plus . . . \n";   //case displays using detail entered by user + a msg   
            case 'D':
            case 'd':
                details += "\tTire Treatment, plus . . . \n";
            case 'C':
            case 'c':
                details
                        += "\tLeather/Vinyl Treatment, plus . . . \n";
            case 'B':
            case 'b':
                details += "\tWax, plus . . . \n";
            case 'A':
            case 'a':
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
