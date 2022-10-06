/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Getting_Input_from_the_User;

/*
Page: 659

Using Text Fields
-----------------

A text field is a box into which the user can type a single line of text. You create text
fields by using the TextField class. 

*See Table 5-1 in page 660 of the book for constructors and methods of this class.

The TextField class is defined in the javafx.scene.control package, so you
should include the following imports statement in any program that uses a text
field:

imports javafx.scene.control.*;

The most common way to create a text field is to call the constructor without
arguments, like this:

   TextField text1 = new TextField();
---------------------------------------------------------------------------------

You can set the initial value to be displayed like this:

   TextField text1 = new TextField("Initial value");
---------------------------------------------------------------------------------

Or, if you need to set the value later, you can call the setText method:

   text1.setText("Text value");
----------------------------------------------------------------------------------

To retrieve the value that the user has entered into a text field, call the getText
method like this:

   String value = text1.getText();
-----------------------------------------------------------------------------------

You can set minimum and maximum limits for the text field size by calling the
setMinWidth and setMaxWidth methods, and you can indicate the preferred width
via the setPrefWidth method, as in this example:

TextField text1 = new TextField();
text1.setMinWidth(150);
text1.setMaxWidth(250);
text1.setPrefWidth(200);
------------------------------------------------------------------------------------

Another way to set the preferred width is with the setPrefColumnCount method,
which sets the width in terms of average-sized characters. For example, the following
line sizes the field large enough to display approximately 50 characters:

text1.setPrefColumnCount(50);

NB: Method does not limit number of charactors to be entered,
    it limits number of charactors the field can display at one time.

--------------------------------------------------------------------------------------

Whenever you use a text field, provide a prompt that lets the user know what data
he should enter into the field.

Example: place a label control immediately to the left of the text field:

Label lblName = new Label("Name:");
lblName.setMinWidth(75);
TextField txtName = new TextField();
txtName.setMinWidth(200);
HBox pane = new HBox(10, lblName, txtName); //a label and a text field are created and added to an HBox pane 
                                            //so they will bedisplayed side-by-side.

-------------------------------------------------------------------------------------------

Example: Displaying a prompt inside a textfield.

TextField txtName = new TextField();
txtName.setPromptText("Enter the customer's name");  //text Enter the customer's name will appear inside the text field.

---------------------------------------------------------------------------------------------

To retrieve the value entered by the user into a text field, you use the getText
method, as in this example:

String lastName = textLastName.getText();

----------------------------------------------------------------------------------------------

See RolePlayer class as an example.

Validating Numeric Data
-----------------------

To convert the value entered in a text box to an int, use the parseInt method:

int count = Integer.parseInt(txtCount.getText());  //Here the result of the getText method is used as the parameter 
                                                   //of the parseInt method.

*See Table 5-2 in page 667 of the book for a list of the parse methods for the various wrapper classes.

If your program uses more than one or two numeric-entry text fields, consider
creating separate methods to validate the user’s input.

Example: shows a method that accepts a text field and a string that provides an error message
-------  to be displayed if the data entered in the field can’t be converted to an int.

private boolean isInt(TextField f, String msg)
{
try
{
Integer.parseInt(f.getText());
return true;
}
catch (NumberFormatException e)
{
Alert a = new Alert(Alert.AlertType.WARNING, msg);
a.setTitle = "Invalid Data";
a.showAndWait();
return false;
}
}

Using Check Boxes
-----------------

A check box is a control that the user can click to check or clear. Check boxes let
the user specify a Yes or No setting for an option.

*See  Table 5-3 in page 669 of the book for constructors and methods of the CheckBox class.

As with any JavaFX control, if you want to refer to a check box in any method
within the program, declare a class variable to reference the control:

CheckBox chkPepperoni, chkMushrooms, chkAnchovies;

Then you can use statements like these in the start method to create the check
boxes and add them to a layout pane (in this case, pane1):

chkPepperoni = new CheckBox("Pepperoni");
pane1.add(chkPepperoni);
chkMushrooms = new CheckBox("Mushrooms");
pane1.add(chkMushrooms);
chkAnchovies = new CheckBox("Anchovies");
pane1.add(chkAnchovies);

Using Radio Buttons
-------------------

Radio buttons are similar to check boxes, but with a crucial difference: They travel
in groups, and a user can select only one radio button at a time from each group.
When you click a radio button to select it, the radio button within the same group
that was previously selected is deselected automatically.

*See  Table 5-4 in page 672 of the book for constructors and methods of the RadioButton class.

The usual way to create a radio button is to declare a variable to refer to the button
as a class variable so that it can be accessed anywhere in the class, as in this example:

RadioButton rdoSmall, rdoMedium, rdoLarge;

Then, in the start method, you call the RadioButton constructor to create the
radio button:

rdoSmall = new RadioButton("Small");

Thereafter, you can add the radio button to a layout pane in the usual way.

----------------------------------------------------------------------------------------------
To create a toggle group to group radio buttons that work together, call the
ToggleGroup class constructor:

ToggleGroup sizeGroup = new ToggleGroup();
Then call the setToggleGroup method of each radio button:
rdoSmall.setToggleGroup(sizeGroup);
rdoMedium.setToggleGroup(sizeGroup);
rdoLarge.setToggleGroup(sizeGroup);













 */
