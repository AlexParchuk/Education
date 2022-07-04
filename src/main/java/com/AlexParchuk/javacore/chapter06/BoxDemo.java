package com.AlexParchuk.javacore.chapter06;

class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        System.out.println("Create new box ");
        width = 10;
        height = 10;
        depth = 10;
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

class BoxDemo {

    public static void main(String[] args) {

        Box mybox1 = new Box(10,10,10);
        Box mybox2 = new Box(10,10,10);

        double vol1,vol2;

        mybox1.depth  = 15;
        mybox1.width  = 10;
        mybox1.height = 20;

        mybox2.depth  = 13;
        mybox2.width  = 4;
        mybox2.height = 11;

        System.out.println("1 metod--------------------------");
        vol1 = mybox1.depth * mybox1.height * mybox1.width;
        vol2 = mybox2.depth * mybox2.height * mybox2.width;

        System.out.println("Volume box1 " + vol1);
        System.out.println("Volume box2 " + vol2);

        System.out.println("2 metod--------------------------");

        mybox1.volume();
        mybox2.volume();

        System.out.println("3 metod--------------------------");

        System.out.println("Volume box1 " + mybox1.volume2());
        System.out.println("Volume box2 " + mybox2.volume2());

        System.out.println("4 metod--------------------------");

        Box mybox3 = new Box(10,10,10);
        mybox3.setDim(14, 10,4);
        System.out.println("Volume box = " + mybox3.volume2());

        System.out.println("5 metod--------------------------");

        Box mybox4 = new Box(4,8,12);
        System.out.println("Volume box = " + mybox4.volume2());

    }

}

class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item){
        if (tos == 9)
            System.out.println("Stack is full!");
        else
            stck[++tos] = item;
    }

    int pop(){
        if (tos < 0) {
            System.out.println("Stack is empty!");
            return 0;
        }
        else
            return stck[tos--];
    }

}

class TestStack {

    public static void main(String[] args) {

        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        System.out.println("Stack 1: ");
        for (int i = 0; i < 10; i++) System.out.println(mystack1.pop());

        System.out.println("Stack 2: ");
        for (int i = 0; i < 10; i++) System.out.println(mystack2.pop());
    }

}