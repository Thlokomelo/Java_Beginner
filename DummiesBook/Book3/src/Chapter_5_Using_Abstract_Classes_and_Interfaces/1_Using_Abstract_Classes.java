/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Using_Abstract_Classes_and_Interfaces;

/*
Page: 299

- Using Abstract Classe

  » Java lets you declare that a method or an entire class is abstract, which means that
    the method has no body. 
  » An abstract method is just a prototype for a method: 
      - a return type, 
      - a name, 
      - a list of parameters, 
      - and (optionally) a throws clause

  » One common use for abstract classes is to provide a way to obtain an instance of one
    of several subclasses when you don’t know which subclass you need in advance.
  » Abstract classes are useful when you want to create a generic type that is used as
    the superclass for two or more subclasses, but the superclass itself doesn’t represent
    an actual object.

Example of an abstract method: Here the method named hit is declared as an abstract method 
that returns an int value and accepts an int parameter.

public abstract int hit(int batSpeed);         //body of method replaced with semicolon


  » A class that contains at least one abstract method is called an abstract class and must
    be declared with the abstract modifier on the class declaration.

Example: 

public abstract class Ball              //class declared with an abstract modifier
{
public abstract int hit(int batSpeed);
}


  » When you subclass an abstract class, the subclass must provide an implementation
    for each abstract method in the abstract class. i.e. the subclass must override the abstract class method
    otherwise it will become an abstract subclass.

NB:
   » Not all the methods in an abstract class have to be abstract.A private method can’t 
     be abstract. That makes sense, because a subclass can’t override a private method, and 
     abstract methods must be overridden.

   » Although you can’t create an instance of an abstract class, you can declare a
     variable by using an abstract class as its type.

   » A class can’t specify both abstract and final.

   
*/
