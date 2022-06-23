package main.java.com.AlexParchuk.javacore.chapter09.interfaces;

public class Client implements Callback {

    public void callback(int param) {
        System.out.println("Method callback with param = " + param);
    }

    void nonIfaceMeth(){
        System.out.println("Non interface method!");
    }
}

class TestIFace{

    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }

}