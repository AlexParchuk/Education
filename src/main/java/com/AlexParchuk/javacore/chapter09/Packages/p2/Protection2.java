package main.java.com.AlexParchuk.javacore.chapter09.Packages.p2;

class Protection2 extends main.java.com.AlexParchuk.javacore.chapter09.Packages.p1.Protection {

    Protection2() {
        System.out.println("Constructor inherited from another package.");

        //доступно только для данного класса или пакета
        //System.out.println("n = " + n);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);

        //доступно только для класса
        //System.out.println("n_pri = " + n_pri);
    }

}
