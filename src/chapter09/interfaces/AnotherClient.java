package chapter09.interfaces;

class AnotherClient implements Callback {

    public void callback(int param) {
        System.out.println("AnotherClient method callback() with param " + param);
        System.out.println("param * param = " + param * param);
    }
}

class TestIfFace2{

    public static void main(String[] args) {

        Callback c = new Client();
        AnotherClient ac = new AnotherClient();

        c.callback(12);
        c = ac;
        c.callback(12);

    }

}