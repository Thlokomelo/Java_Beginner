/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes;

/*
Page: 316

The Mother of All Classes: Object
---------------------------------

Object is the mother of all classes. In Java, every class ultimately inherits the
Object class. This class provides a set of methods that is available to every Java object.

- Every object is an Object
-----------------------------

  » Any class that doesn’t have an extends clause implicitly inherits Object. 
  » If a subclass has an extends clause that specifies a superclass other than Object,
    the class still inherits Object.

Example:

public class Manager extends SalariedEmployee...
public class SalariedEmployee extends Employee...
public class Employee extends Person...
public class Person... (extends Object)     //Therefore all the subclasses automatically inherit the Object extension

- Object as a type
-------------------

  » If you don’t know or care about the type of an object referenced by a variable, you
    can specify its type as Object.
  
Example: 

Object emp = new Employee();

You can’t do anything useful with the emp variable, however, because the compiler
doesn’t know that it’s an Employee. If the Employee class has a method named
setLastName, the following code doesn’t work:

Object emp = new Employee();
emp.setLastName("Smith"); // error: won't compile

Object emp = new Employee();
((Employee)emp).setLastName("Smith"); // this works if you cast emp to Employee

- Methods of the Object class
------------------------------

 » protected Object clone(): 
   Returns a copy of this object.

 » boolean equals(Object obj): 
   Indicates whether this object is equal to the obj object.

 » protected void finalize(): 
   Is called by the garbage collector when the object is destroyed.

 » Class getClass():
   Returns a Class object that represents this object’s runtime class.

 » int hashCode():
   Returns this object’s hash code.

 » void notify() :
   Is used with threaded applications to wake up a thread that’s waiting on this object.

 » void notifyAll():
   Is used with threaded applications to wake up all threads that are waiting on this object.

 » String toString():
   Returns a String representation of this object.

 » void wait():
   Causes this object’s thread to wait until another thread calls notify or notifyAll.

 » void wait(Long timeout):
   Is a variation of the basic wait method. 

 » void wait(Long timeout, int nanos):
   Is yet another variation of the wait method.


- Other Methods of the Object Class
-----------------------------------

» clone: This method is commonly used to make copies of objects, and
  overriding it in your own classes is not uncommon. 

» equals: This method is commonly used to compare objects. Any class that
  represents an object that can be compared with another object should
  override this method. 

» finalize: This method is called when the garbage collector realizes that an
  object is no longer being used and can be discarded. 

» getClass: This method is sometimes used in conjunction with the Class class.

» hashCode: Every Java object has a hash code, which is an int representation of
  the class that’s useful for certain operations. This method isn’t important until you
  start to work with hash tables.

» toString: This method is one of the most commonly used methods in Java.



- Primitives aren’t objects
----------------------------

» primitive types, such as int and double, are not objects.
» They do not inherit the Object class and don’t have access to the methods
  listed above.

Example:

int x = 50;
String s = x.toString(); // error: won't compile

String s = new Integer(x).toString(); // OK           //wrapper class used (Interger) to create an object fromthe value.

           OR

String s = Integer.toString(x);

           OR

String s = "" + x;   //using string concatenation






















*/
