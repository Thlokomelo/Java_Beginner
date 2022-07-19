/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

//Programme uses a continue statement to skip the number 12 rather than stop counting altogether when it reaches 12

public class Dodecaphobia3 {

    public static void main(String[] args) {
        int number = 0;                       //class variable declared and initialised
        while (number < 20) {                 //loop with conditional expression
            number += 2;                      //adds 2 to number, before Continue!
            if (number == 12) {               //if statement with conditional expression, if no. = 12 skip & continue
                continue;                     //loop continues if expression is true and ....
            }
            System.out.print(number + " ");   //prints the number after 12
        }
        System.out.println();                 
    }
}
