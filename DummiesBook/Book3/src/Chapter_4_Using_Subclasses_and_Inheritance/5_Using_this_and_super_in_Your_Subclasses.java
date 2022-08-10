/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;


/*
Page: 284

Using this and super in Your Subclasses

- this Keyword: used in reference to current classes

  » It provides a way to refer to the cur rent object instance. It’s often used to 
    distinguish between a local variable or a parameter and a class field with the same name.

Example:

public class Ball
{
  private int velocity;                   //Class field

  public void setVelocity(int velocity)
  {
    this.velocity = velocity;      //referenced class field assigned to velocity
  }
}

- super keyword: used in reference to base classes

  » You can also use the super keyword in the constructor of a subclass to explicitly
    call a constructor of the superclass.


Example:

public class Ball
{
   public void hit()

   {
     System.out.println("You hit it a mile!");
   }

   }
class BaseBall extends Ball
{
  public void hit()                                      //overrides main method of superclass

  {
     System.out.println("You tore the cover off!");     //prints message in subclass
      super.hit();                                      //references method in the superclass/base class 
                                                        //..and prints message in superclass 
  }
}

* Display on console:
  - You tore the cover off!
  - You hit it a mile!













































*/
