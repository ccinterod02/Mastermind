package mastermind;

public class ProposedCombination extends Combination {

    public ProposedCombination(String combination) {
        super();
        for (int i = 0; i < combination.length(); i++) {
            switch (combination.charAt(i)) {
                case 'r':
                    colours[i] = Color.RED;
                    break;
                case 'b':
                    colours[i] = Color.BLUE;
                    break;
                case 'g':
                    colours[i] = Color.GREEN;
                    break;
                case 'y':
                    colours[i] = Color.YELLOW;
                    break;
                case 'o':
                    colours[i] = Color.ORANGE;
                    break;
                case 'p':
                    colours[i] = Color.PINK;
                    break;

                default:
                    break;
            }
        }
    }

    public int compareWithoutPositions(WinnerCombination winnerCombination) {

        int whiteToken = 0;

        Color[] coloursArray = winnerCombination.getColours();
        for (Color i : colours) {
            for (Color j : coloursArray) {
                if (i == j) {
                    whiteToken += 1;
                }
            }
        }

        return whiteToken - compareWithPositions(winnerCombination);
    }

    public int compareWithPositions(WinnerCombination winnerCombination) {

        int blackToken = 0;
        Color[] coloursArray = winnerCombination.getColours();
        for (int i = 0; i < colours.length; i++) {
            if (colours[i] == coloursArray[i]) {
                blackToken += 1;
            }
        }
        return blackToken;
    }

    public boolean isSame(WinnerCombination winnerCombination) {
        return this.compareWithPositions(winnerCombination) == colours.length;
    }

}
