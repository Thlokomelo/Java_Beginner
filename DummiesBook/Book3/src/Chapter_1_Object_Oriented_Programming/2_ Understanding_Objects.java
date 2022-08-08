/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Object_Oriented_Programming;



/*
Page: 237

What are Objects?

- both in the real world and in the world of programming — are entities that have
  certain basic characteristics.

Charaacteristics of Objects:

- Objects have Identity

For example:
every occurrence of a particular type of object — called an instance — can be distinguished
from every other occurrence of the same type of object, as well as from objects of other types.

Another Example:
If you have multiple invoices, each invoice can be identified by a unique invoice number.

NB: 
 » Each object has its own location in the computer’s memory.
 » The address of the starting location for an object provides a way of distinguishing one object 
   from another, because no two objects can occupy the same location in memory.
 » Java objects have something called a hash code, the hash code for an object is based on
   the object’s memory address.

- Objects have Type

 » object-oriented programming lets you assign names to the different kinds of objects in a program.
 » In Java, types are defined by classes.

Example: Statement creates an object of type Invoice

            Invoice i = new Invoice();

The identity of this object is assigned to variable i, which the compiler knows can hold references
to objects of type Invoice.

- Objects have state

Is a combination of an objects attribute which may change over time, e.g.:

 » The total number of sales for a product
 » An employees address or salary

 » An objects state can be public or private
   The state of an object is represented by class variables which are called fields


- Objects have behavior

» The specific behavior of an object depends on its type. But unlike state, behavior
  isn’t different for each instance of a type.

Example:
Behavior of an object is provided by its methods. Thus the format method of the NumberFormat
class is what provides the formatting behavior for NumberFormat objects.

» The interface of a class is the set of methods and fields that the class makes
 public so that other objects can access them.




*/