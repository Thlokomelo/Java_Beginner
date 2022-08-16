/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Working_With_Statics;

/*
Page: 295
Singleton Pattern

- A singleton is a class that you can use to create only one instance. When you try to create 
  an instance, the class first checks to see whether an instance already exists. If so, the 
  existing instance is used; if not, a new instance is created.

 */

class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

/*

Here’s a bit of code that calls the getInstance method twice and then compares the 
resulting objects:

SingletonClass s1 = SingletonClass.getInstance();
SingletonClass s2 = SingletonClass.getInstance();
if (s1 == s2)
 System.out.println("The objects are the same");
else
 System.out.println("The objects are not the same");

 */
