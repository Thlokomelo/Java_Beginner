/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 284

Protecting Your Members

- The private and public keywords are used to protect members of a class.
- public members of the superclass are available to the sub class,
  but the private members aren’t. They do become part of the derived class,
  but you can’t access them directly in the derived class.
- A member with protected visibility is available to subclasses but not
  to other classes.

Example:

public class Ball
{
   private double weight;
   protected double getWeight()                //protected access: visible to the subclass

  {
    return this.weight;
  }

  protected void setWeight(double weight)       //method in superclass (protected access: visible to subclass)
  {
    this.weight = weight;
  }

  }
public class BaseBall extends Ball             //subclass
{
   public BaseBall()

   {
     setWeight(5.125);
    }
}

























*/
