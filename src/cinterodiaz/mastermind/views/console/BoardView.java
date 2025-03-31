package cinterodiaz.mastermind.views.console;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.Message;
import cinterodiaz.mastermind.views.WithBoardView;

public class BoardView extends WithBoardView {

    public BoardView(Board board) {
        super(board);
    }

    public void write() {
        AttemptsView attemptsView = new AttemptsView(board);

        new MessageView().writeln(Message.ATTEMPTS, attemptsView.getSize());
        new MessageView().writeln(Message.SECRET_COMBINATION);
        attemptsView.write();
    }

}
