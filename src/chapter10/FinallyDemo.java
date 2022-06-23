package chapter10;

public class FinallyDemo {

    static void procA(){

        try {
            System.out.println("Method procA().");
            throw new RuntimeException();
        } finally {
            System.out.println("finally in procA().");
        }
    }

    static void procB(){

        try {
            System.out.println("Method procB().");
            return;
        } finally {
            System.out.println("finally in procB().");
        }
    }

    static void procC(){

        try {
            System.out.println("Method procC().");
        } finally {
            System.out.println("finally in procC().");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e) {
            System.out.println("Catch exception in psvm.");
        }
        procB();
        procC();
    }

}
