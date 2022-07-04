package com.AlexParchuk.javacore.chapter09.interfaces;

public interface IntStack {
    void push(int item);
    int pop();

    default void clear(){
        System.out.println("Method clear() is default!");
    }

}
