/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Using_Recursion;

/*
Page: 535

This program creates an array of 100 randomly selected numbers with values from 1–100. It
prints the array, uses the sorting methods (Sort, Partition and Swap methods) to sort
the array, and then prints the sorted array.

 */
public class QuickSortApp {

    public static void main(String[] args) {
        int LEN = 100;
        int[] unsorted = new int[LEN];            
        for (int i = 0; i < LEN; i++)              //This for loop assigns 100 random values to the array.

        unsorted[i]
                = (int) (Math.random() * 100) + 1;
        System.out.println("Unsorted array:");     
        printArray(unsorted);                      //method is called to print the unsorted array.

        int[] sorted = sort(unsorted);             //The sort method is called to sort the array.

        System.out.println("\n\nSorted array:");
        printArray(sorted);                       //method is called again to print the sorted array.

    }

    private static void printArray(int[] array) {   //method
        System.out.println();
        for (int i = 0; i < array.length; i++) {    //print array elements
            if (array[i] < 10) {                    //prints a space before the value if the value is less than 10
                System.out.print(" ");
            }
            System.out.print(array[i] + " ");
            if ((i + 1) % 20 == 0) {                //the remainder operator (%) is used to call the println method every 20 elements
                System.out.println();
            }
        }
    }
    private static int[] a;                        //variable a is used to hold the array while it is being sorted

    public static int[] sort(int[] array) {        //1st sort method accepts an int as a parameter
        a = array;
        sort(0, a.length - 1);                     //2nd sort method is called to sort the entire array
        return a;                                    //returns an int array with the sorted values.
    }

    public static void sort(int low, int high) {   //2nd sort method sorts the partition indicated by the parameters.
        if (low >= high) {
            return;
        }
        int p = partition(low, high);
        sort(low, p);
        sort(p + 1, high);
    }

    
       //i is incremented until it finds another value that is less than
      //j is decremented until it finds another value that is greater than
    //Then the swap method is called to swap the two values
    public static int partition(int low, int high) {   //method
        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;
        while (i < j) {
            for (i++; a[i] < pivot; i++);
            for (j--; a[j] > pivot; j--);
            if (i < j) {
                swap(i, j);
            }
        }
        return j;
    }

    public static void swap(int i, int j) {  //method exchanges the two indicated values
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
