package cinterodiaz.mastermind;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.View;

public class Mastermind {

    private Board board;
    private View view;

    public Mastermind() {
        this.board = new Board();
        this.view = new View(board);
    }

    private void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
