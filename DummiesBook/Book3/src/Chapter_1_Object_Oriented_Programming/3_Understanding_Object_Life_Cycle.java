/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Object_Oriented_Programming;

/*
Page: 240

Object Life Cycle
- This is from its creation up untill it is disposed of.

The following process takes place:

1.
- Before an object can be created from a class, the class must be loaded,
- Java looks for any static initializers that initialize static
  fields — fields that don’t belong to any particular instance of the class, but
  belong to the class itself and are shared by all objects created from the class.
- A class is loaded the first time you create an object from the class or the firs
  time you access a static field or method of the class.
  When you run the main method of a class, for example, the class is initialized because 
  the main method is static.

2.
- An object is created from a class when you use the new keyword. 
- To initialize the class, Java allocates memory for the object and sets up a 
  reference to the object so that the Java runtime can keep track of it. 
- Then Java calls the class constructor, which is like a method but is called only once: 
  when the object is created. 
- The constructor is responsible for doing any processing required to initialize the
  object — initializing variables, opening files or databases, and so on.

3.
- The object lives its life, providing access to its public methods and fields to
  whoever wants and needs them.

4.
- When it’s time for the object to die, the object is removed from memory, and
  Java drops its internal reference to it. 
- You don’t have to destroy objects yourself. A special part of the Java runtime 
  called the garbage collector takes care of destroying all objects when they are 
  no longer in use.







*/
