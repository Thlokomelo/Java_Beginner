/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

//programme counts even numbers to infinity, however contains a break that executes when it gets to 12

public class Dodecaphobia2 {

    public static void main(String[] args) {
        int number = 2;
        while (true) {
            if (number == 12) {              //if statement with conditional expression
                break;                       //breaks the loop if conditional statement is true
            }
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
