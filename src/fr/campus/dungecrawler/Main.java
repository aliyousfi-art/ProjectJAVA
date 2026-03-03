package fr.campus.dungecrawler;

import game.Game;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans Dungeon Crawler !");

        Game game = new Game();
        game.startGame();
    }
}