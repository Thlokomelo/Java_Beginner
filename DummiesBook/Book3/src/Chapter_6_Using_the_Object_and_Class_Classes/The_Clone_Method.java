/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes;

/*
Page: 328

The Clone Method
----------------

 » Cloning refers to the process of making an exact duplicate of an object.
 » A clone is an altogether new object that has the same values as the original object.
 » The method is available to all classes because its inherited from the Object Class.
 » The method is declared with protected access in the Object class. Therefore a clone
   method within a class is only avaible to that specific class.
 » If you want other objects to be able to clone your object, you must override the clone
   method and give it public access.

Example: Here a new Employee object is created, and its fields are set to the same values as
the original object.

Employee emp1 = new Employee("Stewart", "Martha");
Employee emp2 = new Employee();
emp2.setLastName(emp1.getLastName());
emp2.setFirstName(emp1.getFirstName());
emp2.setSalary(emp1.getSalary());

- Implementing the clone method
---------------------------------

Example: in CloneTest.java


- Using clone to create a shallow copy
---------------------------------------

The clone method of the Object class can automatically create a copy of your object 
that contains duplicates of all the fields that are primitive types (such as int and double),
as well as copies of immutable reference types — most notably, strings. So if all the fields in your
class are either primitives or strings, you can use the clone method provided by
the Object class to clone your class. This type of clone is called creating a shallow copy.

To call the clone method from your own clone method, just specify super.
clone().

Example: In Employee.java 


- Creating deep copies

A deep copy is a clone in which any subobjects within the main object are also cloned.















*/
