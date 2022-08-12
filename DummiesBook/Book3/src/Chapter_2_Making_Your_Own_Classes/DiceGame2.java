/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 252

Solution to compile error in Dice Game 1. Public keyword removed from second class in the file.

 */

public class DiceGame2 {

    public static void main(String[] args) {
        Dice d = new Dice();
        d.roll();
    }
}

class Dice {

    public void roll() {
// code that rolls the dice goes here
    }
}
