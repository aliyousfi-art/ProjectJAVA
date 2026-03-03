package game;

import character.Player;
import equipment.OffensiveEquipment;
import setting.Menu;

import java.util.Scanner;

public class Game {

    public void startGame() {

        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        int lifeLevel = 0;
        int attackLevel = 0;

        int choice = menu.showMenu();

        if (choice == 1) {

            scanner.nextLine();

            System.out.println("Choisissez le type du personnage (Warrior ou Wizard) :");
            String type = scanner.nextLine();

            System.out.println("Quel est le nom du personnage ?");
            String name = scanner.nextLine();

            OffensiveEquipment equipment;

            if (type.equals("Warrior")) {

                lifeLevel = 10;
                attackLevel = 10;
                equipment = new OffensiveEquipment("Weapon", "Sword", 10);

            } else if (type.equals("Wizard")) {

                lifeLevel = 6;
                attackLevel = 15;
                equipment = new OffensiveEquipment("Spell", "Fireball", 15);

            } else {

                System.out.println("Type invalide !");
                return;

            }

            Player player = new Player(type, name, lifeLevel, attackLevel, equipment);

            System.out.println("Personnage créé :");
            System.out.println(player);

            // Début de la partie
            Board board = new Board();
            Dice dice = new Dice();

            int position = 1;

            System.out.println("La partie commence !");

            while (position < board.getSize()) {

                int diceResult = dice.rollDice();
                position += diceResult;

                if (position > board.getSize()) {
                    position = board.getSize();
                }

                System.out.println("Vous avez fait : " + diceResult);
                System.out.println("Vous êtes sur la case : " + position + " / " + board.getSize());
            }

            System.out.println("Bravo ! Vous avez terminé le plateau !");
        }

        else if (choice == 2) {

            System.out.println("Quitter le jeu.");

        }

    }
}