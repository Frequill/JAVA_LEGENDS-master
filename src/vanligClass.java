import java.util.Random;
import java.util.Scanner;

public class vanligClass {

    public static Scanner in = new Scanner(System.in);
    public static Student[] fighters;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void printSelect(boolean player){
        if (player){
            System.out.println("Pick your fighter!: \n(0-5)\n");
        }
        else{
            System.out.println("Pick your enemy!: \n(0-5)\n");
        }
    }

    public static int fighterMenu(){
        for (int i = 0; i < fighters.length; i++){
            System.out.println(fighters[i].getName());
        }
        int fighterChoice = in.nextInt();
        return fighterChoice;
    }

    public static void mainMenu(){
        System.out.println("   All players must play  ");
        System.out.println("  apropriate combat music:");
        System.out.println("https://www.youtube.com/watch?v=K4RFsrfcQWA&t\n");
        System.out.println("**************************");
        System.out.println("\n       Welcome to       ");
        System.out.println("      JAVA LEGENDS        ");
        System.out.println("\n************************");
        System.out.println("\nA perfectly balanced turn-based");
        System.out.println("combat game by Julius Thomsen");
        System.out.println("\n1) FIGHT! ");
        System.out.println("2) Options  ");
        System.out.println("3) Quit game");


        int x = in.nextInt();
            try {
                switch (x) {
                    case 1:
                        fighters = studentList();
                        printSelect(true);
                        int fighter1 = fighterMenu();
                        printSelect(false);
                        int fighter2 = fighterMenu();
                        fight(studentList()[fighter1], studentList()[fighter2]);
                        break;
                    case 2:
                        System.out.println("There are no options, idiot!");
                        break;
                    case 3:
                        break;
                }
            }
            catch (Exception e) {
                System.out.println("You pick wrong, bitch");
            }
        }



    public static Student[] studentList(){
         Student[] studentList = new Student[6];
         studentList [0] = new Student("Julius", 22, 25, 60);
         studentList [1] = new Student("Martin", 32, 100, 10);
         studentList [2] = new Student("Killian", 23, 20, 75);
         studentList [3] = new Student("Nicklas", 24, 10, 20);
         studentList [4] = new Student("Johanna", 24, 40, 25);
         studentList [5] = new Student("Lisa", 28, 500, 500);
         return studentList;
    }

    public static void fight(Student ett, Student två){
        System.out.println("\n" + ett.getName() + " has " + ett.getStrength()+ " damage and " + ett.getHp() + " hit points!");
        System.out.println(två.getName() + " has " + två.getStrength()+ " damage and " + två.getHp() + " hit points!");
        System.out.println("\nThe gods of RNG will decide who makes the first strike");
        System.out.println("\n\nPress Enter key to begin epic struggle");
        in.nextLine();
        in.nextLine();

        int x = (int) Math.round(Math.random());
        Random rng = new Random();
        // rng.nextInt(6)+1;
        boolean playerInitiative = rng.nextBoolean();

        while (två.getHp() > 0 && ett.getHp() > 0) {

            if (playerInitiative) {
                System.out.println(ett.getName() + " attacks " + två.getName() + " for " + ett.getStrength() + " damage");
                två.setHp(två.getHp() - ett.getStrength());

                System.out.println(två.getName() + " has " + två.getHp() + " hp left!");
                System.out.println("\nPress Enter for next attack!");
                in.nextLine();
            }
            else  {
                System.out.println(två.getName() + " attacks " + ett.getName() + " for " + två.getStrength() + " damage");
                ett.setHp(ett.getHp() - två.getStrength());

                System.out.println(ett.getName() + " has " + ett.getHp() + " hp left!");
                System.out.println("\nPress Enter for next attack!");
                in.nextLine();
            }
            playerInitiative = !playerInitiative;

        }

        System.out.println("The fight is over...\nThe stronger champion has proven their might!\n\nPress Enter to exit game");
        in.nextLine();



        }

















    }




