/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Hello_JavaFX;

/*
Page: 563

Introduction
------------

In this chpater we learn about using a Java graphical user interface (GUI) package 
called JavaFX to create simple GUI programs that display simple buttons and text labels. 
We will also learn about several of the key JavaFX classes that let you create the layout of a GUI.


JavaFX Advantages
-----------------

- It provides a full range of controls including the classics such as buttons, labels, text boxes, 
  check boxes, drop-down lists, and menus, as well as more exotic controls such as tabbed panes 
  and accordion panes.

- It Allows you to improve the appearance of your user interface by using Cascading Style Sheets (CSS).

- Visual effects: You can add a wide variety of visual effects to your user
                  interface elements, including shadows, reflections, blurs, lighting, and
                  perspective effects.

- Animation: You can specify animation effects that apply transitions gradually over time.

- 3-D objects: You can draw three-dimensional objects such as cubes, cylinders, spheres, and more complex shapes.

- Touch interface: JavaFX can handle touchscreen devices, such as smartphones and tablet computers with ease.

Looking at a Simple JavaFX Program
----------------------------------

See ClickMe class as an example

Importing JavaFX Packages
-------------------------

JavaFX programs begin with a series of import statements that reference the various JavaFX 
packages that the program will use.

For example, the ClickMe program uses the following:

import javafx.application.*; 
- This package defines the core class on which all JavaFX applications depend, which is Application

import javafx.stage.*;
- Defines the top-level container for all user interface objects.

import javafx.scene.*;
- is a container that holds all the user interface elements displayed by the program.
 
import javafx.scene.layout.*;
- defines a special type of user-interface element called a layout manager. The job of a 
layout manager is to determine the position of each control displayed in the user interface.

import javafx.scene.control.*;
- contains the classes that define individual user interface controls such as buttons, text boxes, and labels.


Extending the Application Class
-------------------------------
The Application class is responsible for managing what is called the life cycle of a
JavaFX application. The life cycle consists of the following steps:

1. Create an instance of the Application class.
2. Call the init method.
3. Call the start method : Responsible for building and displaying the user interface.
4. Wait for the application to end, which typically happens when the user
   signals the end of the program by closing.
5. Call the stop method

Example: If you have imported the Application Class
-------

       public class ClickMe extends Application

Example:If you have not imported the Application Class
-------

       public class ClickMe extends javafx.application.Application



Launching the Application
-------------------------

The main method is the standard way of launching apps in Java.

Example: Here the main method calls the launch method to start the application
-------

public static void main(String[] args)
{
launch(args);
}

Overriding the start Method
---------------------------

Every JavaFX application must include a start method. This is the code that creates the user interface 
elements and what your program’s user will interact with.

When a JavaFX application is launched, the JavaFX framework calls the start
method after the Application class has been initialized.

See ClickMe class as an example.

The Start Method performs the following steps to initialise the program:

1. Create a button control named btn. The button’s text is set to Click me
please!, and a method named buttonClick will be called when the user
clicks the button. 

2. Create a layout pane named pane and add the button to it.

3. Create a scene named scene and add the layout pane to it.

4. Finalize the stage by setting the scene, setting the stage title, and
showing the stage.

Creating a Button
-----------------

The button displayed by the Click Me program is created using a class named
Button. The Button class and most of the other control classes are found in the
package javafx.scene.control.

Example: To create a button, simply define a variable of type Button and then call the
-------  Button constructor like this:

Button btn;
btn = new Button();

Example: To set the text value displayed by the button, call the setText method, passing the
-------  text to be displayed as a string:

btn.setText("Click me please!");

Handling an Action Event
------------------------

When the user clicks a button, an action event is triggered. Your program can
respond to the event by providing an event handler, which is simply a bit of code
that will be executed whenever the event occurs.

The most straightforward way handle an Action Event is to specify that a method be called whenever the event 
occurs and then provide the code to implement that method.

here is an example:
------------------

btn.setOnAction(e -> buttonClick());    //uses a lambda expression

// The argument e represents an object of type ActionEvent, which the
   program can use to get detailed information about the event.

// The arrow operator (->) is a new operator introduced in Java 8 for use with
   Lambda expressions.

// The method call buttonClick() simply calls the method named buttonClick.

the next step is to code the buttonClick method:

public void buttonClick()
{
if (btn.getText() == "Click me please!")     //getText() Returns the text displayed by the button as a string
{
btn.setText("You clicked me!");              //setText()  Sets the text displayed by the button
}
else
{
btn.setText("Click me please!");
}
}

Creating a Layout Pane
----------------------

By itself, a button is not very useful. You must actually display it on the screen
for the user to be able to click it. A layout pane is a container class to which you
can add one or more user-interface elements.

JavaFX provides a total of eight distinct types of layout panes, all defined by
classes in the package javafx.scene.layout.The Click Me program uses a type
of layout called a border pane, which arranges the contents of the pane into five
general regions: top, left, right, bottom, and center.

The lines that create the border pane in the Click Me program are:

BorderPane pane = new BorderPane();   //BorderPane constructor is called to create a new BorderPane object
pane.setCenter(btn);                  //method is used to display the btn in the centre


Making a Scene
--------------

After you create a layout pane that contains the controls you want to display, the
next step is to create a scene that will display the layout pane.

Example: declares a variable of type Scene and calls the Scene class constructor.
-------

Scene scene = new Scene(pane, 300, 250);  //accepts pane, width (pixels) and height (pixels) as parameters

Setting the Stage
-----------------






















 */

