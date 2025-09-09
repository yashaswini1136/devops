import java.util.Scanner; // Import Scanner class

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read input from user
        
        System.out.println("You entered: " + input); // Display the entered string
        
        scanner.close(); // Close the scanner
    }
}
