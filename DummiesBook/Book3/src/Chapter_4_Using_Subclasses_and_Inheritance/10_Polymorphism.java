/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 292

Polymorphism

- Refers to the ability of Java to use base class variables to
  refer to subclass objects.
  » To keep track of which subclass an object belongs to;
  » To use overridden methods of the subclass

Example: Application plays the venerable game Tic-Tac-Toe

class Player                                  //class representing one of the players
{
 public int move()                            //Method returning an int
  {
   for (int i = 0; i < 9; i++)
  {
   System.out.println("\nThe basic player says:");
   System.out.println("I'll take the first open square!");
   return firstOpenSquare();
  }
   return -1;
  }

private int firstOpenSquare()
  {
   int square = 0;
   // code to find the first open square goes here
   return square;
  }
}

class BetterPlayer extends Player                       //subclass implementing better moves
{






*/
