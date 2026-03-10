package character;

import equipment.Shield;
import equipment.Weapon;

public class Warrior extends Player {

    public Warrior(String name) {
        super(name, 10, 10);
        setOffensiveEquipment(new Weapon("Épée", 5));
        setDefensiveEquipment(new Shield("Bouclier", 5));
    }

    @Override
    public String toString() {
        return "Warrior - " + super.toString();
    }
}
