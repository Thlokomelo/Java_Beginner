/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1_Working_With_Strings;

/*
Page: 383

Extracting substrings from a string

Here a program uses substrings to replace all the vowels in a string entered
by the user with asterisks.

 */

import java.util.Scanner;

public class MarkVowels {

    static Scanner sc = new Scanner(System.in);     //accepts user input

    public static void main(String[] args) {       //main method           
        System.out.print("Enter a string: ");      //print
        String s = sc.nextLine();                  //reads user input
        String originalString = s;                 //variable instatiated
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {      //checks the length of the string to make sure that the index variable i doesn’t exceed the string length
           char c = s.charAt(i);                    //extracts each character of the inputed string
            if ((c == 'A') || (c == 'a')            //checks if each character is a vowel for both lower and uppercase
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                String front = s.substring(0, i);   //consists of all the characters that appear before the vowel.      
                String back = s.substring(i + 1);   //consists of all the characters that appear after the vowel. 
                s = front + "*" + back;             //the s string is replaced by a new string that’s constructed from the front string, an asterisk, and the back string.
            }
        }
        
        //Prints
        System.out.println();                     
        System.out.println(originalString);
        System.out.println(s);
    }
}
