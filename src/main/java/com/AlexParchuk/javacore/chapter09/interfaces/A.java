package com.AlexParchuk.javacore.chapter09.interfaces;

class A {

    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIf {

    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIfDemo {

    public static void main(String[] args) {
        A.NestedIf nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Number 10 is NOT negative");
        else
            System.out.println("Number 10 is negative");
    }

}