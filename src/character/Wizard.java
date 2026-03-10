package character;

import equipment.Spell;

public class Wizard extends Player {

    public Wizard(String name) {
        super(name, 6, 15);
        setOffensiveEquipment(new Spell("Boule de feu", 7));
    }

    @Override
    public String toString() {
        return "Wizard - " + super.toString();
    }
}
