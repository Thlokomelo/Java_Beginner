/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1_Working_With_Strings;

/*
Page: 381

Extracting characters from a string

A program that uses the charAt method to count the number
of vowels in a string entered by the user.
 */
import java.util.Scanner;

public class CountVowels {

    static Scanner sc = new Scanner(System.in);     //accepts user input

    public static void main(String[] args) {        //main method
        System.out.print("Enter a string: ");       //print
        String s = sc.nextLine();                   //reads user input
        int vowelCount = 0;                         //variable instatiated
        for (int i = 0; i < s.length(); i++) {      //checks the length of the string to make sure that the index variable i doesn’t exceed the string length
            char c = s.charAt(i);                   //extracts each character of the inputed string
            if ((c == 'A') || (c == 'a')            //checks if each character is a vowel for both lower and uppercase
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                vowelCount++;                        //increments the vowelCount by 1
            }
        }
        System.out.println("That string contains "   //prints the vowelCount
                + vowelCount + " vowels.");
    }
}
