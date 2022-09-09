/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_the_LinkedList_Class;

/*
Page: 438

Understanding the LinkedList Class
----------------------------------

A linked list is a collection in which every object in the list maintains with it a
pointer to the following object in the list and another pointer to the preceding
object in the list. No array is involved at all in a linked list. Instead, the list is managed
entirely by these pointers.

Some important things to note:

- You can keep adding items to a linked list until your computer runs out of memory.
- To insert an item into the middle of a linked list, all you have to do is change the
  pointers in the preceding and the following objects.
- To remove an item from a linked list, all that’s necessary is
  to update the pointers in the items that were before and after the item to be
  removed.

Linked lists are especially well suited for creating two common types of lists:

- Stacks: A stack is a list in which items can be added to and retrieved from
          only the front of the list.
- Queues: A queue is a list in which items are always added to the back of the
          list and always retrieved from the front.


Creating a LinkedList
---------------------

- First, you declare a LinkedList variable; then you call one of the LinkedList constructors
  to create the object, as in this example:

   LinkedList officers = new LinkedList();    // Here a linked list is created and assigned to the variable officers.

- You can also specify a type. e.g.

  LinkedList<String> officers = new LinkedList<String>();


Adding Items to a LinkedList
-----------------------------

- Using the add method:

Example: see Officers class

- Using the addFirst and addLast Methods

Example: see AddFirst

Note, the AddLast method works the same way as the normal add method which adds items to the back of the List.

- To insert Objects into a specific position in the list you need to specify the index in the add method.

Retrieving Items from a LinkedList
-----------------------------------

You can use an enhanced for loop to retrieve all the items in the linked list. For example:

for (String s : officers)
System.out.println(s);

The LinkedList class has a variety of methods that you can use to retrieve items from
the list.

The following are used to retrieve the first item in the list:

» getFirst: Retrieves the first item from the list. This method doesn’t delete
  the item. If the list is empty, NoSuchElement-Exception is thrown.

» element: Identical to the getFirst method. This strangely named method
  exists because it’s defined by the Queue interface, and the LinkedList class
  implements Queue.

» peek: Similar to getFirst but doesn’t throw an exception if the list is empty.
  Instead, it just returns null. (The Queue interface also defines this method.)

» peekFirst: Identical to peek. Only the name of the method is changed to
  protect the innocent.

» remove: Similar to getFirst but also removes the item from the list. If the list
  is empty, it throws NoSuchElementException.

» removeFirst: Identical to remove. If the list is empty, it throws
  NoSuchElementException.

» poll: Similar to removeFirst but returns null if the list is empty. (This
  method is yet another method that the Queue interface defines.)

» pollFirst: Identical to poll (well, identical except for the name of the method).

» pop: Identical to removeFirst (but with a catchier name).


The following are used to retrieve the last item in the list:

» getLast: Retrieves the last item from the list. This method doesn’t delete the
item. If the list is empty, NoSuchElement-Exception is thrown.

» peekLast: Similar to getLast but doesn’t throw an exception if the list is
empty. Instead, it just returns null.

» removeLast: Similar to getLast but also removes the item. If the list is empty,
it throws NoSuchElementException.

» pollLast: Similar to removeLast but returns null if the list is empty.


Updating LinkedList Items
-------------------------

As with the ArrayList class, you can use the set method to replace an object in
a linked list with another object.

Example: See Update class


Removing LinkedList Items
-------------------------

We’ve already seen that several of the methods that retrieve items from a linked
list also remove the items. However, we can also remove any arbitrary item by specifying either its index number or
a reference to the object we want to remove on the remove method.

Example: See Remove class








 */

