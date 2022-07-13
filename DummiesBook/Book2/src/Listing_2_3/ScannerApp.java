/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_2_3;

import java.util.Scanner;                     //allows you to use the Scanner class
//import java.util.*;                        //the entite class package can be imported like this

public class ScannerApp
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();	
        System.out.println("You entered " + x + ".");
    }
}

/*
static Scanner sc = new Scanner(System.in); :
- creates the Scanner variable as a class variable and creates the
Scanner object in the class variable initializer,
- To create a Scanner object, you use the new keyword followed by a call to the
Scanner class constructor.
- the Scanner class requires a parameter that
indicates the input stream that the input comes from
- System.in specify standard keyboard console input.
*/