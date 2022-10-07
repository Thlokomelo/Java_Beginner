/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_6_Choosing_from_a_List;

/*
Page: 681

Using Choice Boxes
------------------

A choice box is a control that lets the user choose an item from a drop-down list.
Initially, the choice box shows just the item that’s currently selected. When the
user clicks the choice box, the list of choices reveals.

*See Table 6-1 in page 682 of the book for constructors and methods of the ChoiceBox class.

Creating a choice box
---------------------

You specify a type for the list that will be associated with the choice box. For example:

ChoiceBox<String> choice = new ChoiceBox<String>();         //a choice box that displays strings is created

The next step is to add items to the choice box. 
Here the getItems method is called to access the list of items and then calling the add method to add an item:

choice.getItems().add("Bashful");
choice.getItems().add("Doc");
choice.getItems().add("Dopey");
choice.getItems().add("Grumpy");
choice.getItems().add("Happy");
choice.getItems().add("Sleepy");
choice.getItems().add("Sneezy");

Alternatively, you could call the addAll method and add all the strings at once,
like this:

choice.getItems().addAll("Bashful", "Doc", "Dopey",
                          "Grumpy", "Happy", "Sleepy",
                          "Sneezy");

To display the contents of a choice box without waiting for the
user to click the box, call the show method, like this:

choice.show();

To hide the list, call the hide method:

choice.hide();

Setting a default value
-----------------------

By default, a choice box has no initial selection when it’s first displayed. To set an
initial value, call the setValue method, passing it the list object that you want to
make the initial selection.

Example:

choice.setValue("Dopey");

Getting the selected item
-------------------------

You can call the getValue method to get the item selected by the user.

The getValue method is often used in the action event handler for a button. For
example:

public void btnOK_Click()
{
String message = "You chose ";
message += apollo13.getValue();
Alert a = new Alert(Alert.AlertType.INFORMATION, message);
a.setTitle("Your Favorite Astronaut");
a.showAndWait();
}

Working with Observable Lists
-----------------------------

The object returned by the getItems method are called an observable list; it represents
the list displayed by the choice box.

So far in this book, we have learned about two methods of the ObservableList interface:
add and addAll, which lets you add items to the observable list. 

Example: Add method

cbox.getItems().add("Bashful");

Example: AddAll method

pane.getChildren().addAll(btnOK, btnCancel);

*See Table 6-2 in page 686 of the book for methods of the ObservableList class.
---------------------------------------------------------------------------------------------------------
NB: any method that can be used with an ArrayList can also be used with an ObservableList.

For example, you can clear the contents of a choice box in the same way you’d clear the contents of an array list:

cbox.getItems().clear();

If you need to know how many items are in a choice box, call the size method:

int count = cbox.getItems().size();

To remove a specific item from the list, use the remove method:

cbox.getItems().remove("Grumpy");

Listening for Selection Changes
-------------------------------

Unfortunately, the choice box and other list controls don’t generate an action event
when the user changes the selection. As a result, the ChoiceBox class doesn’t have
a setOnAction method. Instead, you must use a complicated sequence of method
calls to set up a different type of event listener, called a change listener.

Here are the steps:

1. Get the selection model by calling the getSelectionModel method on the choice box.

2. Get the selectedItem property by calling the selectedItemProperty method on the selection model.

3. Add a change listener by calling the addListener method on the selected Item property.

You normally do all three of these steps in a single statement, as in this example:

choice.getSelectionModel().selectedItemProperty()
.addListener( (v, oldValue, newValue) ->
lbl.setText(newValue); );

//Here the change listener sets the value displayed by a label control to the new value selected by the user.


The changed method receives three arguments:

» observable: The property whose value has changed
» oldValue: The previous value of the property
» newValue: The new value of the property


Using Combo Boxes
-----------------

- A combo box is a more advanced sibling to the choice box control. The main
  improvements you get with a combo box are:

- A combo box includes the ability to limit the number of items displayed
  when the list is shown.

- A combo box includes a text field that lets the user enter a value directly
  rather than select the value from a list.

- A combo box fires an action event whenever the user changes the
  selection.

*See Table 6-3 in page 691 of the book for constructors and methods of the ComboBox class.

Creating combo boxes
--------------------

A ComboBox is generic, therefore you need to specify a type for the items it will contain, as in this example:

ComboBox<String> cbox = new ComboBox<String>();

- The next step is to use the getItems method to access the ObservableList object that
  contains the content of the list displayed by the combo box.

Example: adds items to the list
-------

cbox.getItems().addAll("Bashful", "Doc", "Dopey",
"Grumpy", "Happy", "Sleepy",
"Sneezy");

- To allow the user to edit the text field, use the setEditable method, like this:

   cbo.setEditable(true);  //user can type a value that’s not in the combo box.

- You can limit the number of items displayed by the list by calling the setVisibleRows method:

   cbo.setVisibleRows(10);    //list displays a maximum of ten items

- You can also specify a prompt text to display in the text field component of a
  combo box by calling the setPromptText method:

  cbo.setPromptText("Make a choice");   //text is displayed in the text field

Getting the selected item
-------------------------

Use the getValue method, just as you do for a choice box. You typically do that in an 
action event handler that responds to a button click. For example:

public void btnOK_Click()
{
String message = "You chose ";
message += cbo.getValue();
Alert a = new Alert(Alert.AlertType.INFORMATION,
msg);
a.setTitle("Your Choice");
a.showAndWait();
}

Handling combo box events
-------------------------

If you want to provide immediate feedback when the user selects an item, you can
set up an event handler by calling the combo box’s setOnAction method.

Example: method displays a message box that says My favorite too! if the user picks Dopey:

Public void cbo_Changed()
{
if (if cbo.getValue().equals("Dopey"))
{
Alert a = new Alert(Alert.AlertType.INFORMATION,
"He's my favorite too!",
a.setTitle("Good Choice");
a.showAndWait();
}
}

Here’s the code to call this method whenever the user changes the combo box
selection:

cbo.setOnAction (e -> cbo_Changed() );

Using List Views
----------------

A list view is a powerful JavaFX control that displays a list of objects within a box.
Depending on how the list is configured, the user can select one item in the list or
multiple items.

List views and combo boxes have several important differences:

- A list view doesn’t have a text field that lets the user edit the selected
  item. Instead, the user must select items directly from the list view.

- The list view doesn’t drop down. Instead, the list items display in a box
  whose size you can specify.

- The items in a list view can be arranged vertically (the default) or
horizontally. 

- List views allow users to select more than one item. By default, a list view
  lets users select just one item, but you can easily configure it to allow for
  multiple selections.

*See Table 6-4 in on page 695 of the book for constructors and methods of the ListView class.

Creating a list view control is similar to creating a combo box.

Example: 

ListView list = new ListView();
list.getItems().addAll("Sausage", "Pepperoni",
"Linguica", "Salame", "Olives", "Mushrooms",
"Onions", "Peppers", "Pineapple", "Spinach",
"Canadian Bacon", "Tomatoes", "Kiwi",
"Anchovies", "Gummy Bears");

By default, the list view control allows only a single selection to be made. To allow
multiple selections, add this line:

list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

To arrange the list view horizontally rather than vertically, add this line:

list.setOrientation(Orientation.HORIZONTAL);

Getting the selected items
--------------------------

First, you must get the selection model object by calling the getSelectionModel. 
Then, you call the selection model’s getSelectedItems method. 
This returns a read-only observable list that contains just the items that have been selected.

Example: Builds a string that lists all the items selected by the user for the pizza toppings list view
-------  

String tops = "";                //string will contain all the toppings selected by the user
ObservableList<String> toppings;
toppings = list.getSelectionModel().getSelectedItems();
for(String topping : toppings)
{
tops += topping + "\n";         //separates toppings by new line characters
}

Using Tree Views
----------------

A tree view is a fancy JavaFX control that displays hierarchical data in outline form.

Elements of a tree:

- Node: Each element in the tree is a node. Each node in a tree is created from
        TreeItem class. The TreeItem class is a generic class, so you can associate a
        type with it. Thus, you can create a tree using objects of any type you wish,
        including types you create yourself.

- Root node: A root node is the starting node for a tree. Every tree must have
             one — and only one — root node. When you create a tree component, you
             pass the root node to the TreeView constructor.

- Child node: The nodes that appear immediately below a given node are that
              node’s child nodes. A node can have more than one child.

- Parent node: The node immediately above a given node is that node’s parent
               node. Every node except the root node must have one — and only one —parent.

- Sibling nodes: Sibling nodes are children of the same parent.

- Leaf node: A leaf node is one that doesn’t have any children.

- Path: A path contains the node and all its ancestors — that is, its parent, its
  parent’s parent, and so on — all the way back to the root.

- Expanded node: An expanded node is one whose children are visible.

- Collapsed node: A collapsed node is one whose children are hidden.

Building a tree
---------------

Before you can actually create a tree view, you must first build the tree it displays.

*See Table 6-5 on page 698 of the book for constructors and methods of the TreeItem class.

1. The first step in creating a tree is declaring a TreeItem variable for each node that isn’t a leaf node.

Example: For a TV series

TreeItem andy, archie, happy,
george, maude;

2. Next, create the root node and set its expanded status to true so that it will expand when the tree displays initially:

TreeItem root = new TreeItem("Spin Offs ");
root.setExpanded(true);

3. Use a helper to simplify the task of creating all the other nodes:

public TreeItem<String> makeShow(String title,
TreeItem<String> parent)
{
TreeItem<String> show = new TreeItem<String>(title);
show.setExpanded(true);
parent.getChildren().add(show);
return show;
}

This method accepts a string and another node as parameters, and returns a node
whose user object is set to the String parameter. The returned node is also added
to the parent node as a child, and the node is expanded. Thus you can call this
method to both create a new node and place the node in the tree.

3. The next step is creating some nodes. Below example starts with the nodes 
for The Andy Griffith Show and its spinoffs:

andy = makeShow("The Andy Griffith Show", root);
makeShow("Gomer Pyle, U.S.M.C.", andy);
makeShow("Mayberry R.F.D.", andy);


Here, makeShow is called to create a node for The Andy Griffith Show, with the root
node specified as its parent. The node returned by this method is saved in the
andy variable. Then makeShow is called twice to create the spinoff shows, this time
specifying andy as the parent node.

4. Next, You create nodes for All in the Family and its spinoffs:

archie = makeShow("All in the Family", root);
george = makeShow("The Jeffersons", archie);
makeShow("Checking In", george);
maude = makeShow("Maude", archie);
makeShow("Good Times", maude);
makeShow("Gloria", archie);
makeShow("Archie Bunker's Place", archie);

In this case, The Jeffersons and Maude have child nodes of their own. As a result,
variables are required for these two shows so that they can be passed as the parent
parameter to makeShow when I create the nodes for Checking In and Good Times.

5. Finally, here’s the code that creates the nodes for Happy Days and its spinoffs:

happy = makeShow("Happy Days", root);
makeShow("Mork and Mindy", happy);
makeShow("Laverne and Shirley", happy);
makeShow("Joanie Loves Chachi", happy);

The complete tree is successfully created in memory, so I can get on with the task
of creating a TreeView control to show off the tree.

Creating a TreeView control
---------------------------

*See Table 6-6 on page 701 of the book for constructors and methods of the TreeView Class.

The first step in creating a TreeView control is declaring a TreeView variable as a
class instance variable so that you can access it in any method within your program,
as follows:

TreeView tree;

Then, in the application’s start method, you call the TreeView constructor to
create the tree view control, passing the root node of the tree you want it to display
as a parameter:

tree = new TreeView(root);

By default, the user can select just one node from the tree. To allow the user to
select multiple nodes, use this strange incantation:

tree.getSelectionModel().setSelectionMode(
SelectionModel.MULTIPLE);

Getting the selected node
-------------------------

There are several ways to determine which node or nodes are currently selected
in a tree view. One way is to access the tree’s selection model by calling the
getSelectionModel. Then, you can call the selection model’s getSelectedItems
method to return a read-only observable list that contains the items that have
been selected.

For example:

String msg = "";
ObservableList<TreeItem<String>> shows =
tree.getSelectionModel().getSelectedItems();
for(TreeItem show : shows)
{
msg += show.getValue() + "\n";
}

In the preceding example, the msg string will contain all the shows that the user
has selected from the tree, separated by new line characters.

An alternative is to add an event handler that’s called whenever the selection
changes. You can do that like this:

tree.getSelectionModel().selectedItemProperty()
.addListener( (v, oldValue, newValue) ->
tree_SelectionChanged(newValue) );

Here, the getSelectionModel method is called to retrieve the selection model.
Then, the selectedItemProperty is called to retrieve the selected item property.
Finally, an event listener is created for this property by using a Lambda expression
that calls a method named tree_SelectionChanged. The value of the new selection
is passed as a parameter.

Here’s what the tree_SelectionChanged method looks like:

public void tree_SelectionChanged(TreeItem<String> item)
{
if (item != null)
{
lblShowName.setText(item.getValue());
}
}

Here, a label named lblShowName is updated to display the value of the newly
selected item. Note: An if statement is used to ensure that the item is not null.
That’s necessary because if the user deselects an item, the tree_Selection
Changed method will be called with a null value as its item parameter.



























 */
