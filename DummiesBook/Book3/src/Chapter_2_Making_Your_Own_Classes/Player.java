/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 255 (Using setters and getters)

class that uses a private field named Health to indicate the health of a
player in a game program:
 */

public class Player {

    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        health = h;
    }
}


