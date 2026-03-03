package fr.campus.dungecrawler;

public class OffensiveEquipment {

    private String name;
    private String type;
    private int levelAttack;

    //Création du Constructor
    OffensiveEquipment(String name, String type, int levelAttack) {
        this.name = name;
        this.type = type;
        this.levelAttack = levelAttack;
    }

    //recup des valeurs
    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }
    public int getLevelAttack() {
        return levelAttack;
    }

    //modifier des valeurs
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setLevelAttack(int levelAttack){
        this.levelAttack = levelAttack;
    }

    //méthode toString()
    public String toString(){
        return "| Name: " + name + "| Type: " + type + "| LevelAttack: " + levelAttack;
    }



}

