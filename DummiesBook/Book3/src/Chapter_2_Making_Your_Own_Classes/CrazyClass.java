/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 263

Compile Error: The first constructor starts by calling the second constructor, which calls the
first constructor. The compiler complains that this error is a recursive
constructor invocation (Constructor calling itself) and politely refuses to compile the class.

*/
 
class CrazyClass {

    private String firstString;
    private String secondString;

    public CrazyClass(String first, String second) {
        //this(first);
        secondString = second;
    }

    public CrazyClass(String first) {
        this(first, "DEFAULT"); // error: won't compile
    }
}

