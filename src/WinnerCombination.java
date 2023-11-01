import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WinnerCombination extends Combination {


    public WinnerCombination() {
        super();
        Color[] totalColors = Color.values();
        Random randomInt = new Random(System.currentTimeMillis());
        Set<Color> colorsSet = new HashSet<>();

        while (colorsSet.size() < 5) {
            colorsSet.add(totalColors[randomInt.nextInt(totalColors.length)]);
        }

        colorsSet.toArray(this.colours);
    }
}
