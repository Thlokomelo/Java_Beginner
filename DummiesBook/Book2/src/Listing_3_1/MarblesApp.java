/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_3_1;

import java.util.Scanner;  //Imports the java.util.Scanner for the program to use it to get input from user

public class MarblesApp {

    static Scanner sc = new Scanner(System.in);	 //Creates the Scanner object and assigns it to a class variable so that it

    public static void main(String[] args) //can be used in any method in the class.
    {
        // declarations	
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;

        // get the input data	
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();

        // Calculates the number of marbles to give to each child by using integer division, which discards the remainder.
        marblesPerChild = numberOfMarbles / numberOfChildren;

        //Calculates the number of marbles left over.
        marblesLeftOver = numberOfMarbles % numberOfChildren;

        //Print the results.
        System.out.println("Give each child "
                + marblesPerChild + " marbles.");
        System.out.println("You will have "
                + marblesLeftOver + " marbles left over.");
    }

}
