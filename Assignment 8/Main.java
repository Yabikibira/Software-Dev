import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // this connects to the file 
        File inputfile = new File("practice.txt");

        // list to store all names
        List<String> allNames = new ArrayList<>();

        // list to store names with gpa over 3.5
        List<String> highGpa = new ArrayList<>();

        // counting how many names total
        int total = 0;

        try {
            // scanner to read the file
            Scanner input = new Scanner(inputfile);

            // reading the file line by line
            while (input.hasNext()) {

                // read the student's name
                String name = input.next();

                // read the student's gpa
                double gpa = input.nextDouble();

                // add name to total list
                allNames.add(name);

                // increase total count
                total++;

                // check if gpa is over 3.5
                if (gpa > 3.5) {
                    highGpa.add(name);
                }
            }

            input.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // optional print to see indices of names
        System.out.println(allNames);

        // print total names
        System.out.println("Total names: " + total);

        // print names with high gpa
        System.out.println("GPA over 3.5: " + highGpa);
    }
}
