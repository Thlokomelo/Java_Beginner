/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Creating_Generic_Collection_Classes;

/*
Page: 454

A Generic Stack Class

The GenStack class uses a LinkedList to implement the stack. For the most part,
this class simply exposes the various methods of the LinkedList class using
names that are more appropriate for a stack.

 */


import java.util.*;

public class GenStack<E> {                                //Accepts formal type parameter <E>

    private LinkedList<E> list = new LinkedList<E>();    //LinkedList is declared with the same type as the GenStack class

    public void push(E item) {                           //Method accepts a parameter of type E
        list.addFirst(item);                             //Method adds the item to the beginning of the list
    }

    public E pop() {                                     //Method returns a value of type E
        return list.poll();                             //Method removes and returns the first element in the linked list
    }

    public E peek() {                                   //Method returns a value of type E
        return list.peek();                             //Method returns the top item without removing it
    }

    public boolean hasItems() {                         //Method returns the opposite of the linked list’s isEmpty method.
        return !list.isEmpty();
    }

    public int size() {                                 //Method simply returns the result of the linked list’s size method.
        return list.size();
    }
}
