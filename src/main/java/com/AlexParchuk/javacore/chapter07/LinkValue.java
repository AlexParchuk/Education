package main.java.com.AlexParchuk.javacore.chapter07;

class LinkValue {

    int a, b;

    LinkValue(){
    }

    LinkValue(int VarA, int VarB){
        a = VarA;
        b = VarB;
    }

    void ChangeValue(int varA, int varB) {
        varA *= 2;
        varB /= 2;
    }

    void ChangeValue(LinkValue lvObject){
        lvObject.a *= 2;
        lvObject.b /= 2;
    }

    LinkValue incrA10(LinkValue obj){

        LinkValue objCopy = new LinkValue();

        objCopy.a = obj.a + 10;
        objCopy.b = obj.b + 5;

        return objCopy;
    }

}

class LinkValueTest {

    public static void main(String[] args) {

        int a = 10, b = 16;

        System.out.println("-------Link/Value---------------------");

        System.out.println("Before: a = " + a + ", b = " + b);

        LinkValue object1 = new LinkValue();
        object1.ChangeValue(a, b);

        System.out.println("After: a = " + a + ", b = " + b);

        object1.a = a;
        object1.b = b;

        System.out.println("Before: a = " + object1.a + ", b = " + object1.b);
        object1.ChangeValue(object1);
        System.out.println("After: a = " + object1.a + ", b = " + object1.b);

        System.out.println("-------return object---------------------");

        LinkValue object2 = new LinkValue();
        LinkValue object3 = new LinkValue();

        object2 = object1.incrA10(object1);
        object3 = object1.incrA10(object2);

        System.out.println("object1: a = " + object1.a + ", b = " + object1.b);
        System.out.println("object2: a = " + object2.a + ", b = " + object2.b);
        System.out.println("object3: a = " + object3.a + ", b = " + object3.b);

    }

}