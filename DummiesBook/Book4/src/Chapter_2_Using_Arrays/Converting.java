/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

import java.util.Arrays;

/*
Page: 421

Converting arrays to strings

routine that creates an array, fills it with random numbers, and then uses
the toString method to print the array elements:
 */

public class Converting {

    public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(lotto));
    }
}
