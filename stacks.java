import java.util.Scanner;
import java.util.Stack;

public class stacks {

    public static void main(String[] args) {
        System.out.println("Enter a word and check if its a valid palindrome! ");
        Scanner input = new Scanner(System.in);
        System.out.print("word: ");
        String word = input.nextLine();

        Stack<Character> stacko = new Stack<>();
        for(int i = 0; i < word.length(); i++){
            stacko.push(word.charAt(i));
        }

        StringBuilder reverse = new StringBuilder();

        while(!stacko.isEmpty()) {
             reverse.append(stacko.pop());
        }

        if (word.equals(reverse.toString()))
            System.out.println("Is it a palindrome? : ✅ yessire ( •̀ ω •́ )✧");
        else
            System.out.println("Is it a palindrome? : ❌ nope (。_。) ");

        System.out.println("Original word: " + word);
        System.out.println("Word reversed: " + reverse);
        if (!word.equals(reverse.toString()))
            System.out.println("Better next time!...(i guess?)");
    }

}
