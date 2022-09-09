/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1_Working_With_Strings;

/*
Page: 386

Replacing parts of a string

This program gets a line of text from the user and then replaces all occurrences
of the string cat with dog.

 */

import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {          //main method
        Scanner sc = new Scanner(System.in);          //accepts user input
        System.out.print("Enter a string: ");         //prints
        String s = sc.nextLine();                     //reads user input
        s = s.replaceAll("cat", "dog");               //replace method uesed to replace the word "cat/s" with the word "dog/s"
        System.out.println(s);                        //prints new string
    }
}
