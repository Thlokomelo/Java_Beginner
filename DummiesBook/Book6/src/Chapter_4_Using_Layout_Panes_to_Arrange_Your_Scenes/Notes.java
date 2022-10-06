/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Layout_Panes_to_Arrange_Your_Scenes;

/*
Page: 626

Working with Layout Panes
-------------------------

five JavaFX layout panes:

» HBox: This layout pane arranges nodes horizontally, one next to the other. You
        use it to create controls arranged neatly in rows.
» VBox: This layout pane arranges nodes vertically, one above the other. You
        use it to create controls arranged neatly in columns.
» FlowPane: This layout pane arranges nodes next to each other until it runs
            out of room; then, it wraps to continue layout nodes. You can configure a
            FlowPane to arrange nodes horizontally in rows or vertically in columns.
» Border: This layout pane divides the pane into five regions: Top, Left, Center,
          Right, and Bottom. When you add a node, you can specify which region you
          want to place the node in.
» GridPane: This layout pane divides the pane into a grid, affording you
            complete control of the arrangement of elements in rows and columns.



Creating layout panes
---------------------

Steps to follow:

1. Create the controls or other nodes you want to add to the pane.

Example: if the layout pane will contain two buttons, you should create the
         two buttons using code similar to this:

Button btnOK = new Button();
btnOK.setText("OK");
btnOK.setOnAction( e -> btnOK_Click() );
Button btnCancel = new Button();
btnCancel.setText("Cancel");
btnCancel.setOnAction( e -> btnCancel_Click() );

2. Create a layout pane by calling its constructor.

Example:

HBox pane = new HBox();

3. Fine-tune the optional settings used by the layout pane.

Example: the HBox pane lets you set the number of pixels that will be used to separate each
         node in the pane

HBox.setSpacing(10);


3. Add each of the nodes that will appear in the layout pane.

Example:  For the HBox pane, you must first call the getChildren method to get a list of all
          the nodes that have been added to the pane. Then, you call the addAll
          method to add one or more nodes to the pane

pane.getChildren().addAll(btnOK, btnCancel);

5. Create the scene, specifying the layout pane as the scene’s root node.

Example: The pane is added as the root node for the scene.

Scene scene = new Scene(pane, 300, 400);

Using the HBox Layout
---------------------

*See Table 4-1 in page 628 of the book for constructors and methods of the  HBox class

To use the class you should always have the below import:

import javafx.scene.layout.*;

Example of creating an Hbox: here the nodes that you want to place in the HBox are created and
---------------------------  then the HBox constructor is called and the nodes are passed as arguments.

Button btn1 = new Button("Button One");            
Button btn2 = new Button("Button Two");
Button btn3 = new Button("Button Three");
HBox hbox = new HBox(btn1, btn2, btn3);

Alternatively:
-------------

You can create the HBox control in an initially empty state and later add the
controls, you can do so like this:

HBox hbox = new HBox();
Hbox.getChildren().addAll(btn1, btn2, btn3);

Spacing Things Out
------------------

That is adding spacing and padding to a pane. The following techniques apply to other types of panes as well:

Example: Setting the spacing
-------

HBox hbox = new HBox(10);   //spacing of 10 pixels

Example: creates an HBox pane with 10-pixel spacing and adds three buttons
-------

HBox hbox = new HBox(10, btn1, btn2, btn3);

Example:  creates an HBox pane using the default constructor, and then
--------  calls the setSpacing method to set the spacing to 10 pixels

HBox hbox = new HBox();
Hbox.setSpacing(10);

Example: Adding padding
-------

hbox.setPadding(new Insets(10));

Example: sets different padding value for each edge
--------

hbox.setPadding(new Insets(20, 10, 20, 10));   //the top and bottom padding is set to 20 and the right and left padding is set to 10.


*see table 4-2 in page 631 of the book for insts Constructors

To use the insets enumeration you need to have the following import:

import javafx.geometry.*;

Adding Space with Margins
-------------------------

Another way to add space around the nodes in a layout pane is to create margins
around the individual nodes.

Example: sets a margin of 10 pixels for all sides of a button named btn1

HBox hbox = new HBox();
hbox.setMargin(btn1, new Insets(10));  //hbox refers to an instance of the HBox class

Alternativlely:
---------------

Hbox.setMargin(btn1, new Insets(10));  //HBox refers to the class itself

Example: sets a different margin for each side of the pane

Hbox.setMargin(btn1, new Insets(10, 15, 20, 10));   //the top margin is 10 pixels, the right margin is 15 pixels, 
                                                    //the bottom  margin is 20 pixels, and the left margin is 10 pixels.

Adding Space by Growing Nodes
-----------------------------

A third way to add space between nodes in an HBox is to create a node whose sole
purpose is to add space between two HBox nodes. Then, you can configure the
spacer node that will automatically grow to fill any extra space within the pane.

The easiest way to create a spacer node is by using the Region class. The Region
class is the base class for both the Control class, from which controls such as
Button and Label derive. It is also the based class for the Pane class, from which
all the layout panes described in this chapter derive.

Example: creates three buttons and a spacer, set the margins for all
-------  three buttons to 10 pixels, and then add the three buttons and the spacer to an
         HBox such that the first two buttons appear on the left of the HBox and the third
         button appears on the right:

// Create the buttons
Button btn1 = new Button("One");
Button btn2 = new Button("Two");
Button btn3 = new Button("Three");
// Create the spacer
Region spacer = new Region();
// Set the margins
hBox.setMargin(btn1, new Insets(10));
hBox.setMargin(btn2, new Insets(10));
hBox.setMargin(btn3, new Insets(10));
// Set the Hgrow for the spacer
hBox.setHgrow(spacer, Priority.ALWAYS);
// Create the HBox layout pane
HBox hbox = new HBox(10, btn1, btn2, spacer, btn3);

Using the VBox Layout
---------------------

The VBox class is similar to the HBox class, but instead of arranging nodes horizontally
in a row, it arranges them vertically in a column.

*See Table 4-4 in page 635 of the book for constructors and methods of the VBox class.

you should include the following import statement in any program that uses an VBox:

import javafx.scene.layout.*;

Example: creates three buttons and uses a VBox to arrange them into a column:
-------

Button btn1 = new Button("Button One");
Button btn2 = new Button("Button Two");
Button btn3 = new Button("Button Three");
VBox vbox = new VBox(btn1, btn2, btn3);


Alternatively: You can use the default constructor and call the getChildren method
-------------

VBox vbox = new VBox();
Vbox.getChildren().addAll(btn1, btn2, btn3);

As with the HBox class, you can use spacing, padding, margins, and spacer
nodes to control the spacing of nodes within a VBox.

Example: sets 10 pixels of vertical space between nodes and 10 pixels of padding on each edge
-------  of the pane:

Button btn1 = new Button("One");
Button btn2 = new Button("Two");
Button btn3 = new Button("Three");
VBox vbox = new VBox(10, btn1, btn2, btn3);
vbox.setPadding(new Insets(10));

Example: creates a column of three buttons, with one button at the top of the column and
-------  two at the bottom, with 10 pixels of spacing and padding:

// Create the buttons
Button btn1 = new Button("One");
Button btn2 = new Button("Two");
Button btn3 = new Button("Three");
// Create the spacer
Region spacer = new Region();
// Set the Vgrow for the spacer
VBox.setVgrow(spacer, Priority.ALWAYS);
// Create the VBox layout pane
VBox vbox = new VBox(10, btn1, spacer, btn2, btn3);
vbox.setPadding(new Insets(10));


Aligning Nodes in a Layout Pane
-------------------------------

Both the HBox and the VBox layout panes have a setAlignment method that lets
you control how the nodes that are contained within the pane are aligned with one
another. The setAlignment method accepts a single argument, which is one of the
constants defined by the Pos enumeration.

The Pos enumeration is defined in the javafx.geometry package, so you should
include the following import statement in any program that uses Insets:
import javafx.geometry.*;

Example: create a vertical column of three buttons, centered within the pane:
-------

Button btn1 = new Button("Number One");
Button btn2 = new Button("Two");
Button btn3 = new Button("The Third Button");
VBox vbox = new VBox(10, btn1, btn2, btn3);
vbox.setPadding(new Insets(10));
vbox.setAlignment(Pos.CENTERED);

*See table 4-5 in page 638 of the book for a list of the Pos enumeration.

Making Nodes the Same Width
---------------------------

When you place a set of buttons or other controls in a layout pane, you may want
the buttons to all have the same width to create a neat, even appearance.

Example: three buttons are set to the same width

Button btn1 = new Button("Number One");
Button btn2 = new Button("Two");
Button btn3 = new Button("The Third Button");
btn1.setMaxWidth(Double.MAX_VALUE);
btn2.setMaxWidth(Double.MAX_VALUE);
btn3.setMaxWidth(Double.MAX_VALUE);
VBox vbox = new VBox(10, btn1, btn2, btn3);
vbox.setPadding(new Insets(10));
vbox.setAlignment(Pos.CENTERED);


Using the Flow Layout
---------------------

The flow layout comes in two flavors: horizontal and vertical. A horizontal flow
layout arranges its child nodes in a row until the width of the pane reaches a certain
size that you can specify. When that size is reached, the layout begins a new
row of child nodes beneath the first row. This flow continues, starting a new row
each time the size limit is reached, until all the child nodes have been placed.

*See Table 4-6 in page 639 of the book for constructors and methods for the FlowPane class.

The FlowPane class is defined in the javafx.scene.layout package, so you should
include the following import statement in any program that uses a flow layout:

import javafx.scene.layout.*;

Example: creates a horizontal layout with 10 pixels of horizontal and vertical gaps, 
-------  populated by five buttons, and a preferred wrap length of 300 pixels:

Button btn1 = new Button("Button One");
Button btn2 = new Button("Button Two");
Button btn3 = new Button("Button Three");
Button btn4 = new Button("Button Four");
Button btn5 = new Button("Button Five");
FlowPane pane = new FlowPane(Orientation.HORIZONTAL,
10, 10, btn1, btn2, btn3, btn4, btn5);
pane.setPrefWrapLength(300);

Using the Border Layout
-----------------------

The border layout is a pane that is carved into five regions: Top, Left, Center,
Right, and Bottom.

you should include the following import statement in any program that uses a border layout:

import javafx.scene.layout.*;

*See Table 4-7 in page 644 of the book for constructors and methods for the BorderPane class.

Example: The default constructor for this class creates an empty border layout, to which you
-------  can add nodes later, as in this example:

Button btn1 = new Button("Button One");
Button btn2 = new Button("Button Two");
Button btn3 = new Button("Button Three");
VBox vbox = new VBox(btn1, btn2, btn3);
BorderPane pane = new BorderPane();
pane.setCenter(vbox);

- three buttons are created and added to a VBox. Then, a border layout is
  created, and the VBox is added to its center region.

The following example assumes that you have already created five panes,
named centerPane, topPane, rightPane, bottomPane, and leftPane:


BorderPane pane = new BorderPane(centerPane,   //lets you add nodes to all five regions at once.
topPane, rightPane, bottomPane, leftPane);

Using the GridPane Layout
-------------------------

The grid pane layout manager lets you arrange GUI elements in a grid of rows and
columns. It automatically adjusts the width of each column and the height of each row based
on the components you add to the panel.

Sketching out a plan
--------------------

Before you create a grid pane layout, draw a sketch showing how you want the
components to appear in the panel. Then slice the panel into rows and columns,
and number the rows and columns starting with zero in the top-left corner.

After you have the panel sketched out, list the components, their x and y coordinates
on the grid, their alignment, and whether each component spans more than
one row or column.

After you lay out the grid, you can write the code to put each component in its
proper place.

Creating a grid pane
--------------------

*See Table 4-8 in page 648 of the book for constructors and methods of the
GridPane class, which you use to create a grid pane.

Example: creates a label, and then creates a grid pane and adds the label to the cell at column 0, row 0:
-------

Label lblName = new Label("Name");
GridPane grid = new GridPane();
grid.add(lblName, 0, 0);

If a node should span more than one column, you can call the setColumnSpan
method to specify the number of columns the node should span. 

Example: Here, the txtName node will span two columns. You use the setRowSpan in a similar
-------   way if you need to configure a node to span multiple rows.

grid.setColumnSpan(txtName, 2);

To control the horizontal alignment of a node, use the setHalignment method.

Example: Here, the lblName node is right-aligned within its column. The setValignment
-------  method works in a similar way.

grid.setHalignment(lblName, HPos.RIGHT);

Working with grid pane constraints
----------------------------------

You can control most aspects of a grid pane’s layouts using methods of the
GridPane class, but unfortunately, you can’t control the size of individual columns
or rows. To do that, you must use the ColumnConstraints or RowConstraints
class.

See Tables 4-9 and 4-10 in page 650 of the book for The ColumnConstraints Class contsructors and methods.

To use column constraints to set a fixed width for each column in a grid pane, first
create a constraint for each column. Then, add the constraints to the grid pane’s
constraints collection. Here’s an example:

ColumnConstraints col1 = new ColumnConstraints(200);
ColumnConstraints col2 = new ColumnConstraints(200);
ColumnConstraints col3 = new ColumnConstraints(200);
GridPane grid = new GridPane();
grid.getColumnConstraints().addAll(col1, col2, col3);

One of the most useful features of column constraints is their ability to distribute
the width of a grid pane’s columns as a percentage of the overall width of the grid
pane. For example, suppose the grid pane will consist of three columns and you
want them to all be of the same width regardless of the width of the grid pane. The
following code accomplishes this:

ColumnConstraints col1 = new ColumnConstraints();
col1.setPercentWidth(33);
ColumnConstraints col2 = new ColumnConstraints();
col2.setPercentWidth(33);
ColumnConstraints col3 = new ColumnConstraints();
col3.setPercentWidth(33);
GridPane grid = new GridPane();
grid.getColumnConstraints().addAll(col1, col2, col3);

In this example, each column will fill 33 percent of the grid.

Examining a grid pane example
-----------------------------










 */

