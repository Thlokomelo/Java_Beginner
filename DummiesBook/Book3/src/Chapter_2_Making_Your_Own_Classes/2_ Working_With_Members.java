/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 253

Working with members

Members of a class are fields and methods defined in the class body.

- Understanding fields

  » A field is a variable that’s defined in the body of a class, outside any of the class’s
    methods. Fields, which are also called class variables, are available to all the methods
    of a class.

  »  If field specifies the public keyword: field is visible outside the class.
  »  If field specifies the private keyword: field not visible outside the class.

     Examples of public and private field declarations:

     public int trajectory = 0;
     public String name;
     public Player player;

     private int x_position = 0;
     private int y_position = 0;
     private String error-message = ""; 

  » Fields can also be declared as Final:

    public final int MAX_SCORE = 1000;  

    NB: (Field cant be changed, customary to spell Final field names in 
         all capital letters, but not reauired)

- Understanding methods

  » To declare a method that’s available to users of your class, add the public
    keyword to the method declaration:

    public boolean isActive()
      {
        return this.isActive;
      }

  » To create a private method that can be used within the class but isn’t visible outside
    the class, use the private keyword:

     private void calculateLunarTrajectory()
      {
        // code to get the calculated lunar trajectory
      }

- Understanding visibility

 » Public and private keywords indicate the visibility of the field or method.

 » The combination of all the members that have public access is sometimes called
   the public interface of your class.

 » The term Expose is also used to refer to creation of puclic members. 
   e.g. a class exposes xxxx method i.e. method is vailable to other classes.


 */

