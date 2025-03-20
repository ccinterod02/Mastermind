package mastermind;

import mastermind.models.Game;
import mastermind.views.View;

public class Mastermind {

    private Game game;
    private View view;

    public Mastermind() {
    }

    private void initGame() {
        this.game = new Game();
        this.view = new View(this.game);
    }

    private void play() {
        do {
            this.removeGame();
            this.initGame();
            game.play();
        } while (this.game.isResumed());
    }

    private void removeGame() {
        game = null;
    }

    public static void main(String[] args) {

        new Mastermind().play();
    }
}
