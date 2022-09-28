package Chapter_2_Using_Regular_Expressions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thlok
 */

import java.util.regex.*;
import java.util.Scanner;

public final class Reg {

    //Declarations
    static String r, s;
    static Pattern pattern;
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;
    
    
    private static Scanner sc                            //Intance of the scanner class is created
            = new Scanner(System.in);

    public static void main(String[] args) {             //main method
        System.out.println("Welcome to the "             //print
                + "Regex Tester\n");
        do {                                             //loop
            do {                                         //inner loop
                System.out.print("\nEnter regex:  ");   //print
                r = sc.nextLine();                      //object accepts user input
                validRegex = true;                      //object is set to true
                try {                                   //try block
                    pattern = Pattern.compile(r);       //object i assigned pattern.compile and the user input is passed
                } catch (Exception e) {                  //catch block with an Exception e
                    System.out.println(e.getMessage());  //print exception message
                    validRegex = false;                  //set the object to false
                }
            } while (!validRegex);                        //loop
            doneMatching = false;                        //set the object to false
            while (!doneMatching) {                      //inner loop
                System.out.print("Enter string: ");      //Print
                s = sc.nextLine();                       //accept user input
                if (s.length() == 0) {                   //statement
                    doneMatching = true;                 // set object to true
                } else { 
                    matcher = pattern.matcher(s);       //assign object to user input
                    if (matcher.matches()) {            //statement
                        System.out.println("Match.");   //print
                    } else {
                        System.out.println(
                                "Does not match.");  //print
                    }
                }
            }
        } while (askAgain());                       //loop
    }

    private static boolean askAgain() {            //method
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
