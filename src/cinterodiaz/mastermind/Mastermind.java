package cinterodiaz.mastermind;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.View;

abstract class Mastermind {

    private Board board;
    private View view;

    protected Mastermind() {
        this.board = new Board();
        this.createView(this.board);
    }

    abstract View createView(Board board);

    protected void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }
}
