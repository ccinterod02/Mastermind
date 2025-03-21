package cinterodiaz.mastermind.views;

import cinterodiaz.mastermind.models.Board;

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
            Message.WINNER.writeln();
        } else {
            Message.LOOSER.writeln();
        }
    }

}
