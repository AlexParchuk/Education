package com.AlexParchuk.javacore.chapter07;

/**
 * ПЕРЕГРУЗКА МЕТОДОВ
 * В языке Java разрешается определять в одном и том же классе два или больше
 * методов под одним именем, если только объявления их параметров отличаются
 *
 * Автоматическое преобразование типов в Java выполняется
 * только в том случае, если не обнаружено полное соответствие.
 *
 * ПЕРЕГРУЗКА КОНСТРУКТОРОВ
 * аналогично методам
 *
 */
class OverloadDemo {

    void test(){
        System.out.println("Parameters is empty!");
    }

    void test(int a) {
        System.out.println("Parameters a = " + a);
    }

    void test(int a, int b) {
        System.out.println("Parameters (integer) a = " + a + ", b = " + b);
    }

    double test(double a) {
        System.out.println("Parameters a = " + a);
        return a * a;
    }

    void test(double a, double b) {
        System.out.println("Parameters (double) a = " + a + ", b = " + b);
    }

}

class Overload {

    public static void main(String[] args) {

        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(12);
        ob.test(12, 15);
        result = ob.test(8.12);
        System.out.println("ob.test(8.12) = " + result);
        ob.test(12.1, 15.5);
    }

}

class ObjectTest {

    int a, b;

    ObjectTest(int varA, int varB){
        a = varA;
        b = varB;
    }

    boolean equalTo(ObjectTest ob){
        if (ob.a == a && ob.b == b)
            return true;
        else
            return false;
    }
}

class TransferObjectInParameter{

    public static void main(String[] args) {

        ObjectTest object1 = new ObjectTest(11,12);
        ObjectTest object2 = new ObjectTest(7,9);
        ObjectTest object3 = new ObjectTest(3,2);

        System.out.println("object1 = object1 = " + object1.equalTo(object1));
        System.out.println("object1 = object2 = " + object1.equalTo(object2));
        System.out.println("object1 = object3 = " + object1.equalTo(object3));

    }

}