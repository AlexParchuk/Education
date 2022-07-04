package com.AlexParchuk.javacore.chapter05;

/**
 * операторы выбора
 * if, if - еlsе - if,
 * switch
 *
 * операторы цикла
 * while
 * do-while
 * for
 * for each.
 *
 * операторы перехода
 *break - выход из внутреннего цикла во внешний приводит к завершению обоих циклов.
 *
 * continue
 *
 * return
 */
public class chapter05_ControlOperators {

    public static void main(String[] args)

    throws java.io.IOException {

        // if - еlsе - if
        System.out.println("---------------------if - else - if----------------------------");
        {
            int month = 5;
            String season;

            if (month == 12 || month == 1 || month == 2) season = "winter";
            else if (month == 3 || month == 4 || month == 5) season = "spring";
            else if (month == 6 || month == 7 || month == 8) season = "summer";
            else season = "autumn";

            System.out.println("Month number " + month + " applies to " + season);
        }

        // switch
        System.out.println("---------------------switch----------------------------");
        {
            for (int x = 0; x <=12; x++)
            {
                switch (x){
                    case 1: System.out.println("month " + x + " is winter"); break;
                    case 2: System.out.println("month " + x + " is winter"); break;
                    case 3: System.out.println("month " + x + " is spring"); break;
                    case 4: System.out.println("month " + x + " is spring"); break;
                    case 5: System.out.println("month " + x + " is spring"); break;
                    case 6: System.out.println("month " + x + " is summer"); break;
                    case 7: System.out.println("month " + x + " is summer"); break;
                    case 8: System.out.println("month " + x + " is summer"); break;
                    case 9: System.out.println("month " + x + " is autumn"); break;
                    case 10: System.out.println("month " + x + " is autumn"); break;
                    case 11: System.out.println("month " + x + " is autumn"); break;
                    case 12: System.out.println("month " + x + " is winter"); break;
                    default: System.out.println("month " + x + " is undefined");
                }
            }
        }
        {
            int month = 5;
            String season;

            switch (month){
                case 12:
                case 1:
                case 2:
                    season = "winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "autumn";
                    break;
                default:
                    season = "undefined";
            }

            System.out.println("Month number " + month + " is " + season);

        }

        // while
        System.out.println("---------------------while----------------------------");
        {
            int x = 0;
            while (x <= 12){
                System.out.println("x = " + x);
                x++;
            }
        }
        {
            int i = 300, j = 200;
            while (--i > ++j);
            System.out.println("medium = " + i);
        }

        System.out.println("---------------------while-do---------------------------");
        {
            int i = 10;
            do {
                System.out.println("i = " + i);
                i--;
            } while (i > 0);
        }
        {
            char choice;
            do {
                System.out.println("help:");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. while");
                System.out.println(" 4. do-while");
                System.out.println(" 5. for");
                System.out.println("Select an item:");

                choice = (char) System.in.read();
            }
            while (choice < '1' || choice > '5');

            System.out.println("\n");

            switch (choice){
                case '1':
                    System.out.println("if (condition = true) operator");
                    System.out.println("if (condition = true) operator1; else operator2");
                    System.out.println("if (condition1 = true) operator1; else if (condition2 = true) operator2 else operator3");
                    break;
                case '2':
                    System.out.println("switch (x) {");
                    System.out.println(" case const1: operator1");
                    System.out.println(" case const2: operator2");
                    System.out.println(" ... ");
                    System.out.println(" case constX: operatorX");
                    System.out.println(" default: operatorY }");
                    break;
                case '3':
                    System.out.println("while (condition = true) operator;");
                    break;
                case '4':
                    System.out.println("do {");
                    System.out.println(" operator }");
                    System.out.println("while (condition = true);");
                    break;
                case '5':
                    System.out.println("for (x=1; condition = true; ++/--)");
                    System.out.println(" operator;");
                    break;
            }

        }

        System.out.println("---------------------for/ for each---------------------------");
        // for
        {
            System.out.println("---------------------for 1---------------------------");
            //за пределами цикла for x прекращает свое существование.
            for (int x = 0; x < 15; x++)
                System.out.println("x = " + x);

            int num = 18;
            boolean isPrime;

            if (num < 2)
                isPrime = false;
            else
                isPrime = true;

            for (int i = 2; i <= num/i; i++) {
                if ((num % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime )
                System.out.println("simple numder");
            else
                System.out.println("not simple number");

            for (int i = 0, b = 5; i < b; i++, b--) {
                System.out.println("i = " + i);
                System.out.println("b = " + b);
            }

            int i = 0;
            boolean done = false;
            for (;!done;){
                System.out.println("i = " + i);
                if (i == 12) done = true;
                i++;
            }

        }
        // for each
        {
            System.out.println("---------------------for each 1---------------------------");
            int mas[] = {1,2,3,4,5,6,7,8};
            int sum = 0;
            for (int x : mas) sum = sum + x;
            System.out.println("sum = " + sum);

            sum = 0;
            for (int x : mas) {
                sum = sum + x;
                if (x == 5) break;
            }
            System.out.println("sum first 5 element = " + sum);
        }
        {
            System.out.println("---------------------for each 2---------------------------");
            int nums[][] = new int[5][6];
            int sum = 0;

            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 6; j++)
                    nums[i][j] = (i + 1) * (j + 1);

            for (int x[] :nums)
                for (int y :x){
                    System.out.println("value " + y);
                    sum += y;
                }
            System.out.println("sum of all elements of array = " + sum);
        }
        {
            System.out.println("---------------------for each 3---------------------------");

            int mas[] = {1,2,3,4,5,6,7,8};
            int val = 3;
            boolean found = false;

            for (int x : mas) {
                if (x == val) {
                    found = true;
                    break;
                }
            }
            if (found) System.out.println("Value " + val + " is found");
            else System.out.println("Value " + val + " is not found");
        }
        {
            System.out.println("---------------------for each 4---------------------------");

            for (int i = 0; i < 10; i++) {
                for (int j = i; j < 10; j++)
                    System.out.print(".");
                System.out.println(".");
            }

        }

        {
            System.out.println("---------------------break(go to)/continue/return ---------------------------");

            char choice2 = 'b';
            choice2 = (char) System.in.read();
            boolean repeatmethod = true;

            do {
                if (repeatmethod)
                    {
                        for (int i = 1; i < 10; i++) {
                            for (int j = 1; j < 10; j++) {
                                if (j > i) continue;
                                System.out.print(i * j + " ");
                            }
                            System.out.println();
                        }
                    }

                System.out.println("Repeat this method? (y/n):");
                choice2 = (char) System.in.read();

                if (choice2 == 'n')
                    break;
                else if (choice2 != 'y') {
                    System.out.println("Wrong choice!");
                    repeatmethod = false;
                    continue;
                }
                else repeatmethod = true;
            } while (true);

        }

    }

}
