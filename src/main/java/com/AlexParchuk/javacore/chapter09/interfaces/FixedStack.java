package main.java.com.AlexParchuk.javacore.chapter09.interfaces;

class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("Stack is full!");
        else stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty!");
            return 0;
        }
        else return stck[tos--];
    }

}

class IFTest{

    public static void main(String[] args) {

        FixedStack mystack1 = new FixedStack(7);
        FixedStack mystack2 = new FixedStack(9);

        for (int i = 0; i < 7; i++) {
            mystack1.push(i+1);
        }

        for (int i = 0; i < 9; i++) {
            mystack2.push(i+2);
        }

        System.out.println("Item of stack 1:");
        for (int i = 0; i < 7; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Item of stack 2:");
        for (int i = 0; i < 9; i++) {
            System.out.println(mystack2.pop());
        }

    }

}

class DynStack implements IntStack {

    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int newstck[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                newstck[i] = stck[i];
            }
            stck = newstck;
            stck[++tos] = item;
        } else stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty!");
            return 0;
        } else return stck[tos--];
    }

    public int stcklength(){
        return stck.length;
    }

}

class IFTest2{

    public static void main(String[] args) {

        DynStack mystack1 = new DynStack(4);
        DynStack mystack2 = new DynStack(7);

        for (int i = 0; i < 9; i++) {
            mystack1.push(i+1);
            mystack2.push(i+2);
        }

        int mystack1length = mystack1.stcklength();
        System.out.println("Stack 1 length = " + mystack1length);
        System.out.println("Item of stack 1:");
        for (int i = 0; i < 9; i++) {
            System.out.println(mystack1.pop());
        }

        int mystack2length = mystack2.stcklength();
        System.out.println("Stack 2 length = " + mystack2length);
        System.out.println("Item of stack 2:");
        for (int i = 0; i < 9; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

class IFTest3{

    public static void main(String[] args) {
        IntStack tempstck;

        FixedStack fs = new FixedStack(5);
        DynStack ds = new DynStack(6);

        tempstck = fs;

        for (int i = 0; i < 5; i++) {
            tempstck.push(i + 2);
        }

        tempstck = ds;

        for (int i = 0; i < 9; i++) {
            tempstck.push(i + 1);
        }

        System.out.println("Item of ds:");
        for (int i = 0; i < 9; i++) {
            System.out.println(tempstck.pop());
        }

        tempstck = fs;
        System.out.println("Item of fs:");
        for (int i = 0; i < 5; i++) {
            System.out.println(tempstck.pop());
        }

    }

}