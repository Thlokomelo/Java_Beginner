/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 249

Declaring a Class

All classes must be defined by a class declaration — lines of code that provide the
name for the class and the body of the class. 

Example:
[public] class ClassName {class-body}

Public: Class is available for use by other classes.


- Picking class names:
  The ClassName is an identifier that provides a name for your class. You can use
  any identifier you want to name a class, the following are the three guidelines:

  » Begin the class name with a capital letter: If the class name consists of more
    than one word, capitalize each word: for example, Ball, RetailCustomer.

  » Whenever possible, use nouns for your class names.

  » Avoid using the name of a Java API class.Java application programming interface (API) 
    is a list of all classes that are part of the Java development kit (JDK). It includes 
    all Java packages, classes, and interfaces, along with their methods, fields, and constructors. 


- Knowing what goes in the class body:

  » Fields: Variable declarations define the public or private fields of a class.

  » Methods: Method declarations define the methods of a class.

  » Constructors: A constructor is a block of code that’s similar to a method but
    is run to initialize an object when an instance is created. Has the same name as the class
     but does not have a return type.

  » Initializers: These stand-alone blocks of code are run only once, when the
    class is initialized. There are actually two types, called static initializers and
    instance initializers.

  » Other classes and interfaces: A class can include another class, which is then
    called an inner class or a nested class.The can also contain interfaces.

- Seeing where classes go

  » A public class must be written in a source file that has the same name as the class,
    with the extension java. A public class named Greeter, for example, must be
    placed in a file named Greeter.java.

  » An inner class is a class that’s defined within the body of another class and is available
    only from within that class.

For Example:

public class DiceGame {

    public static void main(String[] args) {

        Dice d = new Dice();
        d.roll();
    }
}

class Dice {

    public void roll() {
        // code that rolls the dice goes here
    }
}



 */

