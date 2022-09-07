/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays.Listings;

/*
Page: 417

Copying an Array

Program has an array named arrayOriginal,
and its array elements are then copied to a new array named
arrayNew

 */
import java.util.Arrays;

class CopyDemo {

    public static void main(String args[]) {
        int arrayOriginal[] = {42, 55, 21};           //array initialised
        int arrayNew[]                               //new array is declared and ..
                = Arrays.copyOf(arrayOriginal, 3);   // ..initilaised by using the CopyOf method to copy elemnts from the previous array. Elements are set to 3
        printIntArray(arrayNew);                     //method is called
    }

    static void printIntArray(int arrayNew[]) {     //method
        for (int i : arrayNew) {                   
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}

/*
Alternatives:
Increasing the number of elemnts:
---------------------------------

int arrayNew[] = Arrays.copyOf(arrayOriginal, 8); 

Using the CopyRange method
----------------------------

int arrayOriginal[] = {42, 55, 21, 16, 100, 88};
int arrayNew[] = Arrays.copyOfRange(arrayOriginal, 2, 5);
*/
