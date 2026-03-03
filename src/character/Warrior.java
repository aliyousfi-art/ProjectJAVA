package character;

import equipment.OffensiveEquipment;

public class Warrior extends Player {
    public Warrior(String type, String name, int lifeLevel, int attackLevel, OffensiveEquipment offensiveEquipment){
        super(type, name, lifeLevel, attackLevel, offensiveEquipment);
    }
}

