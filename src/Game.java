import java.util.LinkedList;

/**
 * Game
 */
public class Game {

    private Board board;
    private Player player;

    public Game() {
        this.board = new Board();
        this.player = new Player();
    }

    public void play() {

        do {
            this.board.addProposedCombination(this.player.proposeCombination());
            this.board.displayBoard();    
        } while (!this.board.hasWon() || !this.board.hasLost());
        
        if (this.board.hasWon()) {
            new Console().printString("You've won!!! ;-)");
        }
        else {
            new Console().printString("You've lost!!! :-(");
        }
    }

    public boolean isResumed() {

        String answer;
        do {
            answer = new Console().readString("¿Desea continuar? (s/n): ");
        } while (!answer.equals("s") || !answer.equals("n"));
        return answer.equals("s");
    }
}