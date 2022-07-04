package com.AlexParchuk.javacore.chapter08;

/**
 * extends
 * Чтобы наследовать класс, достаточно ввести определение одного класса в другой,
 * используя ключевое слово extends
 *
 * class имя_подкласса extends имя_суперкласса
 *
 * Несмотря на то что подкласс включает в себя все члены своего суперкласса,
 * он не может иметь доступ к тем членам суперкласса, которые объявлены как
 * privаtе.
 *
 * Ссылочной переменной из суперкласса может быть присвоена ссылка на любой
 * подкласс, производный от этого суперкласса. доступные члены класса определяются типом ссылочной
 * переменной, а не типом объекта, на который она ссылается.
 *
 * super
 * имеет две общие формы. Первая форма служит
 * для вызова конструктора суперкласса, а вторая - для обращения к члену суперкласса,
 * скрываемому членом подкласса.
 * вызов метода super () должен быть непременно сделан в первом операторе
 *
 * suреr.член - член может быть методом или переменной экземпляра.
 * Вторая форма применения ключевого слова s uper наиболее пригодна в тех случаях, когда имена
 * членов подкласса скрывают члены суперкласса с такими же именами.
 * ключевое слово super можно использовать также для вызова методов, которые скрываются
 * в подклассе.
 * Если в иерархии классов требуется передать
 * параметры конструктору суперкласса, то все подклассы должны передавать
 * эти параметры вверх по иерархии.
 *
 * abstract
 * Чтобы некоторые методы переопределялись в подклассе, достаточно объявить их с модификатором доступа
 * abstract.
 * abstract тип имя(список_параметров);
 * Любой класс, содержащий один или несколько абстрактных методов, должен
 * быть также объявлен как абстрактный. Для этого достаточно указать ключевое
 * слово abstract перед ключевым словом class
 *
 * final
 *  Чтобы запретить переопределение метода, в начале его объявления следует указать ключевое слово final.
 *  предотвратить наследование класса - в начале объявления класса следует указать ключевое слово final.
 *
 * Object
 * класс Object служит суперклассом для всех остальных классов, и ссылочная переменная из класса Object
 * может ссылаться на объект любого другого класса.
 *
 *
 */
class Inheritance {
    int i, j, k;

    void show_ij(){
        System.out.println("i = " + i + ", j = " + j);
    }
}

class SubClass extends Inheritance{
    int k;

    SubClass(int Vi, int Vj, int Vk, int Vks){
        i = Vi;
        j = Vj;
        k = Vk;
        super.k = Vks;
    }

    SubClass(){

    }

    void show_k(){
        System.out.println("k = " + k);
    }

    void show_ijk(){
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
    }

    void show_ijkks(){
        System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", super.k = " + super.k);
    }
}

class InheritanceTest{

    public static void main(String[] args) {

        Inheritance ob_inh = new Inheritance();
        SubClass ob_sub = new SubClass();

        ob_inh.i = 7;
        ob_inh.j = 11;

        System.out.println("ob_inh = ");
        ob_inh.show_ij();

        ob_sub.i = 3;
        ob_sub.j = 5;
        ob_sub.k = 6;

        System.out.println("ob_sub = ");
        ob_sub.show_ijk();
        ob_sub.show_ij();
        ob_sub.show_k();

        SubClass ob_sub1 = new SubClass(2,3,4,15);
        ob_sub1.show_ijkks();
    }
}

class Box {

    private double width;
    private double height;
    private double depth;

    Box(double w, double h, double d){
        //System.out.println("Create new box ");
        width  = w;
        height = h;
        depth  = d;
    }

    Box(){
       // System.out.println("Create new empty box ");
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(Box ob){
        //System.out.println("Create based on another object ");
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double a){
        //System.out.println("Create new cube (double) ");
        width = height = depth = a;
    }

    Box(int a){
        //System.out.println("Create new cube (integer) ");
        width = height = depth = a;
    }

    void volume(){
        System.out.println("Volume box = " + width * height * depth);
    }

    double volume2(){
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight = m;
    }

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }

    BoxWeight(){
        super();
        weight = -1;
    }
}

class BoxColor extends Box{
    int color;

    BoxColor(double w,double h,double d,int c){
        super(w,h,d);
        color = c;
    }
}

class BoxDemo{

    public static void main(String[] args) {

        BoxWeight mybox1 = new BoxWeight(11,2,3, 2.12);
        BoxWeight mybox2 = new BoxWeight(2, 3.15);
        BoxWeight myboxClone = new BoxWeight(mybox2);
        BoxWeight mybox3 = new BoxWeight();
        Box mySuperbox = new Box(5,5,5);

        System.out.println("mybox1 volume = " + mybox1.volume2());
        System.out.println("mybox2 volume = " + mybox2.volume2());
        System.out.println("mySuperbox volume = " + mySuperbox.volume2());
        System.out.println("mybox3 volume = " + mybox3.volume2());
        System.out.println("myboxClone volume = " + myboxClone.volume2());

        mySuperbox = mybox2;
        System.out.println("mySuperbox volume = " + mySuperbox.volume2());

    }
}

class Shipment extends BoxWeight{
    double cost;

    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w,double h,double d,double weig, double c){
        super(w,h,d,weig);
        cost = c;
    }

    Shipment(){
        super();
        cost = 0;
    }

    Shipment(double len, double weig, double c){
        super(len, weig);
        cost = c;
    }
}

class DemoShipment{

    public static void main(String[] args) {
        Shipment shipment1 = new Shipment();
        Shipment shipment2 = new Shipment(11, 4.55, 55.99);
        Shipment shipment3 = new Shipment(shipment2);

        System.out.println("shipment1.volume = " + shipment1.volume2());
        System.out.println("shipment2.volume = " + shipment2.volume2());
        System.out.println("shipment3.volume = " + shipment3.volume2());

        System.out.println("shipment1.cost = " + shipment1.cost);
        System.out.println("shipment2.cost = " + shipment2.cost);
        System.out.println("shipment3.cost = " + shipment3.cost);
    }

}

class A{
    int i, j;
    A(){
        i  =-1;
        j = -1;

        System.out.println("const. A");
    }

    void show(){
        System.out.println("i = " + i + ", j = " + j);
    }

    void callme(){
        System.out.println("class A: callme");
    }

}

class B extends A{
    int k;
    B(){
        super();
        k = -1;
        System.out.println("const. B");
    }

    void show(String str){
        System.out.println(str + k);
        super.show();
    }

    void callme(){
        System.out.println("class B: callme");
    }

}

class C extends B{
    C(){
        System.out.println("const. C");
    }

    void callme(){
        System.out.println("class C: callme");
    }

}

class ABCDemo{

    public static void main(String[] args) {
        C myC = new C();
        B myB = new B();
        A myA = new A();

        myB.show();
        myB.show("showB: k = ");

        A r;

        r = myA;
        r.callme();

        r = myB;
        r.callme();

        r = myC;
        r.callme();

    }

}

abstract class Figure{

    double dim1, dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

}

class Triangle extends Figure{

    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("figure triangle: ");
        return dim1 * dim2 / 2;
    }

}

class Rectangle extends Figure{

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("figure rectangle: ");
        return dim1 * dim2;
    }

}

class FindAreas{

    public static void main(String[] args) {

        //Figure myfigure = new Figure(5, 10);
        Rectangle myrectangle = new Rectangle(4, 5);
        Triangle mytriangle = new Triangle(2, 5);
        Figure figref;

        figref = myrectangle;
        System.out.println("Area = " + figref.area());

        figref = mytriangle;
        System.out.println("Area = " + figref.area());

    }

}

abstract class Aabs{

    abstract void callme();

    void callmetoo(){
        System.out.println("Method callmetoo() in Aabs.");
    }
}

class B2 extends Aabs{

    void callme(){
        System.out.println("callme() in class B2.");
    }

}

class AbsTest{

    public static void main(String[] args) {

        B2 myb2 = new B2();

        myb2.callme();
        myb2.callmetoo();

    }

}