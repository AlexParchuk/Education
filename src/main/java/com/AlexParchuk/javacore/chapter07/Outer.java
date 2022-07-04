package com.AlexParchuk.javacore.chapter07;

class Outer {
    int Outer_x = 100;

    void Test(){

        for (int i = 0; i < 10; i++) {

            class Inner {
                int y = 10;
                void display() {
                    System.out.println("Outer_x = " + Outer_x);
                }
            }

            Inner inner = new Inner();
            inner.display();

        }

    }

}

class InnerTest{

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.Test();

    }

}