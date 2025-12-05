import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text (type 'exit' to quit):");
        while (scanner.hasNext()) {
            String input = scanner.next();  // Reads the next token (word)
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("You entered: " + input);
        }

        scanner.close();
    }
}
