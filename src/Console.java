import java.util.Scanner;

public class Console {

    public String readString(String mensaje) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(mensaje);
        String input = scanner.nextLine();

        scanner.close();
        return input;
    }

    public void printString(String string) {
        System.out.println(string);
    }

}
