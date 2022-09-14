/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_6_Using_Bulk_Data_Operations_with_Collections;

import java.util.ArrayList;

/**
 *
 * @author thlok
 */
public class Spell2 {

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

System.out.println("First Parallel stream: ");
spells.parallelStream()
.forEach(s -> System.out.println(s));
System.out.println("\nSecond Parallel stream: ");
spells.parallelStream()
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
    public Spell2(String spellName, SpellType spellType,
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
