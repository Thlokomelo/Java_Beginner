/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_7_Using_Inner_Anony_Classes_Lambda_Expressions.Lambda_Expressions;

/*
Page 351


Using Lambda Expressions
-------------------------

 » A lambda expression lets you create         an anonymous class that implements a specific type of interface called a
   functional interface — which has one and only one abstract method.

Example: 
--------

interface Ball
{
void hit();
}


 » A lambda expression is a concise way to create an anonymous class that implements a functional interface.
 » It simply defines the parameter types and the method body.

Example: implements the Ball interface
--------------------------------------

() -> { System.out.println("You hit it!");}
 
 » Here the lambda expression implements a functional interface whose single
   method does not accept parameters. When the method is called, the text "You hit
   it!" is printed.

Complete Example: program that uses a lambda expression to implement the Ball interface:
----------------------------------------------------------------------------------------

public class LambdaBall
{
public static void main(String[] args)
{
Ball b = () -> { System.out.println("You hit it!"); };
b.hit();
}
interface Ball
{
void hit();
}
}


  » The general syntax for a lambda expression is this:

(parameters) -> expression

       or this:

(parameters) -> { statement;...}





*/

