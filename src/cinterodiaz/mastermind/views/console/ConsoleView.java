package cinterodiaz.mastermind.views.console;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.View;

public class ConsoleView extends View {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView(Board board) {
        super(board);

        this.startView = new StartView(this.board);
        this.playView = new PlayView(this.board);
        this.resumeView = new ResumeView(this.board);
    }

    @Override
    public void start() {
        this.startView.interact();
    }

    @Override
    public void play() {
        this.playView.interact();
    }

    @Override
    public boolean resume() {
        return this.resumeView.interact();
    }

}
