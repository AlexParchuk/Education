package main.java.com.AlexParchuk.javacore.chapter09.Packages.p1;

public class SamePackage {

    SamePackage(){

        Protection p = new Protection();

        System.out.println("Construktor from same package");
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);

        //доступно только для класса
        //System.out.println("n_pri = " + p.n_pri);

    }

}
