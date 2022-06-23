package chapter10;

import java.util.Random;

public class Exc2 {

    public static void main(String[] args) {

        int d = 0;

        try {
            int a = 40 / d;
            System.out.println("Its ok!");
        }
        catch (ArithmeticException e){
            System.out.println("Division zero!");
        }
        System.out.println("After catch!");

    }
}

class HandleError{

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;

        Random r = new Random();

        for (int i = 0; i < 10000; i++) {
            try {
            c = r.nextInt();
            b = r.nextInt();
            a = 15/ (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Division zero. Exception - " + e);
                a = 0;
            }
            System.out.println("a = " + a);
        }

    }

}

class MultipleCatches{

    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 40/a;
            int c[] = {1};
            c[40] = 10;
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error index of array!");
        }
        System.out.println("After catch!");
    }

}

class MethNestTry{

    static void nesttry(int a){

        try {
            if (a == 1) a = a / (a - a);
            if (a == 2) {
                int c[] = {1};
                c[40] = 33;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error index!" + e);
        }
    }

    public static void main(String[] args) {

        try {
            //int a = args.length;
            int a = 2;
            int b = 40/a;
            System.out.println("a = " + a);
            nesttry(a);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero! " + e);
        }

    }

}