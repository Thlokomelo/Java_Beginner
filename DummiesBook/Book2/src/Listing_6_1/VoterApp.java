/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_6_1;

//Example of an else if statement program
//Program decode error codes in a Florida or Ohio voting machine.


import java.util.Scanner;

public class VoterApp {

    static Scanner sc = new Scanner(System.in);                //object created and assigned

    public static void main(String[] args) {                   //main method
        System.out.println("Welcome to the voting machine "    //prints msg
                + "error code decoder.\n\n"
                + "If your voting machine generates "
                + "an error code,\n"
                + "you can use this program to determine "
                + "the exact\ncause of the error.\n");
        System.out.print("Enter the error code: ");           //prints msg

        int err = sc.nextInt();                               //int variable assigned to SC and input converted to an int

        String msg;                                           //string variable declared
        if (err == 1) {                                       //if statement with conditional expression followed by else if statements
            msg = "Voter marked more than one candidate.\n"   
                    + "Ballot rejected.";
        } else if (err == 2) {
            msg = "Box checked and write-in candidate "
                    + "entered.\nBallot rejected.";
        } else if (err == 3) {
            msg = "Entire ballot was blank.\n"
                    + "Ballot filled in according to "
                    + "secret plan.";
        } else if (err == 4) {
            msg = "Nothing unusual about the ballot.\n"
                    + "Voter randomly selected for tax audit.";
        } else if (err == 5) {
            msg = "Voter filled in every box.\n"
                    + "Ballot counted twice.";
        } else if (err == 6) {
            msg = "Voter drooled in voting machine.\n"
                    + "Beginning spin cycle.";
        } else if (err == 7) {
            msg = "Voter lied to pollster after voting.\n"
                    + "Voter�s ballot changed "
                    + "to match polling data.";
        } else {
            msg = "Voter filled out ballot correctly.\n"
                    + "Ballot discarded anyway.";
        }
        System.out.println(msg);                                     //prints msg as per users input
    }
}
