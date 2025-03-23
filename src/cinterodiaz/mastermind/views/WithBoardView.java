package cinterodiaz.mastermind.views;

import cinterodiaz.mastermind.models.Board;

abstract class WithBoardView {
    protected Board board;

    WithBoardView(Board board) {
        this.board = board;
    }
}
