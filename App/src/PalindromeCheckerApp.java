import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        // Close scanner
        scanner.close();
    }
}
