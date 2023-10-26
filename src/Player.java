public class Player {
    
    public Player() {
        
    }

    public ProposedCombination proposeCombination() {
        ProposedCombination combination = new ProposedCombination();
        combination.createProposedCombination(console.readString("Propose a combination: "));
        return combination;
    }
}
