/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

//programme counts even numbers that are <=20, but breaks the loop when it gets to 12

public class Dodecaphobia {

    public static void main(String[] args) {
        int number = 2;                           //class variable declared & initialised
        while (number <= 20) {                    //While loop with conditional expression
            if (number == 12) {                   //if statement with conditional expression
                break;                            //breaks the loop if conditional statement is true
            }
            System.out.print(number + " ");     //Statement within while loop: Prints the number
            number += 2;                        //Statement within while loop: adds 2 to the number
        }
        System.out.println();                   //prints the result and repeats the loop until number reaches 10
    }
}
