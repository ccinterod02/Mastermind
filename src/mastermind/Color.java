package mastermind;

public enum Color {
    RED("r"),
    GREEN("g"),
    BLUE("b"),
    YELLOW("y"),
    PINK("p"),
    ORANGE("o");

    private String initialLetter;

    private Color(String initialLetter) {
        this.initialLetter = initialLetter;
    }

    public String getInitialLetter() {
        return initialLetter;
    }
}