/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1_Working_With_Strings;

/*
Page: 387

Using the StringBuilder and StringBuffer Classes
------------------------------------------------

» The StringBuilder and StringBuffer classes are mirror images. Both have the
  same methods and perform the same string manipulations. The only difference
  is that whereas the StringBuffer class is safe to use in applications that work
  with multiple threads, StringBuilder is not safe for threaded applications but is
  more efficient than StringBuffer. As a result, you should use the StringBuilder
  class unless your application uses threads.


Creating a StringBuilder object
-------------------------------

» You can’t assign string literals directly to a StringBuilder object, as you can
  with a String object. The StringBuilder class, however, has a constructor that
  accepts a String as a parameter.

Example:

StringBuilder sb = new StringBuilder("Today is the day!");


Using StringBuilder/StringBuffer methods
----------------------------------------

See page 389 of book.

Here are a few examples:

» append(primitiveType) 
  - Appends the string representation of the primitive type to the end of
  the string.

» append(Object) 
  - Calls the object’s toString method and appends the result to the end
    of the string.

» append(CharSequence)
  - Appends the string to the end of the StringBuilder’s string value. The
    parameter can be a String, StringBuilder, or StringBuffer.

See StringBuilderApp class as an example.







 */

