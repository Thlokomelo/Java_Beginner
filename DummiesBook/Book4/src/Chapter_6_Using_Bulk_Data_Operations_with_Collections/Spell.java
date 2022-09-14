/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_6_Using_Bulk_Data_Operations_with_Collections;

import java.util.ArrayList;

/*
Page: 464

Suppose you have a list of spells used by a certain wizard who, for copyright purposes,
we’ll refer to simply as HP. The spells are represented by a class named
Spell, which is defined as follows:

 */
public class Spell {

    public static void main(String[] args) {

        //HP Spells are loaded to the ArrayList
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
                "Makes invisible ink appear."));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
                "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
                "Enlarges something."));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
                "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
                "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
                "Locks an opponent's legs."));

        /* 
        list the name of each spell
        ---------------------------
        
       for (Spell spell : spells) {
          System.out.println(spell.name);
         */
        
       //The equivalent code using the streams
      // spells.stream().forEach(s -> System.out.println(s));   //->1 
        
        
        /*
        list just the spells, not the charms or curses
        -----------------------------------------------
        
        for (Spell spell : spells) {
            if (spell.type == Spell.SpellType.SPELL) {
                System.out.println(spell.name);
            }
        }
        
        */
        
        //The equivalent code using the streams                //->2
        spells.stream()                                   
       .filter(s -> s.type == Spell.SpellType.SPELL)
       .forEach(s -> System.out.println(s));
    }

    //Public field declared
    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {
        SPELL, CHARM, CURSE
    }

    //Constructor to specify the 3 fields
    public Spell(String spellName, SpellType spellType,
            String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    //method is overridden to return the spell name.
    public String toString() {
        return name;
    }
}



/*
1.
the stream method of the ArrayList class is used to convert the ArrayList
to a stream. the stream’s forEach method is used to iterate the stream, passing a lambda
expression that calls System.out.println for each item in the stream. The
forEach method processes the entire stream, writing each element to the console

2.
the stream method converts the ArrayList to a stream. Then
the stream’s filter method is used to select just the SPELL items. Finally, the
forEach method sends the selected items to the console.
*/