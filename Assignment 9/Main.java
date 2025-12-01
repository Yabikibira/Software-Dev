import java.util.Stack;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // stack with numbers
        Stack<Integer> stax = new Stack<>();
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.add(386);

        // linkedlist with numbers
        LinkedList<Integer> linky = new LinkedList<>();
        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);



        int max = stax.get(0);  
        int min = stax.get(0);

        for (int num : stax) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        //  how many elements in stack
        int count = stax.size();
        System.out.println("Stack size: " + count);
        // middle value of linkedlist

        int midIndex = linky.size() / 2;
        int midValue = linky.get(midIndex);

        System.out.println("Middle value: " + midValue);
        // real life example 
        LinkedList<String> line = new LinkedList<>();
        // person joins line
        line.add("Person 1");
        line.add("Person 2");
        line.add("Person 3");

        System.out.println("Line: " + line);

        line.removeFirst();
        System.out.println("After helping first person: " + line);
        
        line.add("Person 4");

        System.out.println("New line: " + line);
    }
}
