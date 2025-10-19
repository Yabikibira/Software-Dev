public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a sentence for analysis:");
        String line = sc.nextLine();

        String report = analyzeText(line);     
        System.out.println(report);            

        sc.close();
    }

    // returns a tiny report
    public static String analyzeText(String s) {
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            // count spaces
            if (ch == ' ') {
                spaces = spaces + 1;
            }
            // count vowels 
            else if (isVowel(ch)) {
                vowels = vowels + 1;
            }
            // count consonants 
            else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                consonants = consonants + 1;
            }
            // else: ignore punctuation numbers for this simple version

            i = i + 1;
        }

        return "vowels: " + vowels + ", consonants: " + consonants + ", spaces: " + spaces;
    }

    // helper: checks if a char is one of AEIOUaeiou 
    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }
}
