package com.AlexParchuk.javacore.chapter09.Packages.p1;

public class Derived extends Protection {

    Derived(){

        System.out.println("Constructor subclass Derived.");

        System.out.println("n = " + n);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);

        //доступно только для класса
        //System.out.println("n_pri = " + n_pri);

    }

}
