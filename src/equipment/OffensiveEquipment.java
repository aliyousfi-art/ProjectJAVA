package equipment;

public abstract class OffensiveEquipment {

    private String name;
    private String type;
    private int levelAttack;

    public OffensiveEquipment(String type, String name, int levelAttack) {
        this.type = type;
        this.name = name;
        this.levelAttack = levelAttack;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevelAttack() {
        return levelAttack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevelAttack(int levelAttack) {
        this.levelAttack = levelAttack;
    }

    public String toString() {
        return "| Name: " + name + " | Type: " + type + " | LevelAttack: " + levelAttack;
    }
}
