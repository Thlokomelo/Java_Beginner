/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Working_With_Statics;

/*
Page: 274

Using Static Initializers

- Initializer blocks aren’t executed until an instance of a class is created.
- Java provides a feature called a static initializer that’s designed specifically to let
  you initialize static fields.
- you code static initializers in the class body but outside any other block, such as 
  the body of a method or constructor.

Example:

class StaticInit
{
   public static int x;

   static
{
   x = 32;     //static statement
}
   // other class members such as constructors and
   // methods go here...
}







*/
