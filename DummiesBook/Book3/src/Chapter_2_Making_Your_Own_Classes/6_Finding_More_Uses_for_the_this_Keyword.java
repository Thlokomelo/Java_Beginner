/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 263


Finding More Uses for the this Keyword

- You can also use this in the body of a class constructor or method to refer to 
  the current object — that is, the class instance for which the constructor or
  method has been called.

Example:

public Actor(String last, String first)
{
  this.lastName = last;
  this.firstName = first;
}

Example: Using this in a method body

public String getFullName()
{
  return this.firstName + " " + this.lastName;
}


Example: Used by itself to pass a reference to the current object as a method parameter
         Prints the current object.

System.out.println(this);








*/


