package main.java.com.AlexParchuk.javacore.chapter02;

/**
 Документирующий комментарий
 */

// однострочный комментарий

 /* многострочный комментарий
 вторая строка комментария
 */
    
public class chapter02_Variables {

    public static void main(String args[])
       //  Integer Variables + if else + for
    {
        int VariablesInteger1;
        int VariablesInteger2, VariablesInteger3;

        VariablesInteger1 = 100;
        VariablesInteger2 = 3;
        VariablesInteger3 = 25;

        System.out.print("Var1 = ");
        System.out.println(VariablesInteger1);

        System.out.print("Var2 = ");
        System.out.println(VariablesInteger2);

        System.out.print("Var3 = ");
        System.out.println(VariablesInteger3);

        int VariablesInteger12 = VariablesInteger1 * VariablesInteger2;
        int VariablesInteger13 = VariablesInteger1 * VariablesInteger3;
        int VariablesInteger23 = VariablesInteger2 * VariablesInteger3;

        System.out.print("Var1 * Var2 = ");
        System.out.println(VariablesInteger1 * VariablesInteger2);

        System.out.print("Var1 * Var3 = ");
        System.out.println(VariablesInteger1 * VariablesInteger3);

        System.out.print("Var2 * Var3 = ");
        System.out.println(VariablesInteger23);

        System.out.print("Max multiplication = ");

        { // блок кода
        System.out.println("1 way");
        if (VariablesInteger12 > VariablesInteger13) {
            if (VariablesInteger12 > VariablesInteger23) System.out.println(VariablesInteger12);
            else System.out.println(VariablesInteger23);
        }
        else {
            if (VariablesInteger13 > VariablesInteger23) System.out.println(VariablesInteger13);
            else System.out.println(VariablesInteger23);
        }
        }

        // Цикли
        System.out.println("---------------------------------------------------------");

        int x;
        for (x = 0; x < 5; x++)
            System.out.println("Cycle " + x);
    }

}
