/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Working_With_Dates_and_Times;

/*
Page: 233

Working With Dates and Times
----------------------------

Picking the Right Date and Time Class for Your Application
----------------------------------------------------------

The first order of business when developing an application that must work with
dates or times (or both) is picking the Date-Time class to represent your date and
time values.

The java.time package defines ten distinct classes used to represent
different types of times and dates, as described on page 452 in Table 4-1 of the book.

Each of these classes has many different methods that let you create date and
time objects, perform calculations on them, compare them, and convert them to
strings that can be displayed and read by humans.

Using the now Method to Create a Date-Time Object
-------------------------------------------------

All Date-Time classes have a static now method, which creates an object representing
the current date and/or time.

- see TimeTester class as an example


Using the parse Method to Create a Date-Time Object
---------------------------------------------------

This method creates a Date-Time object from a string that represents a specific date or
time.

Example: This code creates a LocalDate object representing December 15, 2014:
-------

LocalDate d = LocalDate.parse("2014-12-15");

Example: This code sets the time to 3:45 p.m. on December 15, 2014:
-------

LocalDateTime dt;
dt = LocalDateTime.parse("2014-12-15T15:45");     //the letter T separates the date from the time, and the time is expressed
                                                  //in 24-hour clock format


If the string is not in the correct format, the parse method throws a DateTimeParseException. 
Whenever you use the parse method, you should enclose it in a try block and catch this exception,
as in this example:

LocalDateTime dt;
try
{
dt = LocalDateTime.parse("2014-12-15T03:45PM");
}
catch (DateTimeParseException ex)
{
System.out.println(ex.toString());
}

Using the of Method to Create a Date-Time Object
------------------------------------------------

Another way to create Date-Time objects is to use the static of method to create
a Date-Time object from its constituent parts.

Example: you can create a LocalDate object by supplying integers that represent the year, month, and day
-------

LocalDate date = LocalDate.of(2014,12,15);


Using the Month enumeration
---------------------------

Month is an enumeration that represents the twelve months of the year, as
follows:


Month.JANUARY 
Month.FEBRUARY 
Month.MARCH
Month.APR
................and etc.


Therefore you can create a date like this:

LocalDate date = LocalDate.of(2014,Month.DECEMBER,15);

The Month enumeration has some interesting methods which you might find occasionally useful. 

For example, you can print the number of days in December like this:

System.out.println("December hath "
+ Month.DECEMBER.length(false) + " days.");             //The boolean argument in the length method indicates whether 
                                                        //the calculation should be for a leap year

Using the ZoneId class
----------------------

The of method OffsetTime and OffsetDateTime classes use an additional class
named ZoneOffset to indicate the offset from UTC.


The ZoneOffset class has the following methods: 

» of(String offsetId)
» ofHours(int hours)
» ofHoursMinutes(int hours, int minutes)
» ofHoursMinutesSeconds(int hours, int minutes, int seconds)
» ofTotalSeconds(int totalSeconds)

Example: You can create a ZoneOffset of -8 hours like this:
-------

ZoneOffset z = ZoneOffset.ofHours(-8);

Alternatively
-------------

Example: You could specify the offset as a string, as in this example:
-------

ZoneOffset z = ZoneOffset.of("-08:00");

Note that when you use a string offset, you must provide two digits for the hours, minutes, and (optionally) seconds.
Once you have a ZoneOffset object, you can use it to create an OffsetTime, as in this example:

OffsetTime time = OffsetTime.of(10, 30, 0, 0, z);

Extracting Information About a Date
-----------------------------------

Several methods of the LocalDate class let you extract useful information about
a given date. 

Example: Here we extract the current year, month, and day:

LocalDate date = LocalDate.now();
int year = date.getYear();
int month = date.getMonthValue();
int day = date.getDayOfMonth();

Comparing Dates
---------------

You can’t compare Date-Time objects using Java’s standard comparison operators.

To test the equality of two dates, you must use the isEqual method, as in this
example:

if (LocalDate.now().isEqual(LocalDate.now()))
System.out.println("All is right in the universe.");


Calculating with Dates
----------------------

Just as you cannot use Java’s built-in comparison operators with dates, you also
may not use built-in mathematical operators. Instead, you can perform addition
and subtraction on dates using the various plus and minus methods, and you can
determine the difference between two dates by using the until method.

see Dates class as na example


To determine the difference between two dates, use the until method. It calculates
the difference between a date and the date passed as the first parameter,
measured in the units indicated by the second parameter.

See NumberOfDAys class as an example

A more complicated example: See InvoicingDate class 

Formatting Dates
-----------------

To display the date in a different format, such as 10-31-2014 or October 31, 2014, you can
use the format method of the LocalDate class along with a custom formatter you create using 
the DateTimeFormatter class. To specify the format you want to use, you pass the DateTimeFormatter
class a pattern string.

see FormatDateTime class as an example
NB: Remove on this line:
--
pattern = (pattern + " ").substring(0, 14);   //remove .substring(0, 14) for the code to run

Looking at a Fun Birthday Calculator
------------------------------------

see BirthdayFun class as na example





































 */
