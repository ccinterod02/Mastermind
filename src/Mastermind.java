
public class Mastermind {

    private Game game;

    public Mastermind() {
        game = new Game();
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
