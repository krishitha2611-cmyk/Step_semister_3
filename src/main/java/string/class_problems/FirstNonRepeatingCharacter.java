package string.class_problems;

public class FirstNonRepeatingCharacter {

    static char findFirstNonRepeatingChar(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1)
                return text.charAt(i);
        }

        return '#';
    }

    public static void main(String[] args) {

        String word = "swiss";

        char result = findFirstNonRepeatingChar(word);

        if (result == '#')
            System.out.println("No Non-Repeating Character Found");
        else
            System.out.println("First Non-Repeating Character : " + result);
    }
}