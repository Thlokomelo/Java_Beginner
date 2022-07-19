/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

//Programme counts from 1 to 10 and 10 to 1 at the same time, using two counter variables:

public class CountBothWays {

    public static void main(String[] args) {
        int a, b;                                   //class variables declared
        for (a = 1, b = 10; a <= 10; a++, b--) {    //for loop with more than one ForInt, and ForUpdate expressions
            System.out.println(a + " " + b);        //prints more than one result
        }
    }
}
