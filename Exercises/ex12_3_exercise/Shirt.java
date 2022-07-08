/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_3_exercise;


public class Shirt extends Item {

    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

    public void display() {
        super.display();
        System.out.println("\tSize: " + size);
        System.out.println("\tColor Code: " + colorCode);
    }

    // Code a public getColor method that converts the colorCode to a the color name
    // Use a switch statement.  Return the color name. 
    public String getColor() {
        String color = "";
        switch (colorCode) {
            case 'W':
                color = "White";
                break;
            case 'G':
                color = "Gray";
                break;
            case 'B':
                color = "Blue";
                break;
            case 'Y':
                color = "Yellow";
                break;
            case 'P':
                color = "Purple";
                break;
            default:
                color = "Invalid code";
        }
        return color;
    }
}

