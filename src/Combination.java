
public class Combination {

    protected Color[] colours;

    public Color[] getColours() {
        return colours;
    }

    public void setColours(Color[] colours) {
        this.colours = colours;
    }

    public String toString() {
        String combination = "";
        for (int i = 0; i < 5; i++) {
            combination += colours[i].getInitialLetter(); 
        }

        return combination;
    }



}
