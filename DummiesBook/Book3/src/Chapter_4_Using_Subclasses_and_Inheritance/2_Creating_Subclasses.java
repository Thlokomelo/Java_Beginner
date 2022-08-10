/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 281

Creating SubClasses

- To create a subclass the extends (inherits) keyword on the declaration for the subclass is used:

   » Example:Class named Ball defines a basic ball. subclass named BouncingBall adds the ability to bounce.

public class BouncingBall extends Ball
{
   // methods and fields that add the ability to bounce
   // to a basic Ball object:
   public void bounce()
   {
      // the bounce method
    }
}
}

NB:
   » A subclass inherits all the members from its base class. (Constructors are not memers, they are not inherited)
   » The visibility (public or private) of any members inherited from the base class 
     is the same in the subclass.
   » You can override a method by declaring a new member with the same signature in the subclass.
   » A special type of visibility called protected hides fields and methods from other classes but
     makes them available to subclasses.
   » You can add more methods or fields or protected, to a subclass private.














*/
