/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/*
Page: 400

Using the Enhanced for Loop

Program prints each of the strings in the array on a separate line.
 */


public class DaysOfTheWeek {

    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday",
            "Friday", "Saturday"};
        for (String day : days) {                     //enhanced for loop (type identifier :array name)
            System.out.println(day);
        }
    }

}
