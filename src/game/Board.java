package game;

import java.util.ArrayList;

public class Board {

    private ArrayList<String> cells;

    public Board() {
        cells = new ArrayList<>();
        initBoard();
    }

    private void initBoard() {
        for (int i = 0; i <= 64; i++) {
            if (i == 2) {
                cells.add("Case vide");
            } else if (i == 3) {
                cells.add("Ennemi");
            } else if (i == 4) {
                cells.add("Arme");
            } else {
                cells.add("Potion");
            }
        }
    }

    public String getCell(int position) {
        return cells.get(position);
    }

    public int size() {
        return cells.size();
    }
}