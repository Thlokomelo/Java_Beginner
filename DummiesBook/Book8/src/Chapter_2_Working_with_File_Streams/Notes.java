/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Working_with_File_Streams;

/*
Page: 799

Understanding Streams
---------------------

A stream is simply a flow of characters to and from a program. 

The other end of the stream can be anything that can accept or generate a stream of characters,
including a console window, a printer, a file on a disk drive, or even another
program.

You can roughly divide the world of Java stream I/O into two camps:

- Character streams: 
  -----------------

Character streams read and write text characters that represent strings. 
You can connect a character stream to a text file to store text data on a hard drive. 


- Binary streams: 
  --------------

Binary streams read and write individual bytes that represent primitive data types. 
You can connect a binary stream to a binary file to store
binary data on a hard drive. 

Programs that work with file streams include an import java.io.* statement.

Reading Character Streams
-------------------------

To read a text file through a character stream, you usually work with the following
classes:

- File: 

The File class represents a file on a hard drive. In file I/O applications, the main 
purpose of the File class is to identify the file you want to read from or write to.

- FileReader: 
  ----------

The FileReader class provides basic methods for reading data from a character stream 
that originates from a file. It provides methods that let you read data one character at a time. 

- BufferedReader: 
  --------------

This class “wraps” around the FileReader class to provide
more efficient input. This class adds a buffer to the input stream that allows
the input to be read from the hard drive in large chunks rather than a byte at
a time, which can result in a huge improvement in performance. The BufferedReader class 
lets you read data one character at a time or a line at a time. 

*See Table 2-1 on page 801 of the book for constructors and methods of the BufferedReader and FileReader Classes

Reading the movies.txt file
---------------------------

*See ReadFile class as an example.

Writing Character Streams
-------------------------

The usual way to write data to a text file is to use the PrintWriter class.
It’s the same class that provides the print and println methods used to write console output.

To connect a print writer to a text file you do the following:

- FileWriter: 
The FileWriter class connects to a File object but provides only rudimentary writing ability.

- BufferedWriter: 
This class connects to a FileWriter and provides output buffering. 

- PrintWriter: 
This class connects to a Writer, which can be a Buffered Writer, a FileWriter, 
or any other object that extends the abstract Writer class. 

The PrintWriter class is the only one of these classes whose methods you usually
use when you write data to a file. 

*See Table 2-2 on page 807 of the book for constructors and methods of the The PrintWriter, BufferedWriter, and FileWriter Classes.

Connecting a PrintWriter to a text file
---------------------------------------

To connect a character stream to an output file, you first create a File object for
the file. Then you call the PrintWriter constructor to create a PrintWriter object that
you can use to write to the file. This constructor wraps around a BufferedWriter object, 
which in turn wraps around a FileWriter object like this:


File file = new File("movies.txt");
PrintWriter out =
new PrintWriter(
new BufferedWriter(
new FileWriter(file) ) );

Here’s a PrintWriter constructor that appends data to its file:

File file = new File("movies.txt");
PrintWriter out =
new PrintWriter(
new BufferedWriter(
new FileWriter(file, true )))// append mode


Alternatively, you can construct each object separately and use variables to keep track of them. Here’s an example, 
it also turns on append mode for FileWriter and flush mode:

for PrintWriter:
FileWriter fw = new FileWriter(file, true);
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter out = new PrintWriter(bw, true);

Writing to a character stream
-----------------------------

After you successfully connect a character stream to a file, writing data to it is as
easy as writing text to the console. You just use the print and println methods
exactly as though you were writing to the console.

- Suppose (for example) that the title and year of a movie that you want to write
  to the text file are stored in String variables named title and year. This snippet
  of code writes these fields with a tab delimiter between them:

System.out.print(title);
System.out.print("\t");
System.out.println(year);

- If you prefer to be a little more efficient, you can build a string representing the
  entire line and then write the line all at once, as follows:

String line = title + "\t" + year;
System.out.println(line);

- If you didn’t specify the flush option when you created the PrintWriter object,
  you can still periodically force any data in the buffer to be written to the hard drive
  by calling the flush method, as follows:

out.flush();

- Also, when you’re finished writing data to the file, you can close the file by calling
  the close method, like this:

out.close();

Writing the movies.txt file
---------------------------

see WriteFile class as an example.

Reading Binary Streams
----------------------

Binary streams are used to store data in raw binary format rather than in text format.

To read a binary file, you usually work with the following classes:

- File: Once again, you use the File class to represent the file itself.

- FileInputStream: FileInputStream is what connects the input stream to a file.

- BufferedInputStream: This class adds buffering to the basic FileInput
  Stream, which improves the stream’s efficiency.

- DataInputStream: This class is the one you actually work with to read data
  from the stream. This class knows how to read basic data types, including primitive types and strings.

*See Table 2-3 on page 814 of the book for constructors and methods of the Classes for Reading Binary Streams.


Creating a DataInputStream
--------------------------

To read data from a binary file, you want to connect a DataInputStream object to
an input file. To do that, you use a File object to represent the file, a FileInput
Stream object that represents the file as an input stream, a BufferedInputStream
object that adds buffering to the mix, and finally a DataInputStream object to
provide the methods that read various data types. The constructor for such a beast
looks like this:

File file = new File("movies.dat");
DataInputStream in = new DataInputStream(
new BufferedInputStream(
new FileInputStream(file) ) );

Alternatively:
-------------

File file = new File("movies.dat");
FileInputStream fs = new FileInputStream(file);
BufferedInputStream bs = new BufferedInputStream(fs);
DataInputStream in = new DataInputStream(bs);

Reading from a data input stream
--------------------------------

Example: Here’s a code snippet that reads the information for a single movie and stores the
         data in variables:

String title = in.readUTF();
int year = in.readInt();
double price = in.readDouble();


The read methods usually are used in a while loop to read all the data from the
file. When the end of the file is reached, EOFException is thrown. Then you can
catch this exception and stop the loop. One way to do that is to use a boolean variable
to control the loop, as follows:

boolean eof = false;
while (!eof)
{
try
{
String title = in.readUTF();
int year = in.readInt();
double price = in.readDouble();
// do something with the data here
}
catch (EOFException e)
{
eof = true;
}
catch (IOException e)
{
System.out.println("An I/O error "
+ "has occurred!");
System.exit(0);
}
}

//Here the boolean variable eof is set to true when EOFException is thrown, and
  the loop continues to execute as long as eof is false.


You can use the split method to separate the line into the individual strings that are separated
by tabs. Then you can use the appropriate parse methods to parse each string to its correct data type.

Here’s a routine that converts a line read from the movies.txt file to the title (a string), year (an int), and price (a double):

String[] data = line.split("\t");
String title = data[0];
int year = Integer.parseInt(data[1]);
double price = Double.parseDouble(data[2]);

After the entire file has been read, you can close the stream by calling the close
method, like this:

in.close();

Reading the movies.dat file
----------------------------

See ReadBinaryFile class as an example.

Writing Binary Streams
----------------------

To write data to a binary file, you use the following classes:

- FileOutputStream: The FileOutputStream class connects to a File object and creates an output stream 
                    that can write to the file. 

- BufferedOutputStream: This class connects to a FileOutputStream and adds output buffering.

- DataOutputStream: This class adds the ability to write primitive data types and strings to a stream.

*See Table 2-4 on page821 of the book for constructors and methods of the DataOutputStream, BufferedOutputStream, and
FileOutputStream Classes.

Creating a DataOutputStream
---------------------------

Example:Using a nested method
-------

File file = new File(name);
DataOutputStream out = new DataOutputStream(
new BufferedOutputStream(
new FileOutputStream(file) ) );

Alternatively:
-------------

File file = new File(name);
FileOutputStream fos = new FileOutputStream(file);
BufferedOutputStream bos = new BufferedOutputStream(fos);
DataOutputStream out = new DataOutputStream(bos);

- The FileOutputStream class has an optional boolean parameter that you can use
  to indicate that the file should be appended if it exists. To use this feature, call the
  constructors like this:

File file = new File(name);
DataOutputStream out = new DataOutputStream(
new BufferedOutputStream(
new FileOutputStream(file, true) ) );

If you specify false instead of true or leave the parameter out, an existing file is
deleted, and its data is lost.

Writing to a binary stream
--------------------------

After you successfully connect a DataOutputStream to a file, writing data to it is
simply a matter of calling the various write methods to write different data types
to the file. The following code writes the data for a Movie object to the file:

out.writeUTF(movie.title);
out.writeInt(movie.year);
out.writeDouble(movie.price);

*See WriteBinaryFile class as an example.


















 */

