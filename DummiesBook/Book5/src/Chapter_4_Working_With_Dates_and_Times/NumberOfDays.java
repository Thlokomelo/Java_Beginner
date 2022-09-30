/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Working_With_Dates_and_Times;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Page: 553

This code determines the number of days between May 16, 2014 and December 15, 2014
 */
public class NumberOfDays {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("2014-05-16");
        LocalDate date2 = LocalDate.parse("2014-12-15");
        System.out.println(date1.until(date2, ChronoUnit.DAYS));    //an enumeration that defines the various units of time that can be
                                                                    // used in date and time calculations.
    }
}
