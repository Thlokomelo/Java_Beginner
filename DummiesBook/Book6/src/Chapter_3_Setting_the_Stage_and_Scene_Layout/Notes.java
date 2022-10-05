/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Setting_the_Stage_and_Scene_Layout;

/*
Page: 603

Examining the Stage Class
-------------------------

A stage, which is represented by the Stage class, is the topmost container in
which a JavaFX user interface appears.

When a JavaFX application is launched, a stage known as the primary stage is automatically
created. A reference to this stage is passed to the application’s start method via the 
primaryStage parameter:

Example:
-------

@Override public void start(Stage primaryStage)
{
// primaryStage refers to the
// application's primary stage.
}


The Stage class comes equipped with many methods that let you manipulate the
appearance and behavior of a stage.

See Table 3-1 in page 604 of the book for a list of methods of the stage class.

The most important methods from the above mentioned table are the following:

- void setScene(Scene scene): Sets the scene to be displayed on the stage.
- void setTitle(String title): Sets the title to be displayed in the stage’s 
                               title bar, if a title bar is visible.
- void show(): Makes the stage visible.

Examining the Scene Class
-------------------------

Like the Stage class, the Scene class is fundamental to JavaFX programs. In
every JavaFX program, you use at least one instance of the Scene class to hold
the user-interface controls that your users will interact with as they use your
program.

See table 3-2 in page 607 for a list of the constructors and methods of the Scene
class.

Switching Scenes
----------------

See SceneSwitcher class as an example.

Creating an Alert Box
---------------------

JavaFX provides a simple means of displaying a basic message box by using
the Alert class, which is similar to the JOptionPane class.

See Table 3-3 in page 614 for constructors and methods of the Alert class.

The AlertType parameter lets you specify one of several types of Alert dialogs:

- AlertType.CONFIRMATION, which prompts the user to confirm an action.
- AlertType.ERROR, which display an error message.
- AlertType.INFORMATION, which displays an information dialog box.
- AlertType.WARNING, which displays a warning message.
- AlertType.NONE, which display a generic alert dialog.

Example: displays a simple informational message using the Alert class:
-------

Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once.");
a.showAndWait();

You can control what buttons appear on the Alert box by using the optional
ButtonType parameter. You can choose from among the following types of buttons:

- ButtonType.APPLY
- ButtonType.CANCEL
- ButtonType.CLOSE
- ButtonType.FINISH
- ButtonType.NEXT
- ButtonType.NO
- ButtonType.OK
- ButtonType.PREVIOUS
- ButtonType.YES

Example: Alert box displaying more than obe ButtonTypre:
-------

Alert a = new Alert(Alert.AlertType.INFORMATION, "Are you certain?",
ButtonType.YES, ButtonType.NO);

See ClickCounterAlert class as an example.

Exit, Stage Right
-----------------

The only mechanism the programs we've seen thus far have provided to quit the program is for the
user to click the standard window close button, typically represented by an X in the upper-right corner 
of the window’s title bar. That is almost always the wrong way to exit a program.

Here are the right steps to exit a program: 

- Adding a button, menu command, or other way for the user to signal that she wishes to close the program.
- Optionally displaying a confirmation box that verifies whether the user really wants to close the program.
- If the user really does want to close the program, the program should perform any necessary clean-up work.
- After you’ve done any necessary clean-up work, you can close the application by calling the primary stage’s 
  close method.
- The verification and clean-up steps should be taken whether the user attempts to close the program by using
  a button or menu command you’ve provided in your user interface or by clicking the built-in window close button.

Creating a Close button
-----------------------

To add a button or other user-interface element that allows the user to close the
button, all you have to do is provide an action event handler that calls the stage’s
close method.

Example: the action event handler simply calls primaryStage.close() to close
-------  the application.

Button btnClose = new Button();
btnClose.setText("Close");
btnClose.setOnAction( e -> primaryStage.close() );

If you want to do more than simply call the close method in the action event
handler, you may want to isolate the event handler in a separate method.

Example:
-------

btnClose.setOnAction( e -> btnClose_Clicked());

Handling the CloseRequest event
-------------------------------

Providing a Close button is an excellent way to allow your users to cleanly exit
from your program.

In a case where the user decides to close the program using the window close button, JavaFX generates a
CloseRequest event, which is sent to the stage. You can provide an event handler
for this event by calling the setOnCloseRequest method of the Stage class. Then,
the event handler is called whenever the user tries to close the window.

An easy way to provide a method that handles both the Action event for a Close
button and the CloseRequest event for a stage is to create the Lambda expression
for the setOnCloseRequest method so that it consumes the event before calling
the method that will handle the event:

Example: Here, the event handler for the CloseRequest event first consumes the event and
-------  then calls btnClose_Click. The btnClose_Click method, in turn, displays a confirmation
         box and closes the stage if the user confirms that this is indeed what he wishes to do.


btnClose.setText("Close");
btnClose.setOnAction( e -> btnClose_Click () );
primaryStage.setOnCloseRequest(
e -> {
e.consume();
btnClose_Click ();
} );

Putting it all together
-----------------------

see ClickCounterExit class as na example.






























 */

