package LW_02;

import java.util.*;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        sentence = sentence.toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        StringBuilder cleanedSentence = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            word = word.replaceAll("[^a-z]", "");
            cleanedSentence.append(word);
        }
        String original = cleanedSentence.toString();
        String reversed = cleanedSentence.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }

}
