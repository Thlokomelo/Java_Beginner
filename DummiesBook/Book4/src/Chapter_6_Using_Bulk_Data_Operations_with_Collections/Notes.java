/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_6_Using_Bulk_Data_Operations_with_Collections;

/*
Page 463

Using Bulk Data Operations with Collections
-------------------------------------------

When you use bulk data operations, you do not directly iterate over the collection data
using a for each loop. Instead, you simply provide the operations that will be done on each
of the collection's elements and let Java take care of the details required to spread the 
work over multiple threads.

Looking At a Basic Bulk Data Operation
--------------------------------------

See Spell Class as an example

Looking Closer at the Stream Interface
--------------------------------------

The Stream interface defines about 40 methods. In addition, three related
interfaces — DoubleStream, IntStream, and LongStream — extend the Stream
interface to define operations that are specific to a single date type: double, int,
and long.

Table 6-1 lists the most commonly used methods of these interfaces. (Page 467)

- The first group of methods in Table 6-1 define methods that return other Stream
  objects. Each of these methods manipulates the stream in some way, then passes
  the altered stream down the pipeline to be processed by another operation.

The filter method
-----------------
Is one of the most commonly used stream methods. It’s argument,
called a predicate, is a function that returns a boolean value.

Example: the following lambda expression inspects the name field of the
-------  stream element and returns true if it begins with
         the letter a (upper- or lowercase):

s -> s.name.toLowerCase().startsWith("a")


- The second group of methods in Table 6-1 are called mapping methods because
  they convert a stream whose elements are of one type to a stream whose elements
  are of another type. The mapping function, which you must pass as a parameter,
  is responsible for converting the data from the first type to the second.

  One common use for mapping methods is to convert a stream of complex types
  to a stream of simple numeric values of type double, int, or long, which you
  can then use to perform an aggregate calculation such as sum or average.

Example: Suppose HP’s spells were for sale and the Spell class included a public
-------  field named price. To calculate the average price of all the spells, you would first
         have to convert the stream of Spell objects to a stream of doubles. To do that,
         you use the mapToDouble method. The mapping function would simply return the price field:

.mapToDouble(s -> s.price)


- Methods in the last group in Table 6-1 are called terminal methods because they do
  not return another stream. As a result, they are always the last methods called in
  stream pipelines.

Example: calculates the average price of spells
-------

OptionalDouble avg = spells.stream()
.mapToDouble(s -> s.price)
.average();

Here is how you would write the average price to the console:

if (avg.isPresent())
{
System.out.println("Average = "
+ avg.getAsDouble());
}


Using Parallel Streams
----------------------

Streams come in two basic formats: sequential and parallel. 

Elements in a sequential stream
-------------------------------
Are produced by the stream method and create 
streams that are processed one element after the next. 

Parallel streams
----------------
Take full advantage of multicore processors by breaking its elements
into two or more smaller streams, performing operations on them, and
then recombining the separate streams to create the final result stream. 
Each of the intermediate streams can be processed by a separate thread, 
which can improve performance for large streams.

Example: To print all of HP’s spells using a parallel stream, use this code:
-------

spells.parallelStream()
.forEach(s -> System.out.println(s));

NB: when you use a parallel stream, you can’t predict the order in which
    each element of the stream is processed. That’s because when the stream is split
    and run on two or more threads, the order in which the processor executes the
    threads is not predictable.

See spell2 class as an example



 */
