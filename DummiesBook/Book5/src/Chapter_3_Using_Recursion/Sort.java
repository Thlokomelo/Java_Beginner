/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Using_Recursion;

/*
From Page: 531 - 534

Using the Sort, Partition and Swap methods
 */
public class Sort {

    public static void main(String[] args) {
        xxxxxx
    }

    public static void sort(int low, int high) {   //method
        if (low >= high) {
            return;
        }
        int p = partition(low, high);  //method rearranges the array into two partitions so that all the 
        //values in the left partition are smaller than all the values in the right partition.
        sort(low, p);                 //Sorts the left
        sort(p + 1, high);            //Sorts the right
    }

    public static int partition(int low, int high) {
        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;
        while (i < j) {
            for (i++; a[i] < pivot; i++);   //i is incremented until it finds another value that is less than
            for (j--; a[j] > pivot; j--);   //j is decremented until it finds another value that is greater than
            if (i < j) {
                swap(i, j);
            }
        }
        return j;
    }

    //method moves the i element to a temporary variable, moves the j element to
    //the i element, and then moves the temporary variable to the j element.
    
    public static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
