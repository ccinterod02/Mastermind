
public class ProposedCombination extends Combination {


    public ProposedCombination(String combination) {
        super(combination);
    }


    public int compareWithoutPositions(WinnerCombination winnerCombination) {
        return 0;
    }

    public int compareWithPositions(WinnerCombination winnerCombination) {
        return 0;
    }

    public boolean isSame(WinnerCombination winnerCombination) {
        return false;
    }

}
