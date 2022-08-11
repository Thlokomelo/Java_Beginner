/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 287

Using Final

- The Final keyword in Java has 3 purposes:

  » Creates constant variables
  » Creates final methods
  » Creates final classes

- Final Methods

  » A method that cannot be overriden by a subclass.

Example:

public class SpaceShip
{
public final int getVelocity()

  {
    return this.velocity;
  }
}


- Final Classes

 » A class that cant be used as a base class.
 » All of its methods are also final and cannot be used by other classes.

Example:

public final class BaseBall
{
// members for the BaseBall class go here
}









*/