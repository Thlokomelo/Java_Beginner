/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/**
 *
 * @author thlok
 */
public class DaysOfTheWeek2 {

    public static void main(String[] args) {
        String[] days = getDaysOfWeek();
        System.out.println(days);
     
    }

    public static String[] getDaysOfWeek() {
        String[] days = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday",
            "Friday", "Saturday"};
        return days;
    }
    

}
