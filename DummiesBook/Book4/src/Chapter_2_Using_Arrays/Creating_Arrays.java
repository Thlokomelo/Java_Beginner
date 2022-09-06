/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/*
Page 394

Creating Arrays
---------------

» Before you can create an array, you must declare a variable that refers to the array.

  String[] names;

  Here a variable named names is declared. Its type is an array of String objects.


» The following two statements both create arrays of int elements:

  int[] array1; // an array of int elements

  int array2[]; // another array of int elements

Two ways to create arrays:
----------------------

1.

String[] names;
names = new String[10];

2. 
String[] names = new String[10];

Example: Here’s a routine from a method that stores player names in an array of strings.
         It starts by asking the user how many players are on the team. Then it creates 
         an array of the correct size:

            System.out.print("How many players? ");
            int count = sc.nextInt();                 // sc is a Scanner accepts int input
            String[] players = new String[count];
















 */
