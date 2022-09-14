/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Creating_Generic_Collection_Classes;

/*
Page: 450

Generic Programming
-------------------

It makes the code stable by detecting the bugs at compile time. Before generics, 
  we can store any type of objects in the collection, i.e., non-generic. Now generics 
  force the java programmer to store a specific type of objects.


Creating a Generic Class
------------------------

You must use formal type parameters, that is you list the type parameter after the class name
in angle brackets.

Example 1: lass declaration for the Array List class
---------

public class ArrayList<E>

- The E parameter specifies the type of the elements that are stored in the
  list.

Example 2: The declaration for the add method for the ArrayList class
----------

public boolean add(E o)
{
// body of method omitted (thank you)
}

- this method declaration specifies that the type for the o parameter is the type specified
  for the formal type parameter E. E is Employee, that means the add method only
  accepts Employee objects.

Example 3: Uses a formal type parameter as a return type. Here’s the declaration for the get method
----------

public E get(int index)
{
// body of method omitted (you're welcome)
}

- Here E is specified as the return type. That means that if E is Employee, this
  method returns Employee objects.


One final technique you need to know before moving on: You can use the formal
type parameter within your class to create objects of any other class that accepts
formal type parameters.

Example 4: The clone method of the ArrayList class is written like this

public Object clone()
{
try
{
ArrayList<E> v = (ArrayList<E>) super.clone();
v.elementData = (E[])new Object[size];
System.arraycopy(elementData, 0,
v.elementData, 0, size);
v.modCount = 0;
return v;
}
catch (CloneNotSupportedException e)
{
// this shouldn't happen since we're Cloneable
throw new InternalError();
}
}

- The most important thing to note in the above method is that the statement in the try block declares an ArrayList of type <E>.
  Therefore the ArrayList class uses its own formal type parameter to create another array list object of the same type.


A Generic Stack Class
---------------------

A stack is a simple type of collection that lets you add objects to the top of the collection and remove them
from the top.

see GenStackClass as an example

Using Wildcard-Type Parameters
------------------------------

The question mark (?) is known as the wildcard in generic programming. It represents an unknown type.

If you want to create a method that accepts any type of ArrayList, you
have to code the method like this:

public void addItems(ArrayList<?> list)

If you want a method to accept an ArrayList of Employee objects for example, HourlyEmployee objects, or Salaried
Employee objects, you would code it like this:

public void addItems(ArrayList<? extends Employee> list)

A Generic Queue Class
---------------------

queue is another type of collection that lets you add objects to the end of the collection and remove 
them from the top.

See GenQueue class as an example

Using the Diamond Operator
--------------------------

The Diamond operator lets you skip the type when you call the constructor.It simply deduces the correct type based on the variable’s
type.

Examples: 

ArrayList<String> nums = new ArrayList<>();            //type not included in constructor

And 

ArrayList<String> nums;
nums = new ArrayList<>();                            //type not included in constructor












 */
