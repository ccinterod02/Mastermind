package cinterodiaz.mastermind.views;

import cinterodiaz.mastermind.models.Board;

public abstract class View extends WithBoardView {

    public View(Board board) {
        super(board);
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();

}
