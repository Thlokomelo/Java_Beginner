/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Working_with_Files;

/*
Page: 777

Using the File Class
--------------------

The File class is your key to processing files and directories. A File object represents
a single file or directory.

The File class is in the java.io package, so any program that uses it should
import java.io.File or java.io.*.

*See Table 1-1 on page 778 of the book for constructors and methods of the File class.

Creating a File object
----------------------

To create a File object, you call the File constructor, passing a string representing
the filename as a parameter. 

Example: Here the file’s name is hits.log, and it lives in the current directory, which usually
-------  is the directory from which the Java Virtual Machine (JVM) was started.

File f = new File("hits.log");

Creating a file
---------------

Creating a File object doesn’t create a file on the hard drive. Instead, it creates an
in-memory object that represents a file or directory that may or may not actually
exist on the hard drive. To find out whether the file or directory exists, you can use
the exists method

Example: Here an error message is displayed on the console if the file doesn’t exist
-------

File f = new File(path);
if (!f.exists())
System.out.println
("The input file does not exist!");

To create a new file on the hard drive, create a File object with the filename you
want to use and then use the createNewFile method.

Example: The createNewFile method returns a boolean that indicates whether
-------  the file was created successfully. If the file already exists, createNewFile returns
         false, so you don’t have to use the exists method before you call createNewFile.

File f = new File(path);
if (f.createNewFile())
System.out.println("File created.");
else
System.out.println("File could not be created.");

Getting information about a file
--------------------------------

You can get the name of the file represented by a File object in several ways:

- To get just the filename, use the getName method.  This method returns a string that 
  includes just the filename, not the complete path.

- To get the path that was specified to create the File object (such as \logs\
  hit.log), use the toString method instead.

- To get the full path for a file — that is, the complete path including the drive
letter (for Windows systems) and all the directories and subdirectories leading
to the file — use the getCannonicalPath method. This method removes any
system-dependent oddities such as relative paths, dots (which represent the
current directory), and double dots (which represent the parent directory) to
get the file’s actual path.

Getting the contents of a directory
------------------------------------

A directory is a file that contains a list of other files or directories. Because a directory
is just a special type of file, it’s represented by an object of the File class.

You can tell whether a particular File object is a directory by calling its isDirectory method.
If this method returns true, the File is a directory. Then you can get an array of all the files 
contained in the directory by calling the listFiles method.

Example: lists the name of every file in a directory whose pathname is stored in the String variable path:
-------  

File dir = new File(path);
if (dir.isDirectory())
{
File[] files = dir.listFiles();
for (File f : files)
System.out.println(f.getName());
}

Example: lists only files, not subdirectories, and doesn’t list hidden files:

File dir = new File(path);
if (dir.isDirectory())
{
File[] files = dir.listFiles();
for (File f : files)
{
if (f.isFile() && !f.isHidden())
System.out.println(f.getName());
}
}

Renaming files
--------------

You can rename a file by using the renameTo method. This method uses another
File object as a parameter that specifies the file you want to rename the current
file to. It returns a boolean value that indicates whether the file was renamed
successfully.

Example: changes the name of a file named hits.log to savedhits.log:
-------

File f = new File("hits.log");
if (f.renameTo(new File("savedhits.log")))
System.out.println("File renamed.");
else
System.out.println("File not renamed.");

The renameTo method can also move a file from one directory to another.

Example: moves the file hits.log from the folder logs to the folder savedlogs:
-------

File f = new File("logs\\hits.log");
if (f.renameTo(new File("savedlogs\\hits.log")))
System.out.println("File moved.");
else
System.out.println("File not moved.");

Deleting a file
---------------

To delete a file, create a File object for the file and then call the delete method.

Example: Deletes the hits.log file
-------

File f = new File("hits.log");
if (f.delete())
System.out.println("File deleted.");
else
System.out.println("File not deleted.");

Note: If the file is a directory, the directory must be empty to be deleted.


Using Command-Line Parameters
-----------------------------

The args parameter is an array of strings that lets you access any
command-line parameters that are specified by the user when he or she runs your
program.

*public static void main(String[] args)

Example: Suppose that you run a Java program named Test from a command program like this:
-------

C:\>java Test the quick brown fox

//In this case, the Java program is passed four parameters: the, quick, brown, and
  fox. You can access these parameters via the args array.

Suppose that the main method of the Test class is written like this:

public static void main(String[] args)
{
for (String s : args)
System.out.println(s);
}

Then the program displays the following output on the console when run with the
command shown above:
------------------------
the
quick
brown
fox
-------------------------

Command-line parameters are useful in Java programs that work with files as a
way to pass pathnames to the program.

Example: all the files in a directory passed to the program as a parameter:
-------

import java.io.*;
public class ListDirectory
{
public static void main(String[] args)
{
if (args.length > 0)
{
String path = args[0];
File dir = new File(path);
if (dir.isDirectory())
{
File[] files = dir.listFiles();
for (File f : files)
{
System.out.println(f.getName());
}
}
else
System.out.println("Not a directory.");
}
}
}

Choosing Files in a Swing Application
-------------------------------------

The JFileChooser class lets users pick the files they want to work with. 
This class lets you display Open and Save dialog boxes similar to the ones
you’ve seen in other graphic user interface (GUI) applications with just a few lines of code.

The important thing to know about the JFileChooser class is that it doesn’t actually open or save
the file selected by the user; instead, it returns a File object for the file the user selects. 
Your program has the task of opening or saving the file.

*See Table 1-2 on page 786 of the book for constructors and methods the JFileChooser class

Creating an Open dialog box
---------------------------

First, you call the JFileChooser constructor to create a JFileChooser instance;
then you call the showOpenDialog method to display an Open dialog box.

In addition to an Open dialog box, you can display a Save dialog box by calling the
showSaveDialog method. A Save dialog box is similar to an Open dialog box but
has different default values for the title and the text shown on the Approve button.

Getting the selected file
--------------------------

The file-chooser dialog box is a modal dialog box, which means that after you call
the showOpenDialog method, your application is tied up until the user closes the
file-chooser dialog box by clicking the Open or Cancel button.

You can find out which button the user clicked by inspecting the value returned by
the showOpenDialog method:

- If the user clicked Open, the return value is JFileChooser.APPROVE_OPTION.
- If the user clicked Cancel, the return value is JFileChooser.CANCEL_OPTION.
- If an I/O (input/output) or other error occurred, the return value is
  JFileChooser.ERROR_OPTION.

Example: here’s a method that displays a file-chooser dialog
-------  box and returns a File object for the file selected by the user. If the user cancels
         or an error occurs, the method returns null.

private File getFile()
{
JFileChooser fc = new JFileChooser();
int result = fc.showOpenDialog(null);
File file = null;
if (result == JFileChooser.APPROVE_OPTION)
file = fc.getSelectedFile();
return file;
}

Using file filters
------------------

The file-chooser dialog box includes a Files of Type drop-down list filter that the
user can use to control what types of files are displayed by the chooser.

By default, the only item available in this drop-down list is All Files, which doesn’t filter the
files at all. If you want to add another filter to this list, you must create a class that extends the 
FileFilter abstract class and then pass an instance of this class to the addChoosableFileFilter method.

*See Table 1-3 on page 790 of the book for methods of the FileFilter class.

Example: Here the string Java files (*.java) is displayed in the Files of Type drop-down list.
-------

public String getDescription()
{
return "Java files (*.java)";
}

Example: Here’s a FileFilter class that displays files with the extension .java:
-------

private class javaFilter
extends javax.swing.filechooser.FileFilter
{
public boolean accept(File f)
{
if (f.isDirectory())
return true;
String name = f.getName();
if (name.matches(".*\\.java"))
return true;
else
return false;
}
public String getDescription()
{
return "Java files (*.java)";
}
}

After you create a class that implements a file filter, you can add the file filter to
the file chooser by calling the addChoosableFileFilter method, passing a new
instance of the FileFilter class, like this:

fc.setChoosableFileFilter(new JavaFilter());

Using Path Objects
------------------

Java 1.7 introduces a new type of object called a Path to address several weaknesses
of the File class, which has been part of Java since version 1.0.

The most egregious of the File class flaws addressed by Path objects is that many of the
operations of the File class don’t provide detailed error information when problems
occur.

Both the Path interface and the Paths class are in the java.nio.File package, so
any program that uses them should import java.nio.file.*.

*See Table 1-4 on page 792 of the book for constructors and methods of the Path class.

Creating files with the Paths class
-----------------------------------

One thing you may find confusing right off the bat is that the Path objects are created
by calling a static method of the Paths class. Path and Paths are two distinct
things: Path is an interface, and Paths is a class. 

To create a Path object, use the get method of the static Paths class, like this:

Path p = Paths.get("c:\\test.txt");

//Here the file’s name is test.txt, and it resides in the root directory of the C: drive.

Like a File object, a Path object represents a file that may or may not actually
exist on the hard drive. You can test to see whether a file exists like this:

Path p = Paths.get(path);
if (!p.exists())
System.out.println
("The input file does not exist!");

To create a new file, use the createFile method, like this:

Path p = Paths.get("c:\\test.txt");
try
{
p.createFile();
System.out.println ("File created!");
}
catch (Exception e)
{
System.out.println ("Error: " + e.getMessage());
}


Getting the contents of a directory
-----------------------------------

One of the weaknesses of the File class is that it doesn’t deal well with large
directories. In short, the File class is not scalable.

The Path class remedies this deficiency by letting you access the contents of a
directory via a stream object defined by DirectoryStream. A stream
provides a simple way to access a large number of data items one at a time. You
can retrieve the items in a directory stream easily by using an enhanced for statement,
as in this example:

Path c = Paths.get("C:\\");
try
{
DirectoryStream<Path> stream
= c.newDirectoryStream();
for (Path entry: stream)
System.out.println(entry.toString());
}
catch (Exception e)
{
System.out.println("Error: " + e.getMessage());
}

//This example displays a listing of the contents of the C:\ directory, much as typing
  DIR C:\ at a command prompt would.


Using a File Visitor to Walk a File Tree
-----------------------------------------

You can use a new feature that does the difficult recursive part of the programming for
you. It does this by walking the file tree — visiting every file in the tree and calling
one or more methods defined by a special class you create, called a file visitor.

*See Table 1-5. on page 795 of the book for several methods in the SimpleFileVisitor class.

Here are the basic details of how this works:

1. Create a file-visitor class, which is extended from FileVisitor or, more often, SimpleFileVisitor.

2. In the file visitor, override one or more methods that are defined by the SimpleFileVisitor class.

3. Create a Path object that indicates the starting point (that is, the root) of the file tree you want to walk.

4. Call the walkFileTree method of the static Files class to process the files.
























 */
