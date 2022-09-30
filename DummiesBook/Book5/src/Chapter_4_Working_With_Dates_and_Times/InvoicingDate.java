/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Working_With_Dates_and_Times;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Page: 553

This code displays the number of days from the current date until the next invoicing
date:
 */

public class InvoicingDate {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate invDate = LocalDate.of(today.getYear(),
                today.getMonthValue(), 15);
        if (today.getDayOfMonth() > 15) {
            invDate = invDate.plusMonths(1);
        }
        long daysToInvoice = today.until(invDate,
                ChronoUnit.DAYS);                          //an enumeration that defines the various units of time that can be
                                                           // used in date and time calculations.
        System.out.println(daysToInvoice
                + " until next invoice date.");
    }
}




/*
This example works by first getting the current date, then creating a new Local-
Date object that represents the 15th of the current month. Then, if the current day
of the month is greater than 15, it adds one month to the invoicing date. In other
words, if it is the 16th or later, invoicing occurs on the 15th of the following month,
not of this month. Then it uses the until method to determine the number of days
between the current date and the next invoicing date.
*/
