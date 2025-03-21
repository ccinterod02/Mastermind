package cinterodiaz.mastermind.views;

import cinterodiaz.mastermind.models.Board;

public class StartView extends WithBoardView {

    public StartView(Board board) {
        super(board);
    }

    public void interact() {
        Message.TITLE.writeln();
    }

}
