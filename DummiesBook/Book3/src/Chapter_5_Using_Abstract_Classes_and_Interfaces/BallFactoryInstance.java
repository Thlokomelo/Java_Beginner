/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Using_Abstract_Classes_and_Interfaces;

/*
Page: 301

- Abstract Factory Pattern
  Program creates a Ball object, and lets the user choose whether to create
  a SoftBall or a BaseBall. To use the Abstract Factory pattern, you
  create a class (I call it BallFactory) that has a method named getBallInstance. This
  method accepts a String parameter that’s set to "BaseBall" if you want a BaseBall
  object or "SoftBall" if you want a SoftBall object.
 */

public class BallFactoryInstance {

    public static Ball getBall(String t) {
        if (s.equalsIgnoreCase("BaseBall")) {
            return new BaseBall();
        }
        if (s.equalsIgnoreCase("SoftBall")) {
            return new SoftBall();
        }
        return null;
    }
}

//creating a selected type of ball object:

Ball b = BallFactory.getBallInstance(userChoice);
