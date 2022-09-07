/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/*
Page: 401

Two-Dimentiional Arrays
-----------------------

These are sometimes called arrays of arrays. They are often
used to track data in column-and-row format. Just like in a spreadsheet.

Creating a two-dimensional array
--------------------------------

Example: Declaring and array

double sales[][];  //row and column.

i.e. sales is an array of double arrays.

Example: DEclaring and creating an array

sales = new double[5][4];   //5 rows and 4 columns


Accessing two-dimensional array elements
----------------------------------------

Example:This statement sets a years sales for the a region region

sales[0][0] = 23853.0;


Initializing a two-dimensional array
-------------------------------------

Example:

double[][] sales =
{ {23853.0, 22838.0, 36483.0, 31352.0}, // 2004
{25483.0, 22943.0, 38274.0, 33294.0}, // 2005
{24872.0, 23049.0, 39002.0, 36888.0}, // 2006
{28492.0, 23784.0, 42374.0, 39573.0}, // 2007
{31932.0, 23732.0, 42943.0, 41734.0} }; // 2008

Using jagged arrays
-------------------

Java lets you create two-dimensional arrays in which
the length of each element of the main array is different. This is sometimes called
a jagged array because the array doesn’t form a nice rectangle. Instead, its edges
are jagged.

See JaggedArray class example.

Going beyond two dimensions
---------------------------
Java doesn’t limit you to two-dimensional arrays. Arrays can be nested within
arrays, to as many levels as your program needs.

  » Declaring an array with more than two dimensions:
    -------------------------------------------------

    int[][][] threeD = new int[3][3][3];                           //row/column/elements

    Here a three-dimensional array is created, with each dimension having three elements.
    You can think of this array as a cube. Each element requires three indexes
    to access.


  » Accessing a multidimensional array:
    -----------------------------------

    threeD[0][1][2] = 100;                                    //row/column/elements

    This statement sets element 2 in column 1 of row 0 to 100.


     » nesting initializers For example:
       ---------------------------------

       int[][][] threeD =                            //row/column/elements
       { { {1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} },
       { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
       { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} } };

Here a 3-dimensional array is initialised with the numbers 1 through to 27.


 */
