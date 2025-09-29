import java.util.Scanner;
class Debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//reads what the user inputs in and assigns it to sc ;p
        System.out.println("Enter your yearly salary");//prints out the string in the "" and waita for the users answer on the next line
        int salary = sc.nextInt();//reads the integer user inputs and assigns it to salary 
        System.out.println("Enter your yearly expenses");//same thing js prints out string out in the ""
        int expenses = sc.nextInt();
        System.out.println("Enter the amount of people in your household");
        int people = sc.nextInt();

        int additionalTaxReduction = 0;//holds numbers and for now is set to 0 :3
        for(int i = 0; i <= people; i++){//starts at 0 ends when people is greater than i and increments each time  
            additionalTaxReduction += 2;//increase the variable by 2
        }

        int taxReduction = 0;
        taxReduction += additionalTaxReduction;// add additionalTaxReduction to taxReduction
        if(salary > 50000 && people > 3){//loop that looks at two conditions if salary is greater than 50000 AND  people being greater than 3 
            taxReduction += 10;//increases taxred by 10
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");//prints out the string in "" and the sum int in tax reduction
        } else if(salary > 30000 && people > 4){//loop that looks at two conditions if salary is greater than 30000 AND  people being greater than 4
            taxReduction += 9;// ive explained a code that looks like this alr :3
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");//same thing as line 22
        } else if(salary > 70000 && people > 2){
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else {
            System.out.println("No applicable reduction on taxes found.");// in the ends if all the loops do not fulfil the requirments it will print the string as a last case
        }

    }
}
