import java.util.Random;

public class student {
    String name;
    String year;
    double gpa;
    int id;

    public student(String n, String y, double g, int i) {
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

    // check if student is honor roll
    public boolean isHonorRoll() {
        return gpa > 3.6;
    }

    // check if student gets free lunch
    public boolean freeLunch(int randomId) {
        return id == randomId;
    }

    public static void main(String[] args) {
        student s1 = new student("Amy", "Freshman", 3.8, 1);
        student s2 = new student("Ben", "Sophomore", 3.4, 2);
        student s3 = new student("Cara", "Junior", 3.9, 3);
        student s4 = new student("Dan", "Senior", 2.7, 4);
        student s5 = new student("Ella", "Freshman", 3.7, 5);

        student[] list = {s1, s2, s3, s4, s5};

        System.out.println("Honor Roll Check:");
        for (student s : list) {
            if (s.isHonorRoll()) {
                System.out.println(s.name + " is on the honor roll.");
            } else {
                System.out.println(s.name + " is not on the honor roll.");
            }
        }

        System.out.println("\nFree Lunch Check:");
        Random r = new Random();
        int randomId = r.nextInt(5) + 1; // random number 1–5
        System.out.println("Today's free lunch ID is: " + randomId);

        boolean found = false;
        for (student s : list) {
            if (s.freeLunch(randomId)) {
                System.out.println(s.name + " gets free lunch today!");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No one gets free lunch today.");
        }

        //nWhat I learned:"); 
        //I learned how to make a class, use objects, and make methods that return true or false.");
    }
}
