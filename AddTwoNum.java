import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();  // read first number

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();  // read second number

        int sum = num1 + num2;  // calculate sum

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close(); // close scanner
    }
}
