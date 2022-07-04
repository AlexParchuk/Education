package com.AlexParchuk.javacore.chapter11;
// не синхронизировано!!!
class Callme {

    //synchronized
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Break!");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}

class Synch{

    public static void main(String[] args) {

        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Wellcome");
        Caller ob2 = new Caller(target, "to synch");
        Caller ob3 = new Caller(target, "world.");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e) {
            System.out.println("Break.");
        }

    }
}