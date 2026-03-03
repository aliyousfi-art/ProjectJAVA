package character;

import equipment.OffensiveEquipment;

public class Wizard extends Player{
    public Wizard(String type, String name, int lifeLevel, int attackLevel, OffensiveEquipment offensiveEquipment){
        super(type, name, lifeLevel, attackLevel,offensiveEquipment);
    }
}
