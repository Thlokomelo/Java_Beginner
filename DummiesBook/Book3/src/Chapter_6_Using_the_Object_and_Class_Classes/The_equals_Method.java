/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes;

/*
Page: 322

- The equals Method
--------------------


Testing objects to see whether they are equal is one of the basic tasks of any
object-oriented programming language. Unfortunately, Java isn’t very good at it.


If you want to create objects that are considered to be equal if they contain identical
data, you have to do two things:

» Compare them with the equals method rather than the equality operator.
» Override the equals method in your class to compare objects based on
  their data.

- Overriding the equals method
-------------------------------

» You can override the equals method so that objects can be compared based on
  their values.

» Specifically, the Java API documentation says that whenever you override the
  equals method, you must ensure that the equals method meets five specific conditions:

  It is reflexive. For any non-null reference value x, x.equals(x) should
  return true

  It is symmetric. For any non-null reference values x and y, x.equals(y)
  should return true if — and only if — y.equals(x) returns true.

  It is transitive. For any non-null reference values x, y, and z, if x.equals(y)
  returns true and y.equals(z) returns true, x.equals(z) should return true.

  It is consistent. For any non-null reference values x and y, multiple invocations
  of x.equals(y) consistently return true or consistently return false,
  provided that no information used in equals comparisons on the objects is
  modified.

  For any non-null reference value x, x.equals(null) should return false.
















*/


