/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

//programme counts even numbers to infinity

public class CountForever {

    public static void main(String[] args) {
        int number = 2;                     //class variable declared & initialised
        while (true)                        //While loop with conditional expression
        {
            System.out.print(number + " ");    //Statement within while loop: Prints the number
            number += 2;                       //Statement within while loop: adds 2 to the number
        }
    }
}
