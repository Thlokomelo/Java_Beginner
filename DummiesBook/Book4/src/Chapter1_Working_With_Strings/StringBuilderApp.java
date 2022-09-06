/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1_Working_With_Strings;

/*
Page: 391

Using the StringBuilder and StringBuffer Classes

This program uses the setCharAt method to directly replace any vowels it finds
with asterisks. That’s much more efficient than concatenating substrings
 */

import java.util.Scanner;

public class StringBuilderApp {

    static Scanner sc = new Scanner(System.in);      //accepts user input and stores it in the sc scanner

    public static void main(String[] args) {        
        System.out.print("Enter a string: ");       //print
        String s = sc.nextLine();                   //reads user input
        StringBuilder sb = new StringBuilder(s);    //StringBuilder instatiated
        int vowelCount = 0;                         //variable instatiated
        for (int i = 0; i < s.length(); i++) {      //For loop to check the length of the string to make sure that the index variable i doesn’t exceed the string length
            char c = s.charAt(i);                   //extracts each character of the inputed string
            if ((c == 'A') || (c == 'a')            //checks if each character is a vowel for both lower and uppercase
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                sb.setCharAt(i, '*');                 //sets the extarxted vowel to an aesteric *
            }
        }
        //Prints
        System.out.println();
        System.out.println(s);
        System.out.println(sb.toString());
    }
}
