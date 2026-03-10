package character;

import equipment.DefensiveEquipment;
import equipment.OffensiveEquipment;

public abstract class Player {

    private String name;
    private int lifePoints;
    private int strength;
    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;

    public Player(String name, int lifePoints, int strength) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getStrength() {
        return strength;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    @Override
    public String toString() {
        return "Personnage : " + name +
                ", vie : " + lifePoints +
                ", force : " + strength;
    }
}

