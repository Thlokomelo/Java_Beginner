/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_6_4;

/*
Program shows a version of the car wash application that uses 
a technique to prevent fall throughs
in the switch statement in order to accomodate upper and lower case letters
*/

import java.util.Scanner;

public class CarWashApp2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        char p = s.charAt(0);

        String details = "";
        switch (p) {                                                  //switch statement with expression
            case 'E':                                                 //followed by case contants that call package methods to execute
            case 'e':
                details = packageE() + packageD() + packageC()
                        + packageB() + packageA();
                break;                                                 //break used to prevent fall throughs
            case 'D':
            case 'd':
                details = packageD() + packageC()
                        + packageB() + packageA();
                break;
            case 'C':
            case 'c':
                details = packageC() + packageB()
                        + packageA();
                break;
            case 'B':
            case 'b':
                details = packageB() + packageA();
                break;
            case 'A':
            case 'a':
                details = packageA();
                break;
            default:
                details = "That�s not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }

    public static String packageA() {                         //separate methods created for each package to prevent fall throughs
        return "\tWash, vacuum, and hand dry.\n";
    }

    public static String packageB() {
        return "\tWax, plus . . . \n";
    }

    public static String packageC() {
        return "\tLeather/Vinyl Treatment, plus . . . \n";
    }

    public static String packageD() {
        return "\tTire Treatment, plus . . . \n";
    }

    public static String packageE() {
        return "\tNew Car Scent, plus . . . \n";
    }
}
