package main.java.com.AlexParchuk.javacore.chapter09.Packages.p1;

public class Protection {

    int n;
    private int n_pri;
    protected int n_pro;
    public int n_pub;

    public Protection(){

        System.out.println("Construktor base class");
        System.out.println("n = " + n);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
        System.out.println("n_pri = " + n_pri);

    }

}
