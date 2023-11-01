import java.util.Scanner;

public class Console {

    private Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public String readString(String mensaje) {
        this.printString(mensaje);
        String input = this.scanner.nextLine();

        return input;
    }

    public void printString(String string) {
        System.out.println(string);
    }

}
