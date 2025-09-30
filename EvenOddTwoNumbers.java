// Program to check if two numbers are even or odd with direct input
class EvenOddTwoNumbers {
    public static void main(String[] args) {
        int num1 = 16; // first number
        int num2 = 70; // second number

        // Check first number
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even.");
        } else {
            System.out.println(num1 + " is odd.");
        }

        // Check second number
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even.");
        } else {
            System.out.println(num2 + " is odd.");
        }
    }
}
