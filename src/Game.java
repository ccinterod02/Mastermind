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
    }

    public void play() {

        board.createWinnerCombination();
        
        do {
            board.addProposedCombination(this.player.proposeCombination());
            board.displayBoard();    
        } while (!board.hasWon() || !board.hasLost());
        
        if (board.hasWon()) {
            console.printString("You've won!!! ;-)");
        }
        else {
            console.printString("You've lost!!! :-(");
        }
    }

    public boolean isResumed() {

        String answer;
        do {
            answer = console.readString("¿Desea continuar? (s/n): ");
        } while (!answer.equals("s") || !answer.equals("n"));
        return answer.equals("s");
    }


    
}