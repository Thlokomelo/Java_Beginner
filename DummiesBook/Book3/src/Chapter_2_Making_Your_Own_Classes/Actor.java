/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 262
Calling other constructors

 */

public class Actor {

    private String lastName;
    private String firstName;
    private boolean goodActor;

    public Actor(String last, String first) {
        lastName = last;
        firstName = first;
    }

    public Actor(String last, String first, boolean good) {
        this(last, first);                     //this keyword used to call another constructor
        goodActor = good;
    }
}
