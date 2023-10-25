import java.util.LinkedList;

/**
 * Game
 */
public class Game {

    private Board board;
    private Player player;

    public Game() {
        board = new Board();
        player = new Player();
        // this.console = new Console();
    }

    public void play() {

        this.board.createWinnerCombination();
        
        do {
            this.player.proposeCombination();
            this.board.displayBoard();    
        } while (!this.board.hasWon() || !this.board.hasLost());
    }

    public boolean isResumed() {

        String answer;
        do {
            answer = console.readString("¿Desea continuar? (s/n): ");
        } while (!answer.equals("s") || !answer.equals("n"));
        return answer.equals("s");
    }


    
}