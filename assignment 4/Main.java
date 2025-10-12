public class Main {
    public static void main(String[] args) {
      //Don't let the size of this scare you! no matter how big an array is, it all works the same! 
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :( 

        // making a helper list (same size) to keep track of which spots i already checked
        boolean[] alreadyChecked = new boolean[myArray.length];

        System.out.println("duplicate numbers and how many times they show up ");
        System.out.println("-------------------------------------------------------");

        // loop through every number in the array
        for (int i = 0; i < myArray.length; i++) {
            // only check if i haven’t already counted this number before
            if (alreadyChecked[i] == false) {

                int currentNum = myArray[i];  // the number i’m checking rn
                int count = 1; // starts at 1 because it already exists once here

                // now i look at the rest of the list to see if it repeats
                for (int j = i + 1; j < myArray.length; j++) {
                    // if i find another one that matches currentNum
                    if (myArray[j] == currentNum) {
                        count++; // add to the count
                        alreadyChecked[j] = true; // mark that i already used this one
                    }
                }

                // mark my main one as checked too
                alreadyChecked[i] = true;

                // only print it if it showed up more than once
                if (count > 1) {
                    System.out.println(currentNum + " shows up " + count + " times");
                }
            }
        }

        // reflection 
       
        //i learned how to find repeats in a list by hand using loops.
       //also realized arrays look scary but they’re actually not that bad once u go step by step :3
    }
}
