/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Working_With_XML;

/*
Page: 861

Defining XML
------------

XML is a way to store and exchange information in a standardized way that’s easy to create, 
retrieve, and transfer between different types of computer systems or programs.

When XML is stored in a file, the file is usually given the extension .xml.

Tags
----

Like Hypertext Markup Language (HTML), XML uses tags to mark the data. Here’s
a bit of XML that describes a book:

<Book>
<Title>Java All-In-One For Dummies</Title>
<Author>Lowe</Author>
</Book>

//This code of XML defines an element called Book, which contains information
  for a single book. The Book element in turn contains two subordinate elements:
  Title and Author.

- Everything that appears between the start tag and the end tag is the element’s content,
  which can consist of text data or of one or more additional elements. In the latter case, 
  the additional elements nested within an element are called child elements, and the element
  that contains them is called the parent element.


- The highest-level element in an XML document is called the root element. A properly
  formed XML document consists of a single root element, which can contain elements nested
  within it.

Example: creates an XML document with information about two movies
-------

<Movies>                                      //root element
  <Movie>                                     //nested elemet
     <Title>It's a Wonderful Life</Title>
     <Year>1946</Year>
     <Price>14.95</Price>
  </Movie>
  <Movie>                                     //nested elemet
    <Title>Young Frankenstein</Title>
    <Year>1974</Year>
    <Price>16.95</Price>
  </Movie>
</Movies>

Attributes
----------

Instead of using child elements, you can use attributes to provide data for an
element.
An attribute is a name-and-value pair that’s written inside the start tag
for an element.

Example: a Movie element that uses an attribute instead of a child element to record the year: 
-------  

<Movie year="1946">
  <Title>It's a Wonderful Life</Title>
  <Price>14.95</Price>
</Movie>

The XML declaration
-------------------

Every XML file should begin with an XML declaration that identifies the version of
XML being used. For most XML documents, the declaration should look like this:

<?xml version='1.0'?>

See movies.xml file as an example.

Using a DTD
----------

- An XML document can have a DTD, which spells out exactly what elements can
  appear in an XML document and in what order the elements can appear. DTD
  stands for Document Type Definition.

- The main purpose of the DTD is to spell out the structure of an XML document so
  that users of the document know how to interpret it.

- To indicate the name of the file that contains the DTD, you add a <!DOCTYPE> 
  declaration to the XML document. Here’s an example:

<!DOCTYPE Movies SYSTEM "movies.dtd">

Here the XML file is identified as a Movies document, whose DTD you can find in
the file movies.dtd. Add this tag near the beginning of the movies.xml file, right
after the <?xml> tag.

see DTD file as an example

Processing XML in Two Ways: DOM and SAX
----------------------------------------

- DOM: Stands for Document Object Model. The basic idea of DOM is that you
       read an entire XML document from a file into memory, where the document
       is stored as a collection of objects that are structured as a tree. Then you can
       process the elements of the tree (called nodes) however you want. If you
       change any of the nodes, you can write the document back to a file.
- SAX: Stands for Simple API for XML. SAX is a read-only technique for processing
       XML that lets you read the elements of an XML document from a file and
       react to them as they come. Because SAX doesn’t require you to store an
       entire XML document in memory at one time, it’s often used for very large
       XML documents.

Reading a DOM Document
----------------------

Before you can process a DOM document, you have to read the document into
memory from an XML file.

Example: Here’s a method that reads an XML file into a DOM document:
-------

private static Document getDocument(String name)
{
try
{
DocumentBuilderFactory factory =
DocumentBuilderFactory.newInstance();
factory.setIgnoringComments(true);
factory.setIgnoringElementContentWhitespace(true);
factory.setValidating(true);
DocumentBuilder builder =
factory.newDocumentBuilder();
return builder.parse(new InputSource(name));
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
return null;
}

Creating a DocumentBuilderFactory
---------------------------------

- The first statement of the preceding example calls the newInstance method of the
  DocumentBuilderFactory class to create a new DocumentBuilderFactory object.
  The job of the DocumentBuilderFactory is to create DocumentBuilder objects
  that can read XML input and create DOM documents in memory.

Configuring the DocumentBuilderFactory
--------------------------------------

- After you get a DocumentBuilderFactory, you can configure it to read the document
  the way you want. The next three statements configure three options that
  are applied to document builders created by this factory object:

factory.setIgnoringComments(true);
factory.setIgnoringElementContentWhitespace(true);
factory.setValidating(true);

Creating a document builder and the document
--------------------------------------------

- After you set the options, you can call the newDocumentBuilder method to create
  a document builder, as follows:

DocumentBuilder builder =
factory.newDocumentBuilder();

//Here the document builder is referenced by a variable named builder.

- Finally, you can create the DOM document by calling the parse method of the document
  builder. This method accepts an InputSource object as a parameter.

return builder.parse(new InputSource(name));

Using the getDocument method
----------------------------

- By adding the getDocument method, you can create a DOM document from a file
  with a single statement, like this:

Document doc = getDocument("movies.xml");

//Here the movies.xml file is read, and a DOM document is created and assigned to
  the doc variable.

- Also note that you must provide three import statements to use the getDocument
  method, as follows:

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

//DocumentBuilder and DocumentBuilderFactory are in the javax.xml.parsers
  package, Document is in org.w3c.dom, and InputSource is in org.xml.sax.

Reading DOM Nodes
-----------------

- After you have a DOM document in memory, you can easily retrieve data from the
  document’s nodes. The DOM API is based on interfaces rather than classes, so
  each node of the DOM document is represented by an object that implements one
  or more DOM interfaces.

Processing elements
-------------------

Assuming that you use a DTD to validate the XML file when you build the document,
you can usually navigate the document to pick up the information you need
without resorting to NodeList objects.

Example: Here’s a routine that simply counts all the Movie elements in the movies.xml file
-------

int count = 0;
Element root = doc.getDocumentElement();
Node movie = root.getFirstChild();
while (movie != null)
{
count++;
movie = movie.getNextSibling();
}
System.out.println("There are " + count + " movies.");

//This method first calls the getFirstChild method to get the first child of the root
  element. Then it uses each child element’s getNextSibling method to get the
  next element that’s also a child of the root element.

- An alternative way to process all the elements in the movies.xml file is to use the
  getChildNodes method to return a NodeList object that contains all the elements.
  Then you can use a for loop to access each element individually. Here’s a snippet
  of code that lists the name of each element:

Element root = doc.getDocumentElement();
NodeList movies = root.getChildNodes();
for (int i = 0; i < movies.getLength(); i++)
{
Node movie = movies.item(i);
System.out.println(movie.getNodeName());
}

//Here the item method is used in the for loop to retrieve each Movie element. If
  you run a program that contains these lines, ten lines with the word Movie are
  displayed on the console.

Getting attribute values
------------------------

To get the value of an element’s attribute, call the getAttribute method and pass
the name of the attribute as the parameter. This code returns the string value of
the attribute. Then you can convert this value to another type if necessary.

Example: This code gets the year attribute from each movie in the movies.xml
-------  file and determines the year of the oldest movie in the collection.

Element root = doc.getDocumentElement();
Element movie = (Element)root.getFirstChild();
int oldest = 9999;
while (movie != null)
{
String s = movie.getAttribute("year");
int year = Integer.parseInt(s);
if (year < oldest)
oldest = year;
movie = (Element)movie.getNextSibling();
}
System.out.println("The oldest movie in the file "
+ "is from " + oldest + ".");

//The first line gets the string value of the year attribute, and the second line converts
  it to an int.

Getting child element values
----------------------------

The text content of an element isn’t stored with
the element, instead, it’s stored in a child node of type Text. Consider the following XML:

<Title>The Princess Bride</Title>

//This element results in two nodes in the XML document: an Element node named
  Title and a Text node that contains the text The Princess Bride.

- Thus, if you have a Title element in hand, you must get the Text element before
  you can get the text content, as in this example:

Node textElement = titleElement.getFirstChild();
String title = textElement.getNodeValue();

- If you prefer to write your code a little more tersely, you can use a single statement
  like this:

String title =
titleElement.getFirstChild().getNodeValue();
If you find this incantation to be a little tedious, and you’re doing a lot of it in your
program, write yourself a little helper method, like this one:
private static String getTextValue(Node n)
{
return n.getFirstChild().getNodeValue();
}

- Then you can get the text content for an element by calling the getTextValue
  method, like this:

String title = getTextValue(titleElement);
After you get the text content, you can parse it to a numeric type if you need to.

Putting It All Together: A Program That Lists Movies
----------------------------------------------------

see ListMoviesXML class as an example.



 */

