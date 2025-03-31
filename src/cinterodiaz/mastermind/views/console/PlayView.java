package cinterodiaz.mastermind.views.console;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.Message;
import cinterodiaz.mastermind.views.WithBoardView;

public class PlayView extends WithBoardView {

    BoardView boardView;

    public PlayView(Board board) {
        super(board);
        this.boardView = new BoardView(board);
    }

    public void interact() {
        do {
            this.board.addProposedCombination(new ProposedCombinationView().readProposedCombination());
            this.boardView.write();
        } while (!this.board.isFinished());
        if (this.board.hasWon()) {
            new MessageView().writeln(Message.WINNER);
        } else {
            new MessageView().writeln(Message.LOOSER);
        }
    }

}
