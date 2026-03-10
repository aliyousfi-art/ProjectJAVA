package equipment;

public abstract class DefensiveEquipment {

    private String name;
    private int defenseLevel;

    public DefensiveEquipment(String name, int defenseLevel) {
        this.name = name;
        this.defenseLevel = defenseLevel;
    }

    public String getName() {
        return name;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    @Override
    public String toString() {
        return name + " (défense : " + defenseLevel + ")";
    }
}