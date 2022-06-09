public class chapter03_DataTypes {

    public static void main(String[] args) {

        System.out.println("---------numbers------------------------------------------");
        // numbers
        {
            long VariableLong; // -9223372036854775808 - 9223372036854775807 - 64x
            int VariableInteger; // -2147483648 - 2147483647 - 32x
            short VariableShort; // -32768 - 32767 - 16x
            byte VariableByte; // -128 - 127 - 8x

            // light speed
            {
                int lightspeed;
                long days;
                long seconds;
                long distance;

                lightspeed = 186000;
                days = 1000;
                seconds = days * 24 * 60 * 60;
                distance = lightspeed * seconds;

                System.out.print("For " + days);
                System.out.print(" days the light will pass about ");
                System.out.println(distance + " miles.");
            }

            float VariableFloat; // 4.9е-324 - 1.8е+308    - 32x
            double VariableDouble; // 1.4е-045 - 3.4е+ОЗ8  - 64x

            double pi, r, a;
            r = 10.8;
            pi = 3.1416;
            a = pi * r * r;

            System.out.println("Area " + a);

        }

        System.out.println("---------symbols------------------------------------------");
        // symbols
        {
            char VariableChar; // Unicode О - 65536 - 16x

            char ch1, ch2;
            ch1 = 88; // код символа Х
            ch2 = 'Y';
            System.out.print("ch1 and ch2: ");
            System.out.println(ch1 + " " + ch2);

            System.out.println("ch1 = " + ch1);
            ch1++; //увеличить на единицу значение переменной ch1
            System.out.println("ch1 + 1 = " + ch1);

        }

        System.out.println("---------boolean------------------------------------------");
        //boolean
        {
            boolean b;

            b = false;
            System.out.println("b = " + b);

            b = true;
            System.out.println("now b = " + b);

            if(b) System.out.println("b = true");

            b = false;
            if(b) System.out.println("b = true");
            else System.out.println("b <> true");

            System.out.println("10 > 9 equals " + (10 > 9) );

        }

    }
}
