package chapter11;

class NewThreadDemo implements Runnable {

    Thread t;

    NewThreadDemo(){
        t = new Thread(this, "Second thread");
        System.out.println("Second thread " + t);
        t.start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Second thread " + i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e) {
            System.out.println("Second thread interrupted!");
        }
        System.out.println("Second thread is finish!");
    }
}

class ThreadDemo{

    public static void main(String[] args) {

        new NewThreadDemo();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }
        System.out.println("Main thread is finish!");
    }
}

class NewThread extends Thread {

    NewThread(){
        super("Second thread");
        System.out.println("Second thread " + this);
        start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Second thread " + i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e) {
            System.out.println("Second thread interrupted!");
        }
        System.out.println("Second thread is finish!");
    }
}

class ThreadDemo2{

    public static void main(String[] args) {

        new NewThreadDemo();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }
        System.out.println("Main thread is finish!");
    }
}

class NewThread2 implements Runnable {

    String name;
    Thread t;

    NewThread2(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        t.start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name +  " : " + i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " interrupted!");
        }
        System.out.println(name + " finish!");
    }
}

class MultiThreadDemo{

    public static void main(String[] args) {

        new NewThread2("First thread");
        new NewThread2("Second thread");
        new NewThread2("Third thread");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }
        System.out.println("Main thread is finish!");
    }
}

class NewThread3 implements Runnable {

    String name;
    Thread t;

    NewThread3(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        t.start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name +  " : " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " interrupted!");
        }
        System.out.println(name + " finish!");
    }
}

class DemoJoin{

    public static void main(String[] args) {

        NewThread3 nb1 = new NewThread3("First thread");
        NewThread3 nb2 = new NewThread3("Second thread");
        NewThread3 nb3 = new NewThread3("Third thread");

        System.out.println("First thread is alive: " + nb1.t.isAlive());
        System.out.println("Second thread is alive: " + nb2.t.isAlive());
        System.out.println("Third thread is alive: " + nb3.t.isAlive());

        try {
            System.out.println("Waiting for threads to complete.");
            nb1.t.join();
            nb2.t.join();
            nb3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("First thread is alive: " + nb1.t.isAlive());
        System.out.println("Second thread is alive: " + nb2.t.isAlive());
        System.out.println("Third thread is alive: " + nb3.t.isAlive());

        System.out.println("Main thread is finish!");
    }
}