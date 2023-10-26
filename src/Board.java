import java.util.LinkedList;
import java.util.Random;

public class Board {
    
    private LinkedList<Attempt> attemps;
    private WinnerCombination winnerCombination;
    

    public Board(){
        this.attemps = new LinkedList<Attempt>();
        this.winnerCombination = new WinnerCombination(); 
    }

    public boolean hasWon() {
        return this.attemps.peek().isWinner(winnerCombination);
    }

    public boolean hasLost() {
        return this.attemps.size() >= 10 && !this.hasWon();
    }

    public void displayBoard() {
        Console console = new Console();
        console.printString(this.attemps.size() + " Attempt(s):");
        console.printString("xxxx");
        for (Attempt attempt_i : this.attemps) {
            attempt_i.display();
        }        
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        
        this.attemps.add(new Attempt(proposedCombination));
    }
}
