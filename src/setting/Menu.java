package setting;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("==MENU==");
        System.out.println("1 - Nouveau Personnage");
        System.out.println("2 - Quitter le jeu");

        int choice = scanner.nextInt();
        return choice;
    }
}