/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Making_Your_Own_Classes;

/*
Page: 265

prompts the user for the value in the constructor
 */
class PrimeClass {

    private Scanner sc = new Scanner(System.in);
    public int x = getX();

    private int getX() {
        System.out.print("Enter the starting value "
                + "for x: ");
        return sc.nextInt();
    }
}
