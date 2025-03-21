package cinterodiaz.mastermind.views;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.utils.Console;

public class BoardView extends WithBoardView {

    public BoardView(Board board) {
        super(board);
    }

    public void write() {
        Console console = Console.getInstance();
        int attempts = this.board.getAttempts();
        Message.ATTEMPTS.writeln(attempts);
        Message.SECRET_COMBINATION.writeln();
        for (int i = 0; i < attempts; i++) {
            // terminar!!
            // new ProposedCombinationView().write(board.getProposedCombinationColors(i));
            // Message.RESULT.writeln(board.getBlacks(i), board.getWhites(i));
        }
    }

}
