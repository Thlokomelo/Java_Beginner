
package ex11_2_exercise;

public class ShoppingCart {
    
    // Parse the args array to populate name and age. 
        public static void main(String[] args) {
        String name;
        int age;

	// Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
                System.out.println("Error, invalid arg passed.  There should be 2/more arguments!");
        } else {
                name = args[0];
                age = Integer.parseInt(args[1]);
                System.out.println("Name = "+name+", Age = "+age);
        }
    }
}
