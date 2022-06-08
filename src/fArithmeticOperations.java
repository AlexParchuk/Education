/**
 * % - деление по модулю - остаток от деления
 * ++  - инкремент - добавление 1
 * -- - декремент - добавление -1
 * += - сложение с присваиванием
 * -= - вычитание с присваиванием
 * *= - умножение с присваиванием
 * /= - деление с присваиванием
 * %= - деление по модулю с присваиванием
 *
 * (a = a + 4) = (a+=4)
 * (a = a % 2) = (a % = 2)
 *
 * ~ - операция НЕ
 * & - операция И
 * | - операция ИЛИ
 * ^ - операция исключающее ИЛИ
 *
 * || - укороченая логическая ИЛИ
 * && - укороченая логическая И
 * ! - логическая НЕ
 * &= - И с присваиванием
 * |= - ИЛИ с присваиванием
 * ^= - исключающее ИЛИ с присваиванием
 * ?: - тернарная условная операция типа Если...,то...,иначе...
 * выражение1 ? выражение2 : выражение3 - если выражение1 = true, вычисляется выражение2 иначе выражение3
 *
 * При использовании форм || и && этих операторов вместо форм | и &
 * в программе на Java не будет вычисляться значение правого операнда, если результат
 * выражения можно определить по значению только левого операнда.
 *
 * == - равно
 * != - не равно
 * > - больше
 * < - меньше
 * >= - больше или равно
 * <= - меньше или равно
 *
 */
public class fArithmeticOperations {

    public static void main(String[] args) {

        System.out.println("-----------------Base-------------------------");

        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);

            double da = 1 + 1;
            double db = da * 3;
            double dc = db / 4;
            double dd = dc - a;
            double de = -dd;

            System.out.println("da = " + da);
            System.out.println("db = " + db);
            System.out.println("dc = " + dc);
            System.out.println("dd = " + dd);
            System.out.println("de = " + de);
        }

        System.out.println("-----------------modulo division-------------------------");
        {
            int x = 54;
            double y = 54.35;

            System.out.println("x = " + x);
            System.out.println("y = " + y);

            System.out.println("x mod 10 = " + x % 10);
            System.out.println("y mod 10 = " + y % 10);

            System.out.println("x mod 5 = " + x % 5);
            System.out.println("y mod 5 = " + y % 5);
        }

        System.out.println("-----------------Base + assignation-------------------------");
        {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);

            a += 5;
            b *= 3;
            c %= 2;

            System.out.println("a + = 5 == " + a);
            System.out.println("b * = 3 == " + b);
            System.out.println("c % = 2 == " + c);
        }

        System.out.println("-----------------" + " ++/-- " + "---------------------------");
        {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);

            System.out.println("a++ = " + a++);
            System.out.println("++a = " + ++a);
            System.out.println("b++ = " + b++);
            System.out.println("++b = " + ++b);
            System.out.println("c-- = " + c--);
            System.out.println("--c = " + --c);
        }

        System.out.println("-----------------Bitwise---------------------------");
        {
            String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                    "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

            int a1 = 3, b1 = 6;
            int c1 = a1 | b1;
            int d1 = a1 & b1;
            int e1 = a1 ^ b1;
            int f1 = (~a1 & b1) | (a1 & ~b1);
            int g1 = ~a1 & 0x0f;

            System.out.println("a1 = " + binary[a1]);
            System.out.println("b1 = " + binary[b1]);
            System.out.println("a1 | b1 = " + binary[c1]);
            System.out.println("a1 & b1 = " + binary[d1]);
            System.out.println("a ^ b = " + binary[e1]);
            System.out.println("~a1 & b1 | a1 & ~b1 = " + binary[f1]);
            System.out.println("~a1 & 0x0f = " + binary[g1]);
        }

        System.out.println("-----------------Logic---------------------------");
        {
            boolean a2 = true;
            boolean b2 = false;

            boolean c2 = a2 | b2;
            boolean d2 = a2 & b2;
            boolean e2 = a2 ^ b2;
            boolean f2 = (!a2 & b2) | (a2 & !b2);
            boolean g2 = !a2;

            System.out.println("a2 = " + a2);
            System.out.println("b2 = " + b2);
            System.out.println("a2 | b2 = " + c2);
            System.out.println("a2 & b2 = " + d2);
            System.out.println("a2 ^ b2 = " + e2);
            System.out.println("(!a2 & b2) | (a2 & !b2) = " + f2);
            System.out.println("!a2 = " + g2);
        }

        System.out.println("-----------------?---------------------------");

        int i = 10, k;

        k = i < 0 ? -i : i;
        System.out.println("Absolut " + i + " = " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Absolut " + i + " = " + k);

    }

}
