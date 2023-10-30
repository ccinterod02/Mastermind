
public class Combination {

    private  Color[] colours;

    public Combination(String combination) {
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

    public String toString() {
        String combination = "";
        for (int i = 0; i < 5; i++) {
            combination += colours[i].getInitialLetter(); 
        }

        return combination;
    }

}
