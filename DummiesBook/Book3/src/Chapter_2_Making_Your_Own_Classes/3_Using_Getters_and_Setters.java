/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 255

Using Getters and Setters

As a general rule, you should avoid creating public fields. Instead, you can make all
your fields private. Then you can selectively grant access to the data those fields contain
by adding to the class special methods called accessors. 

- Two types of accessors:

  » A get accessor (getter/ getFieldName) is a method that retrieves a field value.
  » A set accessor (setter/ setFieldName) is a method that sets a field value.

  Example:

  public class Player
  {
     private int health;           //cant be accessed directly
     public int getHealth()        //accessed through this method
     {
       return health;
     }
     public void setHealth(int h)  //accessed through this method
     {  
       health = h;
     }
   }

- Benefits of creating classes with accessors (getters and setters):

  » You can create a read-only property by providing a accessor but not a set
    accessor. Then other classes can retrieve the property value — but can’t
    change it.

  » Instead of storing the property value in a private field, you can calculate it
    each time the get accessor method is called.

    Example:

     public double getOrderTotal()
     {
       return unitPrice * quantityOrdered;
     }


  » You can protect the class from bad data by validating data in a property set
    accessor and either ignoring invalid data or throwing an exception if invalid
    data is passed to the method.

    Example:

    public void setHealth(int h)
    {
      if (h < 0)
         health = 0;
      else if (h > 100)
         health = 100;
      else
         health = h;
     }















*/
