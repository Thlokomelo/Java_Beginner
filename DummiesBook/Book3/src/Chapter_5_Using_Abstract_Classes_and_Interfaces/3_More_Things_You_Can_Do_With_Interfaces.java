/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Using_Abstract_Classes_and_Interfaces;

/*
Page: 306

More Things You Can Do with Interfaces

- Adding fields to an interface: e.g. final/contstant fields that are related to the interface

Example: Any class that implements the GolfClub interface has these four fields (that
is, constants) available.

public interface GolfClub
{
 int DRIVER = 1;
 int SPOON = 2;
 int NIBLICK = 3;
 int MASHIE = 4;
}

NB: interface fields are automatically assumed to be static, final, and public.

- Extending interfaces

  » You can extend interfaces by using the extends keyword. An interface that extends
    an existing interface is called a subinterface, and the interface being extended is
    called the superinterface.

NB: When you use the extends keyword with interfaces, all the fields and methods of
the superinterface are effectively copied into the subinterface. Thus the subinterface
consists of a combination of the fields and methods in the superinterface plus
the fields and methods defined for the subinterface.

- Using Interfaces for callbacks

  » It’s a programming technique in which an object lets another object know that 
    the second object should call one of the first object’s methods whenever a certain event happens.


  » The first object is called an event listener because it waits patiently until the other object calls it. 
    The second object is called the event source because it’s the source of events that result in calls
    to the listener.
























*/