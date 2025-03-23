package cinterodiaz.mastermind.models;

import java.util.LinkedList;

import cinterodiaz.utils.Console;

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

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.attemps.add(new Attempt(proposedCombination, winnerCombination));
    }

    public boolean isFinished() {
        return this.hasLost() || this.hasWon();
    }

    public void reset() {
        this.attemps.clear();
        this.winnerCombination = new WinnerCombination();
    }

    public LinkedList<Attempt> getAttempts() {
        return this.attemps;
    }

}
