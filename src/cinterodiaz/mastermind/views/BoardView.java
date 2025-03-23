package cinterodiaz.mastermind.views;

import cinterodiaz.mastermind.models.Board;

public class BoardView extends WithBoardView {

    public BoardView(Board board) {
        super(board);
    }

    public void write() {
        AttemptsView attemptsView = new AttemptsView(board);
        Message.ATTEMPTS.writeln(attemptsView.getSize());
        Message.SECRET_COMBINATION.writeln();
        attemptsView.write();
    }

}
