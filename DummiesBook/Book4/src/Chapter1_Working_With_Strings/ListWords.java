package Chapter1_Working_With_Strings;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Splitting a string

Page: 385

This program accepts a string from the user,
breaks it into separate words, and then displays the words on separate lines
 */

import java.util.Scanner;

public class ListWords {

    static Scanner sc = new Scanner(System.in);   //accepts use input

    public static void main(String[] args) {     //main method
        System.out.print("Enter a string: ");    //Print
        String s = sc.nextLine();                //reads user input
        String[] word = s.split("\\s+");         //takes input and puts it into an array and uses the split method to split the string wherever theres is an occurance of whitespace/s
        for (String w : word) {                  //for loop to print split data
            System.out.println(w);
        }
    }
}
