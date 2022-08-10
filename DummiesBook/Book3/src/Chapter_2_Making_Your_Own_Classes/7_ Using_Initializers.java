/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 265

Using Initializers

- Also called an initializer block, is placed outside any method, constructor or other block of code.
  Is Executed whenever an instance of a class is created. Regardless of which constructor is used to 
  create the instance.

Example: Class that gets the value for a class field from the user when the class is initialized

class PrimeClass
{
  private Scanner sc = new Scanner(System.in);
  public int x;
{
  System.out.print("Enter the starting value for x: ");
  x = sc.nextInt();
}
}


NB:
   » If a class contains more than one initializer, the initializers are executed in the
     order in which they appear in the program.
   » Initializers are executed before any class constructors.
   » A special kind of initializer block called a static initializer lets you initialize static
     fields. 
   » Initializers are sometimes used with anonymous classes (A nested class that doesn't have any 
     name is known as an anonymous class).









*/
