/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_8_Packages_and_New_JavaModuleSystem;

/*
Page: 353

Working with Packages and the New Java Module System
----------------------------------------------------

In this chapter we will learn the following:
- How to organize classes into neat packages
- How to create a JAR file
- How to create JavaDocs that lets you add documentation comments to your classes
- The Java Module System which provides an improved way of working with packages that avoids some
  of the more common pitfalls of the old Java package system

Working with Packages
---------------------
- A package is a group of classes that belong together.

Importing classes and packages
------------------------------
When you use import statements at the beginning of a Java source file, you make
classes from the packages mentioned in the import statements available throughout
the file.

- An import statement can import all the classes in a package by using an asterisk wildcard.

Example:
-------

import java.util.*;

- You can also import classes one at a time.

Example:
--------

import java.util.ArrayList;    //here the ArrayList class is imported

Creating your own packages
--------------------------

The following are the steps that you would need to go through: 

- Pick a name for your package.
- Choose a directory on your hard drive to be the root of your class library.
- Create subdirectories within the root directory for your package name.
- Add the root directory for your package to the ClassPath environment
  variable.
- Save the files for any classes you want to be in a particular package in the
  directory for that package.
- Add a package statement to the beginning of each source file that
  belongs in a package.

Example:
-------

See Console.java and PackageTest.java as examples

Putting Your Classes in a JAR File
----------------------------------

- A JAR file is a single file that can contain more than one class in a compressed
  format that the Java Runtime Environment can access quickly. (JAR stands for
  Java archive.)

- JAR files are created by the jar utility, which you find in the Java bin directory
  along with the other Java command-line tools, such as java and javac. 

- JAR files contain a special file, called the manifest file, that contains information 
  about the files in the archive. This manifest is automatically created by the jar utility,
  but you can supply a manifest of your own to provide additional information about the archived files.

- JAR files are the normal way to distribute finished Java applications. After finishing
  your application, you run the jar command from a command prompt to prepare
  the JAR file. Then, another user can copy the JAR file to his or her computer.
  The user can then run the application directly from the JAR file.


jar command-line options
------------------------
The basic format of the jar command is this:

jar options jar-file [manifest-file] class-files...

- The options specify the basic action you want jar to perform and provide additional
  information about how you want the command to work.

Options for the jar Command are on page 359 of the book....


Archiving a package
-------------------

The most common use for the jar utility is to create an archive of an entire package.

Here’s the procedure for archiving a package on a PC running any version of Windows:

- Open a command window.

- Use a cd command to navigate to your package root. 

 cd C:\Users\thlok\Documents\NetBeansProjects\Book3\src\

- Set path

set path=C:\Program Files\Java\jdk-11.0.15.1\bin

- Compile all classes in package

cd C:\Users\thlok\Documents\NetBeansProjects\Book3\src\com\lowewriter\util

javac *.java

- create a manifest txt file and place it in your root folder

In the manifest file insert: Main-Class: ClassName

- Use a jar command that specifies the options cf, the name of the jar file,
  and the path to the class files you want to archive.

cd C:\Users\thlok\Documents\NetBeansProjects\Book3\src\

 jar cvfm utils.jar manifest.txt com\lowewriter\util\*.class

- To verify that the jar file was created correctly, use the jar command
  that specifies the options tf and the name of the jar file.

e.g. jar tf utils.jar


Adding a jar to your classpath
------------------------------
To use the classes in an archive, you must add the jar file to your ClassPath environment
variable.

e.g. .;c:\javaclasses\utils.jar;c:\javaclasses

Alternatively you would add multiple jar file like this:

.;c:\javaclasses/*

Running a program directly from an archive
------------------------------------------

see exercise.jar example

java -jar exercise.jar

Using JavaDoc to Document Your Classes
---------------------------------------

JavaDoc is a tool that automatically creates fancy HTML-based
documentation based on comments in your source files. All you have to do is add
a comment for each public class, field, and method; then run the source files
through the javadoc command.


Adding JavaDoc comments
-----------------------

//The basic rule for creating JavaDoc comments is that they begin with /** and end with *

You can place JavaDoc comments in any of three different locations in a
source file:

» Immediately before the declaration of a public class
» Immediately before the declaration of a public field
» Immediately before the declaration of a public method or constructor

see employee class as an example

Using the javadoc command
-------------------------

The javadoc command creates the documentation pages in the current directory,
so you may want to switch to the directory where you want the pages to reside
first.


- Set path in your root folder

set path=C:\Program Files\Java\jdk-11.0.15.1\bin

- Javadoc command:

javadoc C:\Users\thlok\Documents\NetBeansProjects\Book3\src\com\lowewriter\payroll\Employee.java

Viewing JavaDoc pages
---------------------

To quickly display this page, just type index.html at the command prompt after you run the javadoc command. Or you can
start your browser, navigate to the directory where you created the documentation pages, and open the index.html page.

Using the Java Module System
----------------------------

Packaging code into neat, well-defined units makes it easier to deliver safe and reliable applications. 
The Java Platform Module System is a language standard for creating these units. With modules, 
you can closely control how JARs interact and easily identify any missing dependencies at startup.

Understanding modules
---------------------

A module is a new way of grouping classes in a way that explicitly lists which other
modules the module depends on and what specific public types (that is, classes
and interfaces) within the classes contained in the module are to be made available
for other modules to use.

The module-info.java fil
------------------------

The module-info.java file is a Java source file that defines a module. The module
is defined by using a combination of several new Java language elements that are
introduced by Java 9.


- Here is a simple module-info.java file that does creates a module but does not
  define any dependencies or exported packages:

module com.lowewriter.payroll {}   //In this example, the name of the module is com.lowewriter.payroll.

- To specify that the module is dependent on another module, you add a requires
  statement that specifies the name of the module. 

For example, if the module will require database access, it will need the standard java.SQL module:
module com.lowewriter.payroll

{
requires java.SQL;
}


You can also add exports statements to export packages that are contained in the
module.

module com.lowewriter.payroll
{
requires java.SQL;
requires com.lowewriter.util;
exports com.lowewriter.payrolldb;
}

In this example, any public classes or interfaces defined by the package com.
lowewriter.payrolldb are visible to other modules.

Setting up folders for a module
-------------------------------

Getting the source folders set up for a module is similar to setting up the folders
for a package, but with the added requirement that the module-info.java file
must be in the root folder for the module.

Assuming that there are two source files for the payroll package (named Address.
java and Employee.java), the complete folder structure including the source files
for the payroll example looks like this:

com.lowewriter.payroll
  module-info.java
  com
     lowewriter
         payroll
              Address.java
              Employee.java


Compiling a module
------------------

To compile a module, you can use the javac command from a command prompt,
specifying the name of all the source files you want to compile. First, navigate to
the root folder for the module (in this case, C:\java9\com.lowewriter.payroll).
Then use a javac command like this one:

javac module-info.java com\lowewriter\payroll\*.java

Creating a modular JAR file
----------------------------

The final step for creating a Java module is to assemble the compiled class files
(including module-info.class) into a module JAR file. You can do that by using
the jar command, like this:

jar cf com.lowewriter.payroll.jar *.class com\lowewriter\payroll\*.class

In this example, cf means to create a Jar file. The cf is followed by the class
files to include.

 */

