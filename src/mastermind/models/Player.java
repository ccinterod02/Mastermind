package mastermind.models;

import java.util.HashSet;
import java.util.Set;

import utils.Console;

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
        Console console = Console.getInstance();
        if (buffer.length() != 4) {
            console.writeln("Wrong proposed combination.");
            return false;
        }

        for (int i = 0; i < buffer.length(); i++) {
            if (!this.checkLetters(buffer.charAt(i), "rbypog")) {
                console.writeln("Wrong colours, they must be: rbypog.");
                return false;
            }
        }

        if (this.hasDuplicateCharacters(buffer)) {
            console.writeln("The combination must not have duplicated colours.");
            return false;
        }
        return true;
    }

    public ProposedCombination proposeCombination() {
        String buffer;
        do {
            buffer = Console.getInstance().readString("Propose a combination: ");
        } while (!this.checkCombination(buffer));

        return new ProposedCombination(buffer);
    }
}
