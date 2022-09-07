/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/*

Page: 401

Using Arrays with Methods

You can write methods that accept arrays as parameters and return arrays as
return values. You just use an empty set of brackets to indicate that the parameter
type or return type is an array.

Example: Static method that creates and returns a String array with the names of
         the days of the week:

public static String[] getDaysOfWeek()
{
String[] days = { "Sunday", "Monday", "Tuesday",
"Wednesday", "Thursday",
"Friday", "Saturday" };
return days;
}

Example: Static method that prints the contents of any String array to the
         console, one string per line:

public static void printStringArray(String[] strings)
{
for (String s : strings)
System.out.println(s);
}













 */

