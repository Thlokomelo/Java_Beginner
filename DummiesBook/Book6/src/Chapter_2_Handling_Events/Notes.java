/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Handling_Events;

/*
Page: 583

Examining Events
----------------

- An event is an object that’s generated when the user does something noteworthy
  with one of your user-interface components.
- Then this event object is passed to a special method you create, called an event handler.
- An event is represented by an instance of the class javafx.event.Event or one of
  its many subclasses.

NB: see page 584 of the book for the most Commonly Used Event Classes


Some important terms to know:

» Event: An object that’s created when the user does something noteworthy
         with a component, such as clicking it.

» Event source: The object on which the event initially occurred.

» Event target: The node that the event is directed at. This is usually the button 
                or other control that the user clicked or otherwise manipulated. 

» Event handler: The object that listens for events and handles them when they occur.

» The event-listener object: Implements the EventHandler interface, which
defines a single method named handle.

Example: Event listener method
-------

void handle<T event>   //Called when an event occurs

Handling Events
---------------

Three steps to handle a JavaFX event:

1. Create an event source:
- An event source is simply a control, such as a button, that can generate events.

e.g. private Button btn;

Then, in the start method, you can create the button like this:

btn = new Button();
btn.setText("Click me please!");

2. Create an event handler:
- To create an event handler, you must create an object that implements an
  interface appropriately named EventHandler. This object must provide an
  implementation of the handle method.

3. Register the event handler with the event source:
- The final step is to register the event handler with the event source so that the
  handle method is called whenever the event occurs.


Implementing the EventHandler Interface
---------------------------------------

See AddSubtract class as an example.

Handling Events with Inner Classes
----------------------------------

See AddSubtract2 class a san example.

Handling Events with Anonymous Inner Classes
--------------------------------------------

An anonymous inner class, usually just called an anonymous class, is a class that’s
defined on the spot, right at the point where you need it. Because you code the
body of the class right where you need it, you don’t have to give it a name; that’s
why it’s called an anonymous class.

Anonymous classes are often used for event handlers to avoid the need to create a
separate class that explicitly implements the EventHandler interface.

See AddSubtract3 class as an example.

Using Lambda Expressions to Handle Events
-----------------------------------------

Java 8 introduces a new feature that in some ways is similar to anonymous
classes, but with more concise syntax. More specifically, a lambda expression lets
you create an anonymous class that implements a specific type of interface — a
functional interface — which has one and only one abstract method.

Here’s an example of a lambda expression that implements the EventHandler
interface:

e ->
{
iCounter++;
lbl.setText(Integer.toString(iCounter);
}

In this case the lambda expression implements a functional interface whose single
method accepts a single parameter, identified as e. When the method is called,
the iCounter variable is incremented and the label text is updated to display the
new counter value.


Here’s how you’d register this lambda expression as the event handler for a button:

btnAdd.setOnAction( e ->
{
iCounter++;
lbl.setText(Integer.toString(iCounter));
} );


See AddSubtract4 class as an example.









 */

