
package ex05_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        message = custName + " Items purchased "+items.length+" items.";
        System.out.println(message);
        System.out.println("Items Purchased");
          for (String item : items) {
          System.out.println(item);  
      }
        
        
        
       // Iterate through and print out the items from the items array

        
    }    
}
