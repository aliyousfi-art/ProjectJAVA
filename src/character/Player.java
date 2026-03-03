package character;

import equipment.OffensiveEquipment;

public abstract class Player {

    private String type ;
    private String name ;
    private int lifeLevel;
    private int attackLevel;
    private OffensiveEquipment offensiveEquipment;


    public Player(String type, String name, int lifeLevel, int attackLevel, OffensiveEquipment offensiveEquipment){
        this.type = type;
        this.name = name;
        this.lifeLevel = lifeLevel;
        this.attackLevel = attackLevel;
        this.offensiveEquipment = offensiveEquipment;
    }

    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getLifeLevel(){
        return lifeLevel;
    }
    public int getAttackLevel(){
        return attackLevel;
    }
    public OffensiveEquipment getOffensiveEquipment(){
        return offensiveEquipment;
    }

    public void setType (String type){
        this.type = type;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setLifeLevel(int lifeLevel){
        this.lifeLevel = lifeLevel;
    }
    public void setAttackLevel(int attackLevel){
        this.attackLevel = attackLevel;
    }
    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment){ this.offensiveEquipment = offensiveEquipment;}

    public String toString(){
        return "| Type: " + type + "| Name: " + name + "| LifeLevel: " + lifeLevel + "| AttackLevel: " + attackLevel + "| OffensiveEquipment: " + offensiveEquipment;
    }
}


