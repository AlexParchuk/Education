package com.AlexParchuk.javacore;

class TestClass {

    public static void main(String[] args) {

        StoneScissorsPaper ssr1 = new StoneScissorsPaper();
        StoneScissorsPaper ssr2 = new StoneScissorsPaper();
        StoneScissorsPaper ssr3 = new StoneScissorsPaper();

        System.out.println("ssr1 == ssr2 - " + (ssr1 == ssr2));
        System.out.println("ssr2 == ssr3 - " + (ssr2 == ssr3));

        System.out.println("ssr1.hashCode() = " + ssr1.hashCode());
        System.out.println("ssr2.hashCode() = " + ssr2.hashCode());
        System.out.println("ssr3.hashCode() = " + ssr3.hashCode());

        System.out.println("ssr1.equals(ssr2) = " + ssr1.equals(ssr2));
        System.out.println("ssr2.equals(ssr3) = " + ssr2.equals(ssr3));

        Class2 cl1 = new Class2(1,2);
        Class2 cl2 = new Class2(1,2);
        Class2 cl3 = new Class2(3,4);

        System.out.println("cl1.hashCode() = " + cl1.hashCode());
        System.out.println("cl2.hashCode() = " + cl2.hashCode());
        System.out.println("cl3.hashCode() = " + cl3.hashCode());

        cl2.b = 3;
        System.out.println("cl2.hashCode() = " + cl2.hashCode());
        System.out.println("cl2.hashCode() = " + cl2);

    }
}

class Class2{
    int a;
    int b;

    public Class2(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Class3{

    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println("a == b :" + (a == b));
        System.out.println("a.equals(b) :" + a.equals(b));

        System.out.println("a == c :" + (a == c));
        System.out.println("a.equals(c) :" + a.equals(c));

    }

}