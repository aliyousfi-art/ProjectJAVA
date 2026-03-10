package game;

import character.Player;
import setting.Menu;

public class Game {

    private Player player;
    private int playerPosition;
    private Dice dice;
    private Board board;
    private Menu menu;

    public Game(Menu menu) {
        this.menu = menu;
        this.dice = new Dice();
        this.board = new Board();
        this.playerPosition = 0;
    }

    public void startGame() {

        player = menu.createCharacter();
        menu.displayCharacter(player);

        while (playerPosition < board.size() - 1) {

            int result = dice.roll();
            playerPosition += result;

            if (playerPosition >= board.size()) {
                playerPosition = board.size() - 1;
            }

            System.out.println("Position : " + playerPosition + "/ 64");
            System.out.println(board.getCell(playerPosition - 1));
        }

        System.out.println("Fin du jeu !");
    }
}