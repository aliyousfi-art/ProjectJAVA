package setting;

import character.Player;
import character.Warrior;
import character.Wizard;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public Player createCharacter() {

        System.out.println("Créer votre personnage");
        System.out.println("1 - Warrior");
        System.out.println("2 - Wizard");

        int choice = Integer.parseInt(scanner.nextLine());


        System.out.println("Nom du personnage : ");
        String name = scanner.nextLine();

        if (choice == 1) {
            return new Warrior(name);
        } else {
            return new Wizard(name);
        }
    }

    public void displayCharacter(Player player) {
        System.out.println(player);
    }
}