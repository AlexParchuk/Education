package chapter07;

/** Метод, который
 *  принимает переменное количество арrументов, называется методом с аргументами
 *  переменной длины.
 *  Наряду с параметром переменной длины у метода могут быть и "обычные" параметры.
 *  Но параметр переменной длины должен быть последним среди всех параметров,
 *  объявляемых в методе.
 */

class VariableArgs {

    static void VaTest(String str, int ...arr){
        System.out.println(str + ": Length arr = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {

        VaTest("First args", 1,2,3,5,8);
        VaTest("Second args", 1,2,5);
        VaTest("Third args");

    }

}

class VariableArgs2{

    static void VaTest(int ...arr){
        System.out.println("Length arr = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    static void VaTest(String str, int ...arr){
        System.out.println("string + arr: Length arr = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    static void VaTest(boolean varbool, int ...arr){
        System.out.println("boolean + arr: Length arr = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    static void VaTest(boolean ...arr){
        System.out.println("boolean arr: Length arr = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        VaTest(1,2,3);
        VaTest("str", 1,2,3,4,5);
        VaTest(true, 1,2,3);
        VaTest(true, false,true);
    }

}