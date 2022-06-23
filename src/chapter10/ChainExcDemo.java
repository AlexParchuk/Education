package chapter10;

public class ChainExcDemo {

    static void demoproc(){
        NullPointerException e = new NullPointerException("Higher level!");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }
        catch (NullPointerException e) {
            System.out.println("Exception catch in psvm." + e);
            System.out.println("Root cause is " + e.getCause());
        }
    }
}
