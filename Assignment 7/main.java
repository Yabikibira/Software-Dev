public class Main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        Enemy genericEnemy = new Enemy( 85,100);
        genericEnemy.attack();


        //create a fire and an ice wizard and call all functions
        Wizard fireWizard = new Wizard (100,200,"fire");
        Wizard iceWizard = new Wizard(100,250,"ice");

        fireWizrd.damageType();
        iceWizard.damageType();

        //create a goblin and call its functions
        Goblin goblin1 = new Goblin(65,60);
        goblin1.attack();

    }
}
//class

public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
       if (this.type.equals("fire")){
           System.out.println("this wizard shoots a fireball");
       }else {
            System.out.println("this wizard shoots an iceball");
       }



    }
}

//class number 2
public class Enemy {
    int health;
    int damage;

    public Enemy(int h, int d){
        health = h;
        damage = d;
    }

    void attack(){
        System.out.println("the enemy attacks");
    }
}

//class 3
public class Goblin extends Enemy{
    //Needs constructor
    public Goblin (int h,int d){
        super(h,d);

    }


    //needs method to overwrite attack in enemy to say "the goblin gobbles" instead of "the enemy attacks
    void attack(){
        System.out.println("The goblin gobless");
    }
}

