package equipment;

public abstract class DefensiveEquipment {

    private String type ;
    private int LevelDef;
    private String name;

    DefensiveEquipment(String type, int LevelDef, String name){
        this.type = type;
        this.LevelDef = LevelDef;
        this.name = name;
    }

    public String getType(){
        return type;
    }
    public int getLevelDef(){
        return LevelDef;
    }
    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setLevelDef(int LevelDef){
        this.LevelDef = LevelDef;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "| Type: " + type + "| LevelDef: " + LevelDef + "| Name : " + name ;
    }
}
