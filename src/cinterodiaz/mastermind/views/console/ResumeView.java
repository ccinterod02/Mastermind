package cinterodiaz.mastermind.views.console;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.Message;
import cinterodiaz.mastermind.views.WithBoardView;
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
