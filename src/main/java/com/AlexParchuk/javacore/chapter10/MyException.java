package com.AlexParchuk.javacore.chapter10;

class MyException extends Exception {
    private int detail;

    MyException(int a){
        detail = a;
    }

    public String toString() {
        return "MyException [" + detail + "]";
    }
}

class ExceptionDemo{

    static void compute(int a) throws MyException{
        System.out.println("Method compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
            System.out.println("method call compute(" + a + ") is normal!");
    }

    public static void main(String[] args) {
        try {
            compute(5);
            compute(15);
        }catch (MyException e) {
            System.out.println("Exception intercepted:" + e);
        }
    }
}