package fr.campus.dungeoncrawler;

import game.Game;
import setting.Menu;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the game of dungeoncrawler");

        Menu menu = new Menu();
        Game game = new Game(menu);

        game.startGame();
    }
}