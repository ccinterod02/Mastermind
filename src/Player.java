import java.util.HashSet;
import java.util.Set;

public class Player {
    
    public Player() {
         
    }

    private boolean checkLetters(char letter, String string) {
        for (int i = 0; i < string.length(); i++) {
            if (letter == string.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasDuplicateCharacters(String input) {

        Set<Character> set = new HashSet<>();

        for (char character : input.toCharArray()) {
            if (set.contains(character)) {

                return true;
            }

            set.add(character);
        }

        return false;
    }

    public ProposedCombination proposeCombination() {

        Console console = new Console();
        boolean okString = false;
        String buffer = "";
        do {
            okString = true;
            buffer = console.readString("Propose a combination: ");
            if (buffer.length() != 5) {
                console.printString("The combination must has 5 letters (r,b,y,p,o,g).");
                okString = false;
            }
            for (int i = 0; i < buffer.length(); i++) {
                if (!this.checkLetters(buffer.charAt(i), "rbypog")) {
                    console.printString("The combination must contains only this letters (r,b,y,p,o,g).");
                    okString = false;
                }
            }
            if (this.hasDuplicateCharacters(buffer)) {
                console.printString("The combination must not contains duplicated characters.");
                okString = false;
            }
        } while (!okString);

        return new ProposedCombination(buffer);
        
    }
}
