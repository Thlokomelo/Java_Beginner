/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/*
Page: 416

Using the Arrays Class
----------------------

 » provides a collection of static methods that are useful for working with arrays.

    List of Static methods: Page 416 of the book

Filling an array
----------------
The fill method can be handy if you want to prefill an array with values other
than the default values for the array type.

Example: Routine that creates an array of integers and initializes each element to 100:

int[] startValues = new int[10];
Arrays.fill(startValues, 100);

Copying an array
----------------
The copyOf and copyOfRange methods, allow ypu to copy a bunch of elements from an existing
array into a brand-new array.

See Listing 2.3. The CopyDemo class

Sorting an array
----------------

The sort method is a quick way to sort an array in sequence.

see sort class as an example

Searching an array
------------------

The binarySearch method is an efficient way to locate an item in an array by its
value.

see search class as an example

Comparing arrays
----------------

If you use the equality operator (==) to compare array variables, the array variables
are considered to be equal only if both variables point to exactly the same
array instance. To compare two arrays element by element, you should use the
Arrays.equal method instead. For example:

if (Arrays.equal(array1, array2))
System.out.println("The arrays are equal!");

Converting arrays to strings
----------------------------

The toString method of the Arrays class is handy if you want to quickly dump the
contents of an array to the console to see what it contains




 */

