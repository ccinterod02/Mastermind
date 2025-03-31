package cinterodiaz.mastermind.views;

import cinterodiaz.mastermind.models.Board;

public abstract class WithBoardView {
    protected Board board;

    protected WithBoardView(Board board) {
        this.board = board;
    }
}
