package string.class_problems;

public class PalindromeChecker {

    static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    static boolean isPalindromeRecursive(String text, int left, int right) {

        if (left >= right)
            return true;

        if (text.charAt(left) != text.charAt(right))
            return false;

        return isPalindromeRecursive(text, left + 1, right - 1);
    }

    static boolean isPalindromeArrayReversal(String text) {

        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }

        return text.equals(new String(reverse));
    }

    public static void main(String[] args) {

        String word = "madam";

        System.out.println("Iterative : " + isPalindromeIterative(word));
        System.out.println("Recursive : " + isPalindromeRecursive(word, 0, word.length() - 1));
        System.out.println("Array Reversal : " + isPalindromeArrayReversal(word));
    }
}