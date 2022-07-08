
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        
       // Declare and initialize numeric fields: price, tax, quantity, and total.
       double price = 50.99;
       double tax = 14.12;
       int quantity = 10;
       double total;
       
       // Modify message to include quantity 
       String message = custName+" wants to purchase "+ 10 + " " + itemDesc;
       System.out.println(message);
          
     // Calculate total and then print the total cost
     total = quantity * price * tax;
     System.out.println(total);
        
     
        

        
    }    
}
