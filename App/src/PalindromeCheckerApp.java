import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new TwoPointerStrategy();

        long startTime = System.nanoTime();
        boolean result = strategy.isPalindrome(input);
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        sc.close();
    }
}

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class TwoPointerStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}