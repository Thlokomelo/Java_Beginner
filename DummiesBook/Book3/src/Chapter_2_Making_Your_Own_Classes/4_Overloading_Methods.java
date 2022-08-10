/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 257

Overloading methods

- A Java class can contain two or more methods with the same name, provided that
  those methods accept different parameters. This is called overloading.

- overloaded methods must have a unique signature. A method’s signature is the combination 
  of its name and the number and types of parameters it accepts.

- Overloading provides alternatives to the user for invoking an objects functions in different ways.

   Example:

   void println()
   void println(boolean x)
   void println(char x)
   void println(char[] x)
   void println(double x)
   void println(float x)
   void println(int x)
   void println(long x)
   void println(Object x)
   void println(String x)

- The folowing are not part of a methods signature:

 » The method’s return type: 
   You can’t code two methods with the same name and parameters but with different return types.

 » The names of the parameters: 
   All that matters to the method signature are the types of the parameters and the order in which they appear.

   Example: The following have the same signature

   double someMethodOfMine(double x, boolean y)
   double someMethodOfMine(double param1, boolean param2)


*/
