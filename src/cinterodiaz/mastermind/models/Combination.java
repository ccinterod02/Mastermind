package cinterodiaz.mastermind.models;

import cinterodiaz.mastermind.types.Color;

public class Combination {

    protected Color[] colours;

    public Combination() {
        this.colours = new Color[4];
    }

    public Color[] getColours() {
        return colours;
    }

    public void setColours(Color[] colours) {
        this.colours = colours;
    }

    public String toString() {
        String combination = "";
        for (int i = 0; i < colours.length; i++) {
            combination += colours[i].getInitialLetter();
        }

        return combination;
    }

}
