package cinterodiaz.mastermind;

import cinterodiaz.mastermind.models.Board;
import cinterodiaz.mastermind.views.View;
import cinterodiaz.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView(Board board) {
        return new ConsoleView(board);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
