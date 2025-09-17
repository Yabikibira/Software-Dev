import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);// to scan user given input
        System.out.println("Whats was fengs song about his brother abroad?(reply in lower case please :3)");//prints out the question that will start this whole proceess <3
        String Q1 = sc.nextLine();//starts on the next line waiting for the users input
        int points=0; //sets the intial points to u so that we can add 1 for everytime its answered correctly
        if (Q1.equals("left for usa")){// okay so here u might go ..hm yabi i didnt teach this though and Ikkkk </33 to be able to compare two strings or user inputed strings i had to use external knowlegde (wait i lowkey dont know how to spell that) to do it ,im sorry <3 i swear i studied it
            System.out.println("Correct,1 down ,2 more to go!!"); //prints out the statment in the bracket if the user answered right else it goes to the next function
            points= points + 1;//adds one to the points system evertime the user answers correctly 
        } else{
            System.out.println("wrong :c");
        }
        System.out.println("what was fengs first released song ");
        String Q2 = sc.nextLine();//same thing i alr explained up<3
        if (Q2.equals("swag")){
            System.out.println("Yuhhh you might be an actual fan :o,one more!!");
            points= points + 1;
        }else {
            System.out.println("Wrong but dont worry not everyone memorises Fengs first song ");
        }
        System.out.println("what genre of music is Fengs music considered ");
        String Q3 = sc.nextLine();
        if (Q3.equals("cloud rap") || Q3.equals("electronic music") || Q3.equals("underground rap")) {//here i just what i learned about equaling to find out of it the same string and used or for three possible answers the user could give
            System.out.println("FENG WORLD DOMINATION ");
            points= points+ 1;}
        else{
            System.out.println("You lowkey should have known that if you were a true fan </3");


        }
        System.out.println("You scored : " + points + " out of 3!");
    }
}
// what i learned <3
//i learned how to use or and how to keep count/tally of points
//i also did a bit of research and figured out how to compare user inputed sstring or var and compare ot to what the computer has stored<3
