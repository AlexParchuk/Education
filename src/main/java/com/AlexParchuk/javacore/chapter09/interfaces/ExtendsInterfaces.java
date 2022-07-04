package com.AlexParchuk.javacore.chapter09.interfaces;

public class ExtendsInterfaces {
}

interface AI{

    void meth1();
    void meth2();

}

interface BI extends AI{

    void meth3();

}

class MyClass implements BI{

    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }

    public void meth3() {
        System.out.println("Meth3");
    }
}

class Test{

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.meth1();
        mc.meth2();
        mc.meth3();
    }

}