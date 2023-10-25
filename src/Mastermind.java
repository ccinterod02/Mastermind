
public class Mastermind {

    private Game game;
    private Console console;

    public Mastermind() {
        this.game = new Game();
        this.console = new Console();
    }

    public static void main(String[] args){
        new Mastermind().play();
    }

    private void play() {
        do {
            this.game.play();
        } while (this.game.isResumed());
    }



}
