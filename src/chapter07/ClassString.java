package chapter07;

class ClassString {

    public static void main(String[] args) {

        String mystring1 = "First string";
        String mystring2 = "Second string";
        String mystring3 = mystring1 + " and " +mystring2;
        String mystring4 = mystring1;

        System.out.println("String 1 = " + mystring1);
        System.out.println("String 2 = " + mystring2);
        System.out.println("String 3 = " + mystring3);

        mystring3 = "unknown string";

        System.out.println(mystring3);

        System.out.println("Lenght string 1 = " + mystring1.length());
        System.out.println("Lenght string 2 = " + mystring2.length());

        System.out.println("2 char in string 2 = " + mystring2.charAt(2));
        System.out.println("1 char in string 1 = " + mystring1.charAt(1));

        System.out.println("String 1 = String 2 is " + mystring1.equals(mystring2));
        System.out.println("String 1 = String 4 is " + mystring1.equals(mystring4));

    }

}

class StringArray{

    public static void main(String[] args) {

        String mystring[] = {"First","Second","3"};

        for (int i = 0; i < 3; i++) {
            System.out.println("mystring[" + i + "] = " + mystring[i]);
        }
    }

}
