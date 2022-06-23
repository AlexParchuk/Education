package main.java.com.AlexParchuk.javacore;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

class StoneScissorsPaper {

    static void ShowRules(){
        System.out.println("Rules---------------------------------");
        System.out.println("Stone      - 1");
        System.out.println("Scissors   - 2");
        System.out.println("Paper      - 3");
        System.out.println("Stone(1) - Scissors(2) = Stone(1) win");
        System.out.println("Stone(1) - Paper(3)    = Paper(3) win");
        System.out.println("Scissors(2) - Paper(3) = Scissors(2) win");
    }

    static boolean ShowMainMenu(){

        while (true) {

            System.out.println("Main menu ---------------------------------");
            System.out.println("Show rules - 0");
            System.out.println("Play       - 1");
            System.out.println("Exite      - 9");

            System.out.println("Please select a menu item:");

            try {

                Scanner scanner = new Scanner(System.in);
                int answear = scanner.nextInt();

                if (answear == 0) ShowRules();
                else if (answear == 1) return true;
                else if (answear == 9) return false;
                else System.out.println("...incorrect answer! repeat please...");

            } catch (InputMismatchException e) {
             System.out.println("...incorrect answer! repeat please...");
            }
        }
    }

    static int getrandomvalueRSS(){
        Random r = new Random();
        return r.nextInt(1, 4);
    }

    static int calculatewinner(int val1, int val2){

        if (val1 == val2)
            return 0;
        else if ((val1 == 1&val2 == 2)|(val1 == 2&val2 == 3)|(val1 == 3&val2 == 1))
            return 1;
        else
            return 2;
    }

    public static void main(String[] args) {

        int humanvalue, aivalue, result;
        int humanwin = 0, aiwin = 0, gamesplayed = 0;

        System.out.println("Hello my friend!");

        boolean playon = ShowMainMenu();

        while (playon) {

            System.out.println("Please, enter your choice (1-Stone/2-Scissors/3-Paper/9-Exite):");

            try {

                Scanner scanner = new Scanner(System.in);
                humanvalue = scanner.nextInt();

                if (humanvalue == 9) playon = false;

                else if (humanvalue == 1 | humanvalue == 2 | humanvalue == 3) {

                    aivalue = getrandomvalueRSS();
                    System.out.println("ai value " + aivalue);

                    result = calculatewinner(aivalue, humanvalue);

                    if (result == 0)
                        System.out.println("Drow!");
                    else if (result == 1) {
                        System.out.println("ai win.");
                        aiwin = aiwin + 1;
                    }
                    else {
                        System.out.println("Human win.");
                        humanwin = humanwin + 1;
                    }

                    gamesplayed = gamesplayed + 1;

                }
                else System.out.println("...incorrect answer! repeat please...");

            } catch (InputMismatchException e) {
                System.out.println("...incorrect answer! repeat please...");
            }
        }

        if (gamesplayed > 0) {

            System.out.println("Total games played: " + gamesplayed);
            System.out.println("Total score: ai won = " + aiwin + ", human won " + humanwin);

            if (aiwin > humanwin) System.out.println("Sorry, AI win)");
            else if (aiwin < humanwin) System.out.println("Congratulation, human win!");
            else System.out.println("The game ended in a draw!)");

        }

        System.out.println("Goodbye, my friend)");
    }
}
