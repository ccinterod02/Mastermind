
public class Mastermind {

    private Game game;
    private Console console;

    public Mastermind() {
        game = new Game();
        console = new Console();
    }

    public static void main(String[] args){
        Mastermind mastermind = new Mastermind();
        mastermind.play();
    }

    private void play() {
        do {
            game.play();
        } while (game.isResumed());
    }



}
