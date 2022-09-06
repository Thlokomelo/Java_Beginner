/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1_Working_With_Strings;

/*
Page 378

Using the String Class
----------------------

» The String class is the class you use to create string objects.

»  Some useful methods of the string class below: (Page 378)

Finding the length of a string
------------------------------

Example: Using the length method:

String s = "A wonderful day for a neighbor.";
int len = s.length();

Here len is assigned a value of 31 because the string s consists of 30 characters.

Making simple string modification
---------------------------------

Example: Converting a string to lowercase

String s1 = "Oompa Loompa";
String s2 = s1.toLowerCase();

i.e. The toUppercase works the same way.

Example: Using the trim method (removes white space characters)

String s = " Oompa Loompa ";
s = s.trim();

Extracting characters from a string
-----------------------------------
Example: Here a program uses the charAt method to count the number
         of vowels in a string entered by the user.  see CountVowels class example.


Extracting substrings from a string using the substring method
--------------------------------------------------------------
» This method lets you extract a portion of a string. It also has
  two forms. The first version accepts a single integer parameter. It returns the
  substring that starts at the position indicated by this parameter and extends to
  the rest of the string.

Example:

String s = "Baseball";
String b = s.substring(4); // "ball"

» The second version of the substring method accepts two parameters to indicate
  the start and end of the substring you want to extract. Note that the substring
  actually ends at the character that’s immediately before the position indicated
  by the second parameter. So, to extract the characters at positions 2 through 5,
  specify 1 as the start position and 6 as the ending position. See MakVowels class example.


Splitting a string
------------------

» The split method is especially useful for splitting a string into separate strings based on a delimiter character.
  It carves a string into an array of strings separated by the delimeter character via string parameter. See Split class example.


» The string passed to the split method is actually a special type of string used for pattern recognition, called a regular expression.
  here are a few regular expressions that might be usefull when using the split method:

\\t A tab character
\\n A newline character
\\| A vertical bar
\\s Any white-space character
\\s+ One or more occurrences of any white-space character

See ListWords class  as an example.


Replacing parts of a string
---------------------------

The replaceFirst or replaceAll method is used to replace a part of a string
that matches a pattern you supply with some other text.

See Repalce class as example.

















*/
