/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_3_2;

import java.util.Scanner;            //Imports the java.util.Scanner for the program to use it to get input from user

public class CircleAreaApp {        //Public Class: Accessibe to other methods

    static Scanner sc = new Scanner(System.in);   //Creates the Scanner object and assigns it to a class variable so that it
                                                 //can be used in any method in the class.

    public static void main(String[] args) {
        System.out.println(
                "Welcome to the circle area calculator.");
        System.out.print("Enter the radius of your circle: ");    
        double r = sc.nextDouble();     //creates a double variable & uses the scanner to take in input from the user    
        double area = Math.PI * (r * r);
        System.out.println("The area is " + area);
    }
}
