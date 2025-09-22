import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        //  Print each character one by one
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}
//I needed a way to look at each letter individually. That’s where .charAt(i) came in  it lets me pull out one character at a time.Then I used a for loop that starts at 0 and keeps going until it reaches the end of the string.

//In plain words the loop is just walking through every single letter in what I typed, one by one, and .charAt(i) is the part that’s actually pulling each letter out. I picked i < input.length() because that makes sure the loop stops right at the end of the word/sentence, not after.

//That’s it nothing too fancy  just trial error and some quick googling.:3
