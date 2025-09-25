import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){   // start at 1 and go until 10
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        //here's a hint
        int number = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++){   // multiply numbers from 1 up to number
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int number2 = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number2; i = i + 2){   // add every other number
            sum = sum + i;
        }
        System.out.println("The sum of every other number up to " + number2 + " is " + sum);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;   // change run so it stops after one time
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        //hint
        String reverse = "";
        input.nextLine(); // clears leftover enter key
        System.out.println("Enter a word to reverse: ");
        String word = input.nextLine();
        for (int i = word.length() - 1; i >= 0; i--){   // start at the end and go backwards
            reverse = reverse + word.charAt(i);
        }
        System.out.println("The reverse is: " + reverse);

    }
}
