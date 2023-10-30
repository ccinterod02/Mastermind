
public class Combination {

    protected  Color[] colours;

    public String toString() {
        String combination = "";
        for (int i = 0; i < 5; i++) {
            combination += colours[i].getInitialLetter(); 
        }

        return combination;
    }

}
