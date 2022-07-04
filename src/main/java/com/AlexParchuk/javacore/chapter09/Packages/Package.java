package com.AlexParchuk.javacore.chapter09.Packages;

/**Пакеты являются контейнерами классов. Они служат для разделения пространств имен класса.
 * package пакет;
 * package пакет1 [. пакет2 [.пакет) ] ; //package а.Ь.с;
 *
 * один или несколько путей к каталогу можно указать, установив соответствующее значение в
 * переменной окружения CLASSPATH.
 *
 * import - чтобы отдельные классы или весь пакет можно было сделать доступными
 * и ссылаться непосредственно
 * import пакет 1 [.пакет2 ]. (имя_класса | *);
 * имя_класса может быть задано явно или с помощью знака звездочки(*), который
 * указывает компилятору Java на необходимость импорта всего пакета.
 *
 */

public class Package {

    String name;
    double ball;

    public Package(String n, double b){
        name = n;
        ball = b;
    }

    public void show(){
        if (ball < 0) {
            System.out.print("-->");
            System.out.println(name + ": $" + ball);
        }
    }

}

class AccountBalance{

    public static void main(String[] args) {

        Package current[] = new Package[3];

        current[0] = new Package("Name 1", 115.23);
        current[1] = new Package("Name 2", 93.51);
        current[2] = new Package("Name 3", -14.87);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }

    }

}