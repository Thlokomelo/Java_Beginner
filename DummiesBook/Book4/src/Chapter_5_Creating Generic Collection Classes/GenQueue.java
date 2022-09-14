/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Creating_Generic_Collection_Classes;

/*
Page: 459

A Generic Queue Class

The GenQueue class uses a LinkedList to implement its queue
 */

import java.util.*;

public class GenQueue<E>                                     //Class specifies the formal type parameter <E>	
{
    private LinkedList<E> list = new LinkedList<E>();	     //class uses a private LinkedList object list to keep its items

    public void enqueue(E item)	                            //method accepts a parameter of type E
    {
        list.addLast(item);                                 //method used to add the item to the end of the queue
    }

    public E dequeue()	                                    //method returns a value of type E.
    {
        return list.poll();                                 //method to used to return the first item in the list.
    }

    public boolean hasItems()                               //method returns the opposite of the linked list’s isEmpty 
    {
        return !list.isEmpty();                            
    }

    public int size()	                                    //method returns the result of the linked list’s size method.
    {
        return list.size();                                
    }

    public void addItems(GenQueue<? extends E> q)	//method accepts a parameter that must be another
                                                        //GenQueue object whose element type is either the same type as this
                                                        //GenQueue object’s elements or a subtype of this GenQueue object’s
                                                        //element type.
    {
        while (q.hasItems())                            //remove all the items from the q parameter and add them to this queue.
            list.addLast(q.dequeue());
    }
}
