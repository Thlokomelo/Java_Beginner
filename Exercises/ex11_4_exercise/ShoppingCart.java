package ex11_4_exercise;

//Fix the error by adding an import statement.
import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {

        /*In the main method of ShoppingCart, declare, instantiate, 
     and initialize at least 3 elements in an ArrayList of Strings. */
        ArrayList<String> names = new ArrayList<>();
        names.add("Billy");
        names.add("Mpho");
        names.add("Thandi");

        //Print the ArrayList and run it to test your code. 
        System.out.println(names);

        /* Use the add method to add a new element somewhere in the 
     middle of the list. */
        names.add(2, "Sam");

        //Print the list again to see the affect.
        System.out.println(names);

        // Check for the existence of a particular String element.  
        if (names.contains("Billy")) {
       // Remove it, if it exists.
            names.remove("Billy");
        }

        //Print the list again.
        System.out.println(names);
    }
}
