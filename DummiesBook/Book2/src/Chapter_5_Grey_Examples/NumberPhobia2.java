/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

import java.util.Scanner;

public class NumberPhobia2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int number = 2;                                     
        String input = "Y";                                 //input string initialised
        
        while (input.equalsIgnoreCase("Y")) {              //while loop with conditional expression. programm will print until user enters No
            
            System.out.println(number + " ");                 //prints number
            System.out.print("Do you want to keep counting?"  //prints statement with options for the user
                    + " (Y or N)");
            
            input = sc.next();                                 //takes in input from the user
            number += 2;                                       //adds 2 to number
        }
        System.out.println("\nWhew! That was close.");         //prints closing statement when user breaks the loop
    }
}
