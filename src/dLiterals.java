/**
 * СИСТЕМЫ ЧИСЛЕНИЯ======================================
 * Шестнадцатеричная система числения
 * Ох + [0-9][a-f]... - 16x литералы (Ox7ffffffffffffff)
 * Ох + [0-9][a-f]... + L - Long  (Ox7ffffffffffffffL)
 *
 * Десятичная система числения
 *  * [1-9] + [0-9]...
 *
 * Восьмеричная система числения
 * 0 + [0-7]... - 8х
 *
 * Двоичная система числения
 * ОЬ + [0-1]... - 2x   (0b01011)
 *
 *
 * УКАЗАНИЕ ТИПА======================================
 *
 * long Var = 23L - указание типа значения Long
 * float Var = 1.3f - указание типа значения Float
 * double Var = 1.1D - указание типа значения double (необязательно)
 *
 * double 1.6E-19 = 1.6*10(-19) - степень числа 10) - литерал в експотенциальной форме
 *
 * char Var = `a` - символьный литерал
 * char Var = `\047` - значение в восьмеричной форме
 * char Var = `\u04FA` - значение шестнадцатеричной форме
 *
 */

public class dLiterals {

    public static void main(String args[]) {

        //приобразование типов
        {
            int a = 125;
            byte b = 101;
            double d = 323.142;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("d = " + d);

            b = (byte) a;
            System.out.println("b = (byte) a = " + b);

            a = (int) d;
            System.out.println("a = (int) d = " + a);

            b = (byte) d;
            System.out.println("b = (byte) d = " + b);

        }

        // продвижения типов
        System.out.println("----------------------------------------------------");
        /*byte, short и char продвигаются к типу int
        Затем тип всего выражения продвигается к типу long, если
        один из его операндов относится к типу long. Если же один из операндов относится
        к типу float, то тип всего выражения продвигается к типу float. А если
        любой из операндов относится к типу double, то и результат вычисления всего
        выражения относится к типу double.
        */
        {
            byte b = 42;
            char c = 'а';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = .1234;
            double result = (f * b) + (i /c) - (d * s);

            System.out.println("f = " + f);
            System.out.println("d = " + d);

            System.out.println( (f * b) + " + " + (i / c)  + " - " + (d * s));
            System.out.println("result = " + result);
        }

    }

}
