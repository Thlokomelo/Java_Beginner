/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Using_Abstract_Classes_and_Interfaces;

/*
Page: 311

Using Default Methods

- Although interfaces are an incredibly useful feature of Java, they have an inherent
  limitation: After you define an interface and then build classes that implement
  the interface, there’s no easy way to modify the interface by adding additional
  methods to it.

Examples:

public interface Playable
{
void play();
}

-------------------------------------------------

class Game implements Playable
{
public void play()
{
System.out.println("Good luck!");
}
}

------------------------------------------------------
Now suppose that you decide that the Playable interface should have an additional
feature — specifically, you want to add the ability to end the game by calling
a method named quit.

interface Playable
{
void play();
default void quit()
{
System.out.println("Sorry, quitting is not allowed.");
}
}















*/
