package mastermind;

import java.util.LinkedList;

import utils.Console;

public class Board {

    private LinkedList<Attempt> attemps;
    private WinnerCombination winnerCombination;

    public Board() {
        this.attemps = new LinkedList<Attempt>();
        this.winnerCombination = new WinnerCombination();
    }

    public boolean hasWon() {
        return this.attemps.peekLast().isWinner();
    }

    public boolean hasLost() {
        return (this.attemps.size() >= 10);
    }

    public void displayBoard() {
        Console console = Console.getInstance();
        console.writeln("");
        console.writeln(this.attemps.size() + " Attempt(s):");
        console.writeln("xxxx");
        for (Attempt attempt_i : this.attemps) {
            attempt_i.display();
        }
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.attemps.add(new Attempt(proposedCombination, winnerCombination));
    }
}
