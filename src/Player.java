public class Player {
    
    public Player() {
        
    }

    public ProposedCombination proposeCombination() {
        ProposedCombination combination = new ProposedCombination();
        combination.createProposedCombination(new Console().readString("Propose a combination: "));
        return combination;
    }
}
