/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_1_to_1_4;

/*
Page: 475

Understanding Threads
---------------------

A thread is a single sequence of executable code within a larger program. All the
programs shown so far in the book have used just one thread — the main thread
that starts automatically when you run the program — but Java lets you create
programs that start additional threads to perform specific tasks.

Examples of programs that use threads:
-------------------------------------

» Web browsers can download files while letting you view web pages. When you
download a file in a web browser, the browser starts a separate thread to
handle the download.

» Email programs don’t make you wait for all your messages to download
before you can read the first message. Instead, these programs use separate
threads to display and download messages.

Creating a Thread
-----------------

The Thread class lets you create an object that can be run as a thread in a multithreaded
Java application. The Thread class has quite a few constructors and
methods ( see Table 1.1. on page 477 of the book for all thread methods and constructors).

Extending the Thread class
--------------------------

The easiest way to create a thread is to write a class that extends the Thread class.
Then all you have to do to start a thread is create an instance of your thread class
and call its start method.

see CountDownClock class as an example.

Creating and starting a thread
------------------------------

After you define a class that defines a Thread object, you can create and start the
thread. see CountDownApp class as an example.

Implementing the Runnable Interface
-----------------------------------

For the threads that trigger specific countdown events such as flooding the launch
pad, starting the events, and lifting off, We create another class called LaunchEvent.
This class uses another technique for creating and starting threads — one that
requires a few more lines of code but is more flexible.

The problem with creating a class that extends the Thread class is that a class can
have one superclass. Therefore, the Runnable interface can be used as it marks an object 
that can be run as a thread. It has only one method, run, that contains the
code that’s executed in the thread.

Using the Runnable interface
-----------------------------

To use the Runnable interface to create and start a thread, you have to do the
following:

1. Create a class that implements Runnable.
2. Provide a run method in the class you created in Step 1.
3. Create an instance of the Thread class and pass your Runnable object to
its constructor as a parameter.
A Thread object is created that can run your Runnable class.

4. Call the Thread object’s start method.
The run method of your Runnable object is called and executes in a separate
thread.

see LaunchEvent class as an example which uses version 2 of the CountDownApp class.

Creating Threads that work together
-----------------------------------

See CountDownApp3 class which uses an interface as a buffer between the classes. This interface
defines a method that gets the current status of the clock. Then the CountDown
Clock class can implement this interface, and the LaunchEvent class can use any
object that implements this interface to get the time.

Using an Executor
-----------------

This is based on new advanced methods of thereading which uses Java 1.5 threading classes.
See Listing 1.5 - 1.7 as examples


Synchronizing Methods
---------------------

The key to handling concurrency issues is recognizing methods that update data
and that might be called by more than one thread. After you identify those methods,
the solution is simple. You just add the synchronized keyword to the method
declaration, like this:

public synchronized void someMethod()...

This code tells Java to place a lock on the object so that no other methods can call
any other synchronized methods for the object until this method finishes.


See Listing 1.8 to 1.10 as examples.

Creating a Lock
---------------

A Lock is  of Java version 1.5 new threading features. It can take the place of Java’s synchronized keyword, but a lock is much more versatile.

See Listing 1.11 and 1.12 as examples

Coping with Threadus Interruptus
--------------------------------

You can interrupt another thread by calling its interrupt method, provided that
you have a reference to the thread, as in this example:

t.interrupt();  //Here the thread referenced by the t variable is interrupted.

- InterruptedException is thrown when another thread calls the interrupt
  method on this thread while the thread is not executing.

- The yield and sleep methods are one of the ways to take control of thread interrupters. 
  Otherwise you can use the Interrupted flag and set it to indicate that the thread was interrupted.

Aborting the countdown
----------------------

To illustrate how you can interrupt threads, Listing 1.13 shows yet another version
of the countdown application. This version aborts the countdown if something
goes wrong with any of the launch events.




 */

