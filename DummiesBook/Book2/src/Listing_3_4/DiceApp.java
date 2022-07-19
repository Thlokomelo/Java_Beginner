/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_3_4;

public class DiceApp {

    public static void main(String[] args) {
        int roll;                                                 //variable declared
        String msg = "Here are 100 random rolls of the dice:";   //String msg is declared and assigned
        System.out.println(msg);                                 //msg is printed
        for (int i = 0; i < 100; i++) {       //for statement causes the statements in its body to be executed 100 times
            roll = randomInt(1, 6);          //statement calls the randomInt method, specifying 1 and 6 as the range for the random integer to generate. 
                                             // The resulting random number is assigned to the roll variable
            System.out.println(roll + " ");    //random number is printed followed by a space

        }
        System.out.println();
    }

    public static int randomInt(int low, int high) {  //method returns an int value & accepts 2 int args
        int result = (int) (Math.random()             //This expression converts the random double value to an integer between low and high.
                * (high - low + 1)) + low;
        return result;                                //The return statement sends the random number back to the statement that called the randomInt method.

    }
}
