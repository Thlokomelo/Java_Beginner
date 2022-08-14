/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 294

Creating Custom Exceptions (Using inheritance to create your own custom exceptions)

- Tracing the throwable hierarchy: of exception classes

  » Throwable: The root of the exception hierarchy is the Throwable class. This
    class represents any object that can be thrown with a throw statement and
    caught with a catch clause.

  » Error: This subclass of Throwable represents serious error conditions that
    reasonable programs can’t recover from. The subclasses of this class represent
    the specific types of errors that can occur. If the Java Virtual Machine runs
    out of memory, for example, a VirtualMachineError is thrown. You don’t
    have to worry about catching these errors in your programs.

  » Exceptions: This subclass of Throwable represents serious error conditions that
    most programs should try to recover from. Thus, Exception is effectively the
    top of the hierarchy for the types of exceptions you catch with try/catch
    statements.

  » RuntimeException: This subclass of Exception represents unchecked
    exceptions. You don’t have to catch or throw unchecked exceptions, but you
    can if you want to. Subclasses of RuntimeException include NullPointerException 
    and ArithmeticException.

  NB: If your application needs to throw a custom exception, you can create an exception
  class that inherits any of the classes in this hierarchy.

- Creating an exception class

  » To create a custom exception class, you just define a class that extends one of the
    classes in the Java exception hierarchy. Usually you extend Exception to create a
    custom checked exception.

Example: 

public class ProductDataException extends Exception
{
}

NB: constructors aren’t considered to be class members, so they aren’t
    inherited when you extend a class. As a result, the ProductDataException has
    only a default constructor. The Exception class itself and most other exception
    classes have a constructor that lets you pass a string message that’s stored with
    the exception and can be retrieved via the getMessage method. Thus you want to
    add this constructor to your class, which means that you want to add an explicit
    default constructor too.

public class ProductDataException extends Exception
{
     public ProductDataException{}                   //explicit default constructor

public ProductDataException(String message)
  {
    super(message);                                  //retrieves constriuctor
  }
}










 */
