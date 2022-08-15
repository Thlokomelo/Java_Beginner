/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Using_Abstract_Classes_and_Interfaces;

/*
Page: 304
- Implementing an Interface

A class inheriting a superclass and implementing one or more interfaces

 */


public class Poker extends Game                        //Poker class inherits Game class
        implements Playable, CardGame {                //and implements 2 interfaces: Playable and CardGame
// inherits all members of the Game class
// must implement methods of the Playable
// and CardGame interfaces
}
