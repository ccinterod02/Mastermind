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

    private boolean checkCombination(String buffer) {
        Console console = new Console();
        if (buffer.length() != 5) {
            console.printString("La combinacion ha de tener 5 caracteres (r,b,y,p,o,g).");
            return false;
        }
        
        for (int i = 0; i < buffer.length(); i++) {
            if (!this.checkLetters(buffer.charAt(i), "rbypog")) {
                console.printString("La combinacion solo ha de estar formada por estos caracteres: (r,b,y,p,o,g).");
                return false;
            }
        }

        if (this.hasDuplicateCharacters(buffer)) {
            console.printString("La combinación no puede contener caracteres duplicados.");
            return false;
        }
        return true;
    }

    public ProposedCombination proposeCombination() {
        Console console = new Console();
        String buffer;
        do {
            buffer = console.readString("Propón una combinación: ");
        } while (!this.checkCombination(buffer));

        return new ProposedCombination(buffer);
    }
}
