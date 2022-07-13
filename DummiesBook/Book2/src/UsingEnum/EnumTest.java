/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UsingEnum;

public class EnumTest
{
public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}  //creates an enum

public static void main(String[] args)
{
CardSuit suit;                   //declares a variable using enum's name as a data type
suit = CardSuit.HEARTS;          //assign a value by using the enum name followed by a period and any of the enum values
System.out.println("The suit is " + suit);
}
}
