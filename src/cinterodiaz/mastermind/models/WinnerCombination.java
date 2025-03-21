package cinterodiaz.mastermind.models;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import cinterodiaz.mastermind.types.Color;

public class WinnerCombination extends Combination {

    public WinnerCombination() {
        super();
        Color[] totalColors = Color.values();
        Random randomInt = new Random(System.currentTimeMillis());
        Set<Color> colorsSet = new HashSet<>();

        while (colorsSet.size() < colours.length) {
            colorsSet.add(totalColors[randomInt.nextInt(totalColors.length)]);
        }

        colorsSet.toArray(this.colours);
    }
}
