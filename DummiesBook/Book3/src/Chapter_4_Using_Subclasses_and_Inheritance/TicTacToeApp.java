/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 293
Polymorphism

This class calls on methods in the player class in order to play the game
Console Result: 
Basic player says: I'll take the first open square!
Better player says: I'm looking for a good move...

 */


public class TicTacToeApp {

    public static void main(String[] args) {
        Player p1 = new Player();         //superclass
        Player p2 = new BetterPlayer();   //subclass
        playTheGame(p1, p2);
    }

    public static void playTheGame(Player p1, Player p2) {
        p1.move();     //calls on superclass method
        p2.move();     //call on sublass method
    }
}
