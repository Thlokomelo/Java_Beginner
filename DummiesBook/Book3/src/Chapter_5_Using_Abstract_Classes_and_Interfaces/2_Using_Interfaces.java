/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Using_Abstract_Classes_and_Interfaces;

/*
Page: 302

Using Interfaces

An interface is similar to an abstract class, but an interface can include only
abstract methods and final fields (constants), and an interface can’t be used as
a base class. A class implements an interface by providing code for each method
declared by the interface.

- Creating a basic interface

  Example:

     public interface Playable    //interface
     {
       void play();                 //method
     }

» This interface declares that any class that implements the Playable interface must
  provide an implementation for a method named play that accepts no parameters
  and doesn’t return a value.

» All the methods in an interface are assumed to be public and abstract.

- Implementing an interface

  To implement an interface, a class must do two things:

   » It must specify an implements clause on its class declaration.
   » It must provide an implementation for every method declared by the interface.






















*/
