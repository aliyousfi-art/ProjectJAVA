package fr.campus.dungecrawler;
import java.util.Scanner;

public class Game {

    public void startGame() {
    Menu menu = new Menu();
    Scanner scanner = new Scanner (System.in);
    int lifeLevel = 0;
    int attackLevel = 0;

    int choice = menu.showMenu();

    if (choice == 1){

        System.out.println("Choisissez le type du personnage :");
        String type = scanner.nextLine();

        System.out.println("Quel est le nom du personnage ?");
        String name = scanner.nextLine();

        if (type.equals("Warrior")){
            lifeLevel = 10;
            attackLevel =  10;
        }
        if (type.equals("Wizard")){
            lifeLevel = 6;
            attackLevel = 15;
        }
        OffensiveEquipment offensiveEquipment = new OffensiveEquipment("Weapon", "Sword" , 10);

        Player player = new Player (type, name, lifeLevel, attackLevel, offensiveEquipment );

        System.out.println(player);
    }
    if (choice == 2){
        System.out.println("Quitter le Jeu ");
    }
}
}
