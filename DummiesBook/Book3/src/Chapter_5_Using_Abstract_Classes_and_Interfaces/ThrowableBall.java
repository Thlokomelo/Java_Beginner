/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Using_Abstract_Classes_and_Interfaces;

/*
Page: 307

Extending Interfaces


 */
public interface ThrowableBall {               //1st interface declared

    void throwBall();                          //method
  
    void catchBall();                          //method
}

public interface KickableBall {               //2nd interface declared

    void kickBall();                          //method

    void catchBall();                         //method
}

public interface PlayableBall                 //3rd interface declared, extends the above 2 
        extends ThrowableBall, KickableBall {

    void dropBall();                          //method
}


/*
Thus any class that implements the PlayableBall interface must provide an
implementation for four methods: throwBall, catchBall, kickBall, and drop-
Ball. Note that because the catchBall methods defined by the ThrowableBall
and KickableBall interfaces have the same signature, only one version of the
catchBall method is included in the PlayableBall interface.
*/