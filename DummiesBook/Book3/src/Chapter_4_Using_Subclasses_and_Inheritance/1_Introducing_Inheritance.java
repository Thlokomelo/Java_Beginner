/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 277

Introducing Inheritance

- Inheritance refers to a feature of object-oriented programming that lets
  you create classes that are derived from other classes. 
- The class that is inherited is called the parent class, the base class, or the superclass. 
- The class that does the inheriting is called the child class, the derived class, or the subclass.

NB:
   » A derived class automatically takes on all the behavior and attributes of its
     base class.
   » A derived class can add features to the base class it inherits by defining its
     own methods and field.
   » A derived class can also change the behavior provided by the base class. It can inherit the its method but 
     it can provide its own implementation of that method.
   » Inheritance is best used to implement is-a-type-of relationships. Here are a few
     examples: Solitaire is a type of game; a truck is a type of vehicle etc.

- Inheritance hierarchies

  » One of the most important aspects of inheritance is that a class derived from a
    base class can in turn be used as the base class for another derived class.

Example:

    » Employee class can be used as a base class to create two types of subclasses: a
      SalariedEmployee class for salaried employees and an HourlyEmployee
      class for hourly employees. 

    » Suppose that salaried employees fall into two categories: management and sales. 

    » Then you could use the Salaried Employee class as the base class  for two more 
      classes:Manager and SalesPerson.

    » A Manager is a type of SalariedEmployee. Because a SalariedEmployee is a type of Employee, 
      a Manager is also a type of Employee. 
     










*/
