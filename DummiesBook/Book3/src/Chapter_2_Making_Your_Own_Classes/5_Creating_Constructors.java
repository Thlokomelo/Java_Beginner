/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 259

Creating constructors

- A constructor is a block of code that’s called when an instance of an object is created.
- Difference between a constructor and a method:

  » A constructor doesn’t have a return type.
  » The name of the constructor must be the same as the name of the class.
  » Unlike methods, constructors are not considered to be members of a class.
  » A constructor is called when a new instance of an object is created. In fact, it’s the
    keyword that calls the constructor. After creating the object, you can’t call the constructor again.

    Example:

    public ClassName (parameter-list) [throws exception...]    //Public: Class can access the constructor
    {
      statements...
    }


- Creating basic constructors
  » Reason for coding a constructor is to provide initial values for class fields when you create the object.


  Examples 1:

   public Actor(String first, String last)
   {
     firstName = first;
     lastName = last;
   }

   Actor a = new Actor("Arnold", "Schwarzenegger");       //create an instance of the class by calling the constructor

 Examples 2:

   public Actor(String first, String last, boolean good)
   {
     firstName = first;
     lastName = last;
     goodActor = good;
   }

   Actor a = new Actor("Arnold", "Schwarzenegger", false);  //create an instance of the class by calling the constructor



- Creating default constructors
  » Is a free constructor provided by Java if you have not created one yourself. It does not accept parameters and 
    doesnt do anything but it allows your class to be instantiate.
    
- Calling other constructors
  » A constructor can call another constructor of the same class by using the special keyword thisas a method call.
    This technique is commonly used when you have several constructors that build on one another.

  Example:

  public class Actor
  {
    private String lastName;
    private String firstName;
    private boolean goodActor;
    public Actor(String last, String first)
  {
    lastName = last;
    firstName = first;
  }

  public Actor(String last, String first, boolean good)
  {
   this(last, first);     //calls above constructor to set the last and first name fields
   goodActor = good;      //field is set
  }
}


  NB: 
     » This keyword can only be used in the first line of the constructor body.
     » Each constructor can call only one other constructor, but you can chain
       constructors. If a class has three constructors, the first constructor can call the
       second one, which in turn calls the third one.
     » You can’t create loops in which constructors call one another.


 */

