package cinterodiaz.mastermind.views.console;

import cinterodiaz.mastermind.models.Attempt;
import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.Message;
import cinterodiaz.mastermind.views.WithBoardView;
import cinterodiaz.utils.Console;

public class AttemptsView extends WithBoardView {

    AttemptsView(Board board) {
        super(board);
    }

    public int getSize() {
        return this.board.getAttempts().size();
    }

    public void write() {
        Console console = Console.getInstance();
        for (Attempt attempt : this.board.getAttempts()) {
            console.write(attempt.getProposedCombinationString());
            new MessageView().writeln(Message.RESULT, attempt.getBlacks(), attempt.getWhites());
        }
    }

}
