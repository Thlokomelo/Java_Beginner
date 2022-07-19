/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

public class EvenCounter2 {

    public static void main(String[] args) {
        int number = 2;
        do {                                 
            System.out.print(number + " ");
            number += 2;
        } while (number <= 20);                 //conditional expression always ends with a semicolon (;)
        System.out.println();
    }
}


//statements within a do-while loop always get executed atleast once whether the conditional expression statement is true or false