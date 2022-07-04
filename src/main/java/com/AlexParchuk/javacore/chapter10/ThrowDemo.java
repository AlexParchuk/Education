package com.AlexParchuk.javacore.chapter10;

class ThrowDemo {

    static void demoproc(){

        try {
            throw new NullPointerException("Demonstration!");
        }
        catch (NullPointerException e){
            System.out.println("Exception catch in body demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }
        catch (NullPointerException e) {
            System.out.println("Exception catch in psvm." + e);
        }
    }
}

class ThrowsDemo{

    static void throwOne() throws IllegalAccessException{
        System.out.println("Exception in body throwOne().");
        throw new IllegalAccessException("Demonstration!");
    }

    public static void main(String[] args) {

        try {
            throwOne();
        }
        catch (IllegalAccessException e) {
            System.out.println("Exception in psvm: " + e);
        }
    }

}
