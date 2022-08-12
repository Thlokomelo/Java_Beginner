/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 252

Compile Error: Cannot have 2 classes in 1 file.
 */

public class DiceGame1 {

    public static void main(String[] args) {
        Dice d = new Dice();
        d.roll();
    }
}

public class Dice {

    public void roll() {
// code that rolls the dice goes here
    }
}



