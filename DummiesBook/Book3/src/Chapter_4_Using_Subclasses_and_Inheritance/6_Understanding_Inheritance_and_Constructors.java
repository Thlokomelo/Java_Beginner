/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 268

Understanding Inheritance and Constructors

- When you create an instance of a subclass, Java automatically calls the default constructor 
  of the base class before it executes the subclass constructor.

Example:

public class Ball
{
  public Ball()
   {
     System.out.println("Hello from the Ball constructor");
   }
}

public class BaseBall extends Ball
{
   public BaseBall()
  {
    System.out.println("Hello from the BaseBall constructor");
  }
}

* Console Display:
- Hello from the Ball constructor
- Hello from the BaseBall constructor


- You can also explicitly call a base class constructor from a subclass by using the
  super keyword.

Example:

public class Ball
{
  private double weight;
  public Ball(double weight)     //constructor
  {
    this.weight = weight;
  }
}

public class BaseBall extends Ball
{
  public BaseBall()
  {
   super(5.125);                   //calls base constructor
  }
}


- Important things to note about working with a superclass constructor:

  » If you use super to call the superclass constructor, you must do so in the very
    first statement in the constructor.
  » If you don’t explicitly call super, the compiler inserts a call to the default
    constructor of the base class. In that case, the base class must have a default
    constructor. If the base class doesn’t have a default constructor, the compiler
    refuses to compile the program.
  » If the superclass is itself a subclass, the constructor for its superclass is called
    in the same way. This continues all the way up the inheritance hierarchy until
    you get to the Object class, which has no superclass.










*/
