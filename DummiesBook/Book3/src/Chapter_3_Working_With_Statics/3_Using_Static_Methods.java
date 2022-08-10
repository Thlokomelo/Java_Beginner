/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Working_With_Statics;

/*
Page: 269

Using Static Methods

- A static method is a method declared with the static keyword. Like static fields
  static methods are associated with the class itself, not with any particular object
  created from the class.

- The best-known static method is main, which is called by the Java runtime to start
  an application. The main method must be static — which means that applications
  are run in a static context by default.

- you can’t access a nonstatic method or field from a static method:

public class TestClass
{
  private int x = 5;                    // an instance field

  public static void main(String[] args)
{
  int y = x;                           // error: won't compile
}

- You can access static methods and fields from an instance method:

public class Invoice
{
  private static double taxRate = 0.75;
  private double salesTotal;
  public double getTax()
 {
  return salesTotal * taxRate;
 }
}










*/
