

package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String args[]) {
         
        // Declare and initialize 2 Item objects
      Item item1 = new Item();
      Item item2 = new Item();
        
       
	// Print both item descriptions and run code
	item1.desc = "Hat";
        item2.desc = "Blouse";
        System.out.println("Item1: " + item1.desc);
        System.out.println("Item2: " + item2.desc);

	// Assign one item to another and run it again.
        item1 = item2;
        System.out.println("Item1: " + item1.desc);
        System.out.println("Item2: " + item2.desc);

    } 
} 

 
