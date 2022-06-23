package main.java.com.AlexParchuk.javacore.chapter07;

class Recursion {

   static int fact(int a) {

       if (a == 1)
           return a;
       else
           return fact(a-1) * a;
   }

    public static void main(String[] args) {

        System.out.println("factorial 3 = " + fact(3));
        System.out.println("factorial 4 = " + fact(4));
        System.out.println("factorial 15 = " + fact(15));

    }
}

class Recursion2{

    int array[];

    Recursion2(int a){
        array = new int[a];
    }

    void PrintArray(int i) {

        if (i < 0)
            return;
        else {
            System.out.println("Arr[" + i + "] = " + array[i]);
            PrintArray(--i);
        }
    }

}

class Recursion2Test{

    public static void main(String[] args) {

        Recursion2 Arr = new Recursion2(6);

        for (int i = 0; i < 6; i++) Arr.array[i] = i * 2 + 3;

        Arr.PrintArray(5);

    }

}