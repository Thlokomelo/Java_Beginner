/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 289


Casting Up and Down

- Upcasting: 
  » Upcasting is the typecasting of a child object to a parent object.
    Upcasting gives the flexibility to access the parent class members 
    but it is not possible to access all the child class members using this feature.
    Instead of all the members, we can access some specified members of the child class. 
    For instance, we can access the overridden methods.

- Upcasting is allowed in Java, however downcasting gives a compile error.

Examples:

//Upcasting
public void hit(Ball b)        //method: Accepts ball type as a parameter
                               //When called, you either pass it a Ball or BaseBall object (Baseball is a subclass of ball)

BaseBall b1 = new BaseBall();          
hit(b1);
Ball b2 = b1;
hit(b2);
// program compiles



//Downcasting: Gives error, wont compile
public void toss(BaseBall b)

Ball b = new BaseBall();           
toss(b);
// error: won't compile

//Alternative
Ball b = new BaseBall();
toss((BaseBall) b);


- ClassCasstExceptions

Ball b = new SoftBall();
toss((BaseBall) b);
// error: b isn't a Softball

Alternative: create a variable of the subclass & then use an assignment statement to cast the object

Ball b = new SoftBall();
SoftBall s = (SoftBall)b;         // cast the Ball to a SoftBall
s.riseBall();

OR

Ball b = new SoftBall();
((SoftBall) b).riseBall();   //expression ((SoftBall) b) returns the object referenced by the b variable cast as SoftBall
                             //then the method riseBall() is called


















*/