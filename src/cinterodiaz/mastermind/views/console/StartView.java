package cinterodiaz.mastermind.views.console;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.Message;
import cinterodiaz.mastermind.views.WithBoardView;

public class StartView extends WithBoardView {

    public StartView(Board board) {
        super(board);
    }

    public void interact() {
        new MessageView().writeln(Message.TITLE);
    }

}
