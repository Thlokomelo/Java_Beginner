/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 283

Overridng Methods

- If a subclass declares a method that has the same signature as a public method of
  the base class, the subclass version of the method overrides the base class version
  of the method. 

- This technique lets you modify the behavior of a base class to suit
  the needs of the subclass.

Example:

//Base class with a play () method

                public class Game         
                {
                  public void play()
                  {
                  }
                }

//Subclass with a play () method that overrides the base method

                public class Chess extends Game
                {
                  public void play()
                  {
                   System.out.println("I give up. You win.");
                  }
                }



- To override a method, 3 conditions need to be met:

  » The class must extend the class that defines the method you want to override.
  » The method must be declared in the base class with access public.
  » The method in the subclass must have the same signature as the method in
    the base class (name and parameters).






















*/
