package chapter11;

public class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Main thread " + t);
        System.out.println("t.getName() = " + t.getName());

        t.setName("New name");

        System.out.println("Main thread after setName() " + t);
        System.out.println("t.getName() = " + t.getName());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread is break!");
        }
    }
}

