package cinterodiaz.mastermind.views;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.utils.YesNoDialog;

public class ResumeView extends WithBoardView {

    public ResumeView(Board board) {
        super(board);
    }

    public boolean interact() {
        YesNoDialog yesNoDialog = new YesNoDialog();
        yesNoDialog.read(Message.RESUME.toString());
        if (yesNoDialog.isAffirmative()) {
            this.board.reset();
        }
        return yesNoDialog.isAffirmative();
    }

}
