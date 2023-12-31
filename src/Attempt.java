
public class Attempt {

    private int matchesWithPosition;
    private int matchesWithoutPosition;
    private ProposedCombination proposedCombination;
    private WinnerCombination winnerCombination;

    public Attempt(ProposedCombination proposedCombination, WinnerCombination winnerCombination) {
        this.proposedCombination = proposedCombination;
        this.winnerCombination = winnerCombination;
        matchesWithPosition = this.proposedCombination.compareWithPositions(winnerCombination);
        matchesWithoutPosition = this.proposedCombination.compareWithoutPositions(winnerCombination);
    }

    public boolean isWinner() {
        
        return this.proposedCombination.isSame(winnerCombination);
    }

    public void display() {
        Console console = new Console();
        console.printString(this.proposedCombination.toString() + " --> " + matchesWithPosition + " blacks and " + matchesWithoutPosition + " whites");
    }
}
