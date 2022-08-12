/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 265

Using Initialisers
Class gets the value for the class field from the user when the class is initialised

 */


class PrimeClass {

    private Scanner sc = new Scanner(System.in);
    public int x;

    {
        System.out.print(
                "Enter the starting value for x: ");
        x = sc.nextInt();
    }
}
