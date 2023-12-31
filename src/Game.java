public class Game {

    private Board board;
    private Player player;

    public Game() {
        this.board = new Board();
        this.player = new Player();
    }

    private boolean isFinished() {
        if (this.board.hasWon()) {
            return true;
        }
        else if (this.board.hasLost()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void play() {

        do {
            this.board.addProposedCombination(this.player.proposeCombination());
            this.board.displayBoard();    
        } while (!this.isFinished());
        
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
            answer = new Console().readString("RESUME? (y/n): ");
        } while (!answer.equals("y") && !answer.equals("Y") && !answer.equals("n") && !answer.equals("N"));
        return answer.equals("y") || answer.equals("Y");
    }
}