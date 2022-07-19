/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

import java.util.Scanner;

public class NumberPhobia {

    static Scanner sc = new Scanner(System.in);     //scanner object created and assigned to a class variable

    public static void main(String[] args) {        //main method created
        int number = 2;                             //int variable declared and assigned
        String input;                               //local variable declared
        while (true) {                              //loop with conditional expression
            System.out.println(number + " ");                   //prints number
            System.out.print("Do you want to keep counting?"    //prints statement with options for the user
                    + " (Y or N)");
            input = sc.next();                                  //takes in input from the user
            if (input.equalsIgnoreCase("N")) {                  //breaks the loop if user inserts "N", equalsIgnoreCase ignore case of input
                break;
            }
            number += 2;                                        //adds 2 to number
        }
        System.out.println("\nWhew! That was close.\n");        //prints closing statement when user breaks the loop
    }
}
