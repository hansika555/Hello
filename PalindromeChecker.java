import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert to lowercase
        int length = str.length();

        // Check characters from start and end
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner to take input
        System.out.print("Enter a word: ");
        String input = scanner.nextLine(); // Read user input

        if (isPalindrome(input)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
        scanner.close(); // Close scanner
    }
}