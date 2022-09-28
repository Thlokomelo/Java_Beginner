/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Regular_Expressions;

/*
Page: 505

Using Regular Expressions
--------------------------

a regular expression is a special type of pattern-matching string
that can be very useful for programs that do string manipulation. Regular
expression strings contain special pattern-matching characters that can be
matched against another string to see whether the other string fits the pattern.

Regular expressions are also useful for many other purposes, including searching
text files to see whether they contain certain patterns e.g. Google

Creating a Program for Experimenting with Regular Expressions
-------------------------------------------------------------

See Listing 2_1

Performing Basic Character Matching
-----------------------------------

- The simplest regex patterns match a string literal exactly, as in this example:

Enter regex: abc
Enter string: abc
Match.
Enter string: abcd
Does not match.

//Here the pattern abc matches the string abc but not abcd.

Using predefined character classes
----------------------------------

- A character class represents a particular type of character rather than a specific
  character. A regex pattern lets you use two types of character classes: predefined
  classes and custom classes.

Predefined Charactor Classes
----------------------------

Regex      Matches
-------------------
.          Any character
\d         Any digit (0–9)
\D         Any nondigit (anything other than 0–9)
\s         Any white-space character (space, tab, new line, return, or backspace)
\S         Any character other than a white-space character
\w         Any word character (a–z, A–Z, 0–9, or an underscore)
\W         Any character other than a word character


Example: The period is like a wildcard that matches any character, as in this example:

Enter regex: c.t
Enter string: cat
Match.
Enter string: cot
Match.
Enter string: cart
Does not match.

Example: Here’s a simple regex pattern that validates a U.S. Social Security number,
         which must be entered in the form xxx-xx-xxxx:

Enter regex: \d\d\d-\d\d-\d\d\d\d
Enter string: 779-54-3994
Match.
Enter string: 550-403-004
Does not match.

Example: The \D class matches any character that is not a digit. 
         Here’s a first attempt at a regex for validating droid names:

Enter regex: \D\d-\D\d
Enter string: R2-D2
Match.
Enter string: C2-D0
Match.
Enter string: C-3PO
Does not match.

Example: The \s class matches white-space characters including spaces, tabs, newlines,
         returns, and backspaces. This class is useful when you want to allow the user to
         separate parts of a string in various ways, as in this example.

Enter regex: ...\s...
Enter string: abc def
Match.
Enter string: abc def
Match.

Example: The \w class identifies any character that’s normally used in words, 
         including uppercase and lowercase letters, digits,
         and underscores. An example shows how all that looks:

Enter regex: \w\w\w\W\w\w\w
Enter string: abc def
Match.
Enter string: 123 456
Match.
Enter string: 123_456    //_ is a word character
Does not match.

Using custom character classes
------------------------------

To create a custom character class, you simply list all the characters that you want
to include in the class within a set of brackets. Here’s an example:

Enter regex: b[aeiou]t
Enter string: bat
Match.
Enter string: bet
Match.
Enter string: bit
Match.
Enter string: bot
Match.
Enter string: but
Match.
Enter string: bmt
Does not match.

You can use as many custom groups on a line as you want. Here’s an example that
defines classes for the first and last characters so that they too can be uppercase
or lowercase:

Enter regex: [bB][aAeEiIoOuU][tT]
Enter string: bat
Match.
Enter string: BAT
Match.

Using ranges
------------

Custom character classes can also specify ranges of letters and numbers, like this:

Enter regex: [a-z][0-5]
Enter string: r2
Match.
Enter string: b9
Does not match.

You can use ranges to build a class that accepts only characters that appear in real
words (as opposed to the \w class, which allows underscores):

Enter regex: [a-zA-Z0-9]
Enter string: a
Match.
Enter string: N
Match.
Enter string: 9
Match.

Using negation
--------------

Using negation
Regular expressions can include classes that match any character but the ones
listed for the class. To do that, you start the class with a caret, like this:

Enter regex: [^cf]at
Enter string: bat
Match.
Enter string: cat
Does not match.
Enter string: fat
Does not match.

Here the string must be a three-letter word that ends in at but isn’t fat or cat.


Matching multiple characters
----------------------------

- Quantifiers let you create patterns that match a variable number of
  characters at a certain position in the string.

- To create more flexible patterns, you can use any of the quantifiers listed below.

Quantifiers

Regex       Matches the Preceding Element
------------------------------------------
?           Zero times or one time
*           Zero or more times
+           One or more times
{n}         Exactly n times
{n,}        At least n times
{n,m}       At least n times but no more than m times


To use a quantifier, you code it immediately after the element you want it to apply
to. Here’s a version of the Social Security number pattern that uses quantifiers:

Enter regex: \d{3}-\d{2}-\d{4}
Enter string: 779-48-9955
Match.
Enter string: 483-488-9944
Does not match.


The ? quantifier lets you create an optional element that may or may not be present
in the string. Suppose you want to allow the user to enter Social Security numbers
without the hyphens. You could use this pattern:

Enter regex: \d{3}-?\d{2}-?\d{4}
Enter string: 779-48-9955
Match.
Enter string: 779489955
Match.
Enter string: 779-489955
Match.
Enter string: 77948995
Does not match.

Using escapes
--------------

In regular expressions, certain characters have special meaning. What if you want
to search for one of those special characters? In that case, you escape the character
by preceding it with a backslash. Here’s an example:

Enter regex: \(\d{3}\) \d{3}-\d{4}
Enter string: (559) 555-1234
Match.
Enter string: 559 555-1234
Does not match.

Using parentheses to group characters
-------------------------------------

You can use parentheses to create groups of characters to apply other regex
elements too, as in this example:

Enter regex: (bla)+
Enter string: bla
Match.
Enter string: blabla
Match.
Enter string: blablabla
Match.
Enter string: bla bla bla
Does not match.

//Here the parentheses treat bla as a group, so the + quantifier applies to the entire
  sequence. Thus, this pattern looks for one or more occurrences of the sequence bla.

Here’s an example that finds U.S. phone numbers that can have an optional area
code:

Enter regex: (\(\d{3}\)\s?)?\d{3}-\d{4}   //\s? optional white space charactor, ?\d{3} are also optional 
Enter string: 555-1234
Match.
Enter string: (559) 555-1234
Match.
Enter string: (559)555-1239
Match.


Using the pipe symbol
---------------------

The vertical bar (|) symbol defines an or operation, which lets you create patterns
that accept any of two or more variations. Here’s an improvement of the pattern
for validating droid names:

Enter regex: (\w\d-\w\d)|(\w-\d\w\w)
Enter string: r2-d2
Match.
Enter string: c-3po
Match.


Using Regular Expressions in Java Programs
------------------------------------------

Understanding the String problem
--------------------------------

Note: Java treats the backslash character in a string literal as an escape character, 
therefore you would need to use double \\ backlach for your code to compile.

Example:

String regex = "\w\d-\w\d"; // error: won't compile

String regex = "\\w\\d-\\w\\d"; // Compiles

Using regular expressions with the String class
-----------------------------------------------

The matches method of the String class. This method accepts a regular expression as a parameter 
and returns a boolean that indicates whether the string matches the pattern.

Here’s a static method that validates droid names:

private static boolean validDroidName(String droid)
{
String regex = "(\\w\\d-\\w\\d)|(\\w-\\d\\w\\w)";
return droid.matches(regex);
}


You can also use the split method to split a string into an array of String objects
based on delimiters that match a regular expression.

See Names class as an example


Using the Pattern and Matcher classes
-------------------------------------

The matches method is fine for occasional use of regular expressions, but if you
want your program to do a lot of pattern matching, you should use the Pattern
and Matcher classes instead.

The Pattern class itself is pretty simple. Although it has about ten methods, you
usually use just these two:

» static Pattern compile (String pattern): Compiles the specified pattern. This static method returns a 
                                           Pattern object. It throws PatternSyntax Exception if the pattern
                                           contains an error.

» Matcher matcher (String input): Creates a Matcher object to match this
                                  pattern against the specified string.

To illustrate how to use these methods, here’s an enhanced version of the valid
DroidName method that creates a pattern for the droid-validation regex and saves
it in a static class field:

private static Pattern droidPattern;
private static boolean validDroidName(String droid)
{
if (droidPattern == null)
{
String regex = "(\\w\\d-\\w\\d)|"
+ "(\\w-\\d\\w\\w)";
droidPattern = Pattern.compile(regex);
}
Matcher m = droidPattern.matcher(droid);
return m.matches();
}

Here the private class field droidPattern saves the compiled pattern for validating
droids. The if statement in the validDroidName method checks whether the
pattern has already been created. If not, the pattern is created by calling the static
compile method of the Pattern class. Then the matcher method is used to create
a Matcher object for the string passed as a parameter, and the string is validated
by calling the matches method of the Matcher object.

 */
