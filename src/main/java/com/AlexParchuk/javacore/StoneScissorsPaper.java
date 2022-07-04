package com.AlexParchuk.javacore;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public final class StoneScissorsPaper {

    private static void showRules(){
        System.out.println("Rules---------------------------------");
        System.out.println("Stone      - 1");
        System.out.println("Scissors   - 2");
        System.out.println("Paper      - 3");
        System.out.println("Stone(1) - Scissors(2) = Stone(1) win");
        System.out.println("Stone(1) - Paper(3)    = Paper(3) win");
        System.out.println("Scissors(2) - Paper(3) = Scissors(2) win");
    }

    private static boolean showMainMenu(){

        while (true) {

            System.out.println("Main menu ---------------------------------");
            System.out.println("Show rules - 0");
            System.out.println("Play       - 1");
            System.out.println("Exit       - 9");

            System.out.println("Please select a menu item:");

            try {

                Scanner scanner = new Scanner(System.in);
                int answear = scanner.nextInt();

                if (answear == 0) showRules();
                else if (answear == 1) return true;
                else if (answear == 9) return false;
                else System.out.println("...incorrect answer! repeat please...");

            } catch (InputMismatchException e) {
             System.out.println("...incorrect answer! repeat please...");
            }
        }
    }

    private static int getRandomValueRSS(){
        Random r = new Random();
        return r.nextInt(1, 4);
    }

    private static int calculateWinner(int val1, int val2){

        if (val1 == val2)
            return 0;
        else if ((val1 == 1&val2 == 2)|(val1 == 2&val2 == 3)|(val1 == 3&val2 == 1))
            return 1;
        else
            return 2;
    }

    public static void main(String[] args) {

        int humanValue, aiValue, result;
        int humanWin = 0, aiWin = 0, gamesPlayed = 0;

        System.out.println("Hello my friend!");

        boolean playOn = showMainMenu();

        while (playOn) {

            System.out.println("Please, enter your choice (1-Stone/2-Scissors/3-Paper/9-Exit):");

            try {

                Scanner scanner = new Scanner(System.in);
                humanValue = scanner.nextInt();

                if (humanValue == 9) playOn = false;

                else if (humanValue == 1 | humanValue == 2 | humanValue == 3) {

                    aiValue = getRandomValueRSS();
                    System.out.print("ai value " + aiValue + ". ");

                    result = calculateWinner(aiValue, humanValue);

                    if (result == 0)
                        System.out.println("Drow!");
                    else if (result == 1) {
                        System.out.println("ai win.");
                        aiWin++;
                    }
                    else {
                        System.out.println("Human win.");
                        humanWin++;
                    }

                    gamesPlayed++;

                }
                else System.out.println("...incorrect answer! repeat please...");

            } catch (InputMismatchException e) {
                System.out.println("...incorrect answer! repeat please...");
            }
        }

        if (gamesPlayed > 0) {

            System.out.println("Total games played: " + gamesPlayed);
            System.out.println("Total score: ai win = " + aiWin + ", human win " + humanWin);

            if (aiWin > humanWin) System.out.println("Sorry, AI win)");
            else if (aiWin < humanWin) System.out.println("Congratulation, human win!");
            else System.out.println("The game ended in a draw!)");

        }

        System.out.println("Goodbye, my friend)");
    }
}
