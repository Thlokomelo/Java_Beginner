/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/*
Page: 396
Using for Loops with Arrays

Here’s a for loop that creates
an array of 100 random numbers, with values ranging from 1 to 100:
 */
public class Numbers {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
            System.out.println(i);
        }

        
    }

}
