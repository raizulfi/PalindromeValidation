import java.util.*;

public class Queue {

    public static boolean PalindromeValidation(String word) {
        Deque<Character> wordDeque = new LinkedList<>(); 
        for (Character c : word.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // ignores spaces and anything that's not a letter or digit
                wordDeque.add(c);
            }
        }
        while (wordDeque.size() > 1) {
            if (wordDeque.pollFirst() != wordDeque.pollLast()) { // checks first and last characters are (not) the same
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a word and check if its a valid palindrome! ");
        Scanner input = new Scanner(System.in);
        System.out.print("word: ");
        String word = input.nextLine();
        if(PalindromeValidation(word)) // true
            System.out.println("Is it a palindrome? : ✅ yessire ( •̀ ω •́ )✧");
        else {
            System.out.println("Is it a palindrome? : ❌ nope (。_。) ");
            System.out.println("Better next time!...(i guess?)");
        }

    }
}
