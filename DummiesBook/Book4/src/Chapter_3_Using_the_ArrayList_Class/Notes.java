/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Using_the_ArrayList_Class;

/*
Page: 424

Understanding the ArrayList Class
---------------------------------

» An array list is the most basic type of Java collection. 
  Its used to store dynamically sized collection of elements.

» An array list automatically resizes itself whenever necessary.

» An array list lets you insert elements into the middle of the collection.

» An array list lets you delete items.

»  The ArrayList class actually uses an array internally to store the data
   you add to the array list.

Arraylist methods and Constructors: page 426 of the book
-----------------------------------

Creating an ArrayList Object
----------------------------
Example:

ArrayList signs;             //decalare the ArrayList
signs = new ArrayList();     //call the ArrayList constructor to instantiate an ArrayList object and assign it to the variable


Alternatively: You can do it in a single line

ArrayList signs = new ArrayList();


Things to note about the ArrayList:
-----------------------------------

» The ArrayList class is in the java.util package, so your program must
  import either java.util.ArrayList or java.util.*.

» Unlike an array, an array list doesn’t make you specify a capacity — though
  you can if you want.

e.g. ArrayList signs = new ArrayList(100);

» The capacity of an array list is not a fixed limit.

» If you’re using Java 1.5 or later, you can also specify the type of elements the
  array list is allowed to contain.

 e.g. ArrayList<String> signs = new ArrayList<String>();


Adding Elements
---------------

After you create an array list, you can use the add method to add objects to the
array list. 

see String class and Nums class as an example

Accessing Elements
------------------

To access a specific element in an array list, you can use the get method, which
specifies the index value of the element you want to retrieve.

See Nums2 class as an example

Using an Iterator
-----------------

Another way to access all the elements in an array list (or any other collection
type) is to use an iterator. An iterator is a special type of object whose sole purpose
in life is to let you step through the elements of a collection.

see Iterator class example


Updating Elements
-----------------

You can use the set method to replace an existing object with another object.

see Nums3 class as an example

Deleting Elements
-----------------

The ArrayList class provides several methods that let you remove elements from
the collection. To remove all the elements, use the clear method, like this:

- emps.clear();

Here the first element in the array list is removed.

To remove a specific element, use the remove method. Like this:

- emps.remove(0);





















 */

