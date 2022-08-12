/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 261
Declaring Constructors
 */

public class BadActorApp {
   
    public static void main(String[] args) 
    {
        //Actor a = new Actor(); // error: won't compile
        Actor a = new Actor("Arnold", "Schwarzenegger", false);
    }
}

class Actor {

    private String lastName;
    private String firstName;
    private boolean goodActor;

    public Actor(String last, String first) {
        lastName = last;
        firstName = first;
    }

    public Actor(String last, String first, boolean good) {
        lastName = last;
        firstName = first;
        goodActor = good;
    }
    
}
