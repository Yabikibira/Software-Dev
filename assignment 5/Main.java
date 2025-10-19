import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Problem 2 (Factorial):");
        int factorialAnswer = problem2Factorial(sc); // returns an int
        System.out.println("Factorial is: " + factorialAnswer);


        System.out.println("\nProblem 3 (Sum of every other number starting from 1):");
        int everyOtherSum = problem3SumEveryOther(sc); // returns an int
        System.out.println("Sum is: " + everyOtherSum);

        
        System.out.println("\nProblem 5 (Reverse a string):");
        String reversedText = problem5Reverse(sc); // returns a String
        System.out.println("Reversed: " + reversedText);

        sc.close();
    }

    //  Ask the user for a number. Loop to find the factorial of it 
    public static int problem2Factorial(Scanner sc) {
        System.out.println("Enter a positive number for factorial:");
        int n = sc.nextInt();              
        int fact = 1;                      
        for (int i = 1; i <= n; i = i + 1) {
            fact = fact * i;              // multiply up to n
        }
        return fact;                       // since we need the value, not void
    }

    //Ask for a number N, sum every OTHER number starting from 1 
    public static int problem3SumEveryOther(Scanner sc) {
        System.out.println("Enter a number N — I’ll add 1 + 3 + 5 + ... up to N:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) { 
            sum = sum + i;
        }
        return sum;
    }

    // Take a string from the user and print the reverse 
    public static String problem5Reverse(Scanner sc) {
        System.out.println("Type a whole line to reverse:");
        sc.nextLine();                  
        String s = sc.nextLine();      
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i = i - 1) { // go backwards
            rev = rev + s.charAt(i);    // basic string build
        }
        return rev;
    }
}
