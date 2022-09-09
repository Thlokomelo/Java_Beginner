/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chapter1_Working_With_Strings;

/*
Reviewing Strings
-----------------

» Java lets you assign string literals to string variables:

Example:

String line1 = "Oh what a beautiful morning!";

» Strings can include escape sequences that consist of a slash followed by
  another character. 
  Example:


\n Newline
\t Tab
\b Backspace
\r Carriage return
\f Form feed
\' Apostrophe
\" Quotation mark
\\ Back slash


» Strings and characters are different. String literals are marked by quotation
  marks; character literals are marked by apostrophes. Thus, "a" is a string
  literal that happens to be one character long. By contrast, 'a' is a character
  literal.

» You can combine, or concatenate, strings by using the + operator, like this:

  String line2 = line1 + “\nOh what a beautiful day!”;

» You can also use the += operator with strings, like this:
  
  line2 += “\nI’ve got a beautiful feeling”;

» When a primitive type is used in a concatenation expression, Java automatically
 converts the primitive type to a string. Thus Java allows the following:

int empCount = 50;
String msg = "Number of employees: " + empCount;

» The various primitive wrapper classes (such as integer and double) have
  parse methods that can convert string values to numeric types. Here’s an
  example:

String s = "50";
int i = Integer.parseInt(s);

THE IMMUTABLE PATTERN
---------------------

- An immutable object is an object that, once created, can never be changed.
- The String class is the most common example of an immutable object. After you 
  create a String object, you can’t change it.

Rules for creating an immutable object
--------------------------------------

» Provide one or more constructors that accept parameters to set the initial state of
  the object.
» Don’t allow any methods to modify any instance variables in the object. Set instance
  variables with constructors and then leave them alone.
» Any method that modifies the object should do so by creating a new object with the
  modified values. Then this method returns the new object as its return value.






















*/
