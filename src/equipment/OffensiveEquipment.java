package equipment;

public abstract class OffensiveEquipment {

    private String name;
    private int attackLevel;

    public OffensiveEquipment(String name, int attackLevel) {
        this.name = name;
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    @Override
    public String toString() {
        return name + " (attaque : " + attackLevel + ")";
    }
}