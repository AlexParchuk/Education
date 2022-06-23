package chapter09.Packages.p2;

import chapter09.Packages.p1.Protection;

public class OtherPackage {

    OtherPackage(){

        Protection p = new Protection();

        System.out.println("Construktor from another package");

        // доступно только для данного класса или пакета
        //System.out.println("n = " + p.n);

        // доступно только для данного класса,
        //подкласса или пакета
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);

        //доступно только для данного класса
        //System.out.println("n_pri = " + p.n_pri);

    }

}
