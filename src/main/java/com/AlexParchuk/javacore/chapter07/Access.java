package main.java.com.AlexParchuk.javacore.chapter07;

/**
 * public / privatе
 * Когда член объявляется
 * с модификатором доступа public, он становится доступным из любого
 * другого кода. А когда член класса объявляется с модификатором доступа privatе,
 * он доступен только другим членам этого же класса.
 *
 * В отсутствие модификатора доступа по умолчанию
 * член класса считается открытым в своем пакете, но недоступным для кода,
 * находящегося за пределами этого пакета.
 *
 *
 * МОДИФИКАТОРЫ ЧЛЕНОВ КЛАССА
 * public - доступен из любого кода.
 * privаtе - недоступен для компонентов, находящихся за пределами его класса
 * отсутствует явно указанный модификатор доступа - этот член доступен для подклассов и других классов из данного пакета.
 * protected - компонент доступен за пределами его текущего пакета, но только классам,
 * непосредственно производным от данного класса
 *
 * Если класс объявлен
 * как pub1iс, он доступен из любого другого кода. Если у класса имеется уровень
 * доступа по умолчанию, такой класс оказывается доступным только для кода из данного пакета.
 *
 *
 * static
 * Когда член класса объявлен как static (статический), он доступен до создания любых
 * объектов его класса и без ссылки на какой-нибудь объект.
 * На методы, объявленные как static, налагаются следующие ограничения.
 * • Они могут непосредственно вызывать только другие статические методы.
 * • Им непосредственно доступны только статические переменные.
 * • Они никоим образом не могут делать ссылки типа this или super.
 *
 * final
 * позволяет предотвратить
 * изменение содержимого переменной, сделав ее, по существу, константой.
 * идентификаторы всех конечных полей принято
 * обозначать прописными буквами
 * final int FILE - NEW = 1;
 *
 * массивы
 * length - размер массива
 * length никак не связано с количеством действительно
 * используемых элементов массива. Оно отражает лишь то количество элементов,
 * которое может содержать массив.
 *
 */
class Access {
    public int b;
    int a;
    private int c;

    void setc(int varc) {
        c = varc;
    }

    int getc(Access AccessObject) {
        return AccessObject.c;
    }

}

class AccessTest {

    public static void main(String[] args) {

        Access AccessObject = new Access();

        AccessObject.a = 50;
        AccessObject.b = 50;
        AccessObject.setc(25);

        System.out.println("a = " + AccessObject.a);
        System.out.println("b = " + AccessObject.b);
        System.out.println("c = " + AccessObject.getc(AccessObject));

    }

}

class Stack {

    private int tos;
    private int stck[];

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int i) {
        if (tos == stck.length - 1) System.out.println("Stack is full!");
        else
            stck[++tos] = i;
    }

    int pop(){

        if (tos <0) {
            System.out.println("Stack empty!");
            return 0;
        }
        else
            return stck[tos--];
    }

}

class StackTest{

    public static void main(String[] args) {

        Stack mystack1 = new Stack(6);
        Stack mystack2 = new Stack(8);

        for (int i = 0; i < 6; i++) mystack1.push(i * 2);
        for (int i = 0; i < 8; i++) mystack2.push(i + 1);

        for (int i = 5; i >= 0; i--) System.out.println("mystack1[" + i + "] = " + mystack1.pop());
        for (int i = 7; i >= 0; i--) System.out.println("mystack2[" + i + "] = " + mystack2.pop());
    }
}

class UseStatic{

    static int a = 4;
    static int b;

    static void meth(int x){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
    }

    static {
        b = a * 2;
    }

    public static void main(String[] args) {
        meth(5);
    }
}

class UseStatic2{

    public static void main(String[] args) {
        UseStatic.meth(4);
        System.out.println("UseStatic.b = " + UseStatic.b);
    }

}

class Lenght{

    public static void main(String[] args) {

        int Array1[] = new int[10];
        int Array2[] = {1,2,3,4,5,6,7};
        int Array3[] = {2,4,6};

        System.out.println("Array1 lenght = " + Array1.length);
        System.out.println("Array2 lenght = " + Array2.length);
        System.out.println("Array3 lenght = " + Array3.length);

    }

}




