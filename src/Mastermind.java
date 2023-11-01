
public class Mastermind {

    private Game game;

    public Mastermind() {
    }

    public void initGame() {
        game = new Game();
    }

    public void removeGame() {
        game = null;
    }

    public static void main(String[] args){
        
        new Mastermind().play();
    }

    private void play() {
        
        do {
            this.removeGame();
            this.initGame();
            game.play();
        } while (this.game.isResumed());
    }



}
