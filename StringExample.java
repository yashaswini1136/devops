import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println("You entered: " + input);
        } else {
            System.out.println("No input provided. Using default string.");
            String input = "Default String";
            System.out.println("You entered: " + input);
        }

        scanner.close();
    }
}






