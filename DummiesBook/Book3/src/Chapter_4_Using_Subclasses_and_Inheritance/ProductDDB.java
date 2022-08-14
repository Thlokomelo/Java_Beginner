/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 297
Throwing a custom exception

Method retrieves product data from a file and throws
a ProductDataException if an IOException occurs

 */
public class ProductDDB {

    public static Product getProduct(String code)
            throws ProductDataException {
        try {
            Product p;
// code that gets the product from a file
// and might throw an IOException
            p = new Product();
            return p;
        } catch (IOException e) {
            throw new ProductDataException(
                    "An IO error occurred.");
        }
    }

}


// Example of code that would call the getProduct method and catch the exception:

try
{
  Product p = ProductDB.getProduct(productCode);
}
catch (ProductDataException e)
{
  System.out.println(e.getMessage());
}
