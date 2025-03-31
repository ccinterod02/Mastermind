package cinterodiaz.mastermind.views.console;

import java.util.HashSet;
import java.util.Set;

import cinterodiaz.mastermind.models.ProposedCombination;
import cinterodiaz.mastermind.types.Error;
import cinterodiaz.mastermind.views.Message;
import cinterodiaz.utils.Console;

public class ProposedCombinationView {

    public ProposedCombination readProposedCombination() {
        Error error;
        String chars;
        do {
            chars = Console.getInstance().readString(Message.PROPOSED_COMBINATION.toString()).toLowerCase();
            error = this.checkCombination(chars);
        } while (!error.isNoError());
        return new ProposedCombination(chars);
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

    private Error checkCombination(String chars) {
        Console console = Console.getInstance();
        if (chars.length() != 4) {
            console.writeln("Wrong size, it must be 4 chars.");
            return Error.WRONG_SIZE;
        }
        for (int i = 0; i < chars.length(); i++) {
            if (!this.checkLetters(chars.charAt(i), "rbypog")) {
                console.writeln("Wrong colours, they must be: rbypog.");
                return Error.WRONG_COLOURS;
            }
        }

        if (this.hasDuplicateCharacters(chars)) {
            console.writeln("The combination must not have duplicated colours.");
            return Error.DUPLICATED_CHARS;
        }
        return Error.NO_ERROR;
    }

}
