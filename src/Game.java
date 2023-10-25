/**
 * Game
 */
public class Game {

    private Board board;

    public Game() {
        board = new Board();
        // this.console = new Console();
    }

    public boolean isResumed() {
        
        String answer;
        
        do {
            answer = console.readString("¿Desea continuar? (s/n): ");
        } while (!answer.equals("s") || !answer.equals("n"));
        
        return answer.equals("s");
    }

    public void play() {
        
    }

    
}