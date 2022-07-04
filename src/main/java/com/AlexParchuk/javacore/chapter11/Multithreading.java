package com.AlexParchuk.javacore.chapter11;

/**Потоки исполнения находятся в нескольких состояниях.
 * готовым к выполнению - как только получит время ЦП.
 * приостановлен - что приводит к временному прекращению его активности.
 * возобновлено - что позволяет продолжить его выполнение с того места, где он был приостановлен.
 * заблокирован на время ожидания какого-нибудь ресурса.
 * прерван - что приводит к немедленной остановке его исполнения.
 *           Однажды прерванный поток исполнения уже не может быть возобновлен.
 *
 *  Приоритеты потоков исполнения задаются целыми числами, определяющими относительный приоритет одного потока над другими.
 *
 *  Правила, которые определяют, когда должно происходить переключение контекста:
 *  - Поток может добровольно уступить управление. Для этого достаточно
 *    явно уступить очередь на исполнение, приостановить или блокировать поток на время ожидания ввода-вывода.
 *  - Один поток исполнения может быть вытеснен другим, более приоритетным потоком. В этом случае низкоприоритетный
 *    поток исполнения, который не уступает ЦП, просто вытесняется высокоприоритетным потоком, независимо от того, что он делает.
 *
 *  Когда поток исполнения находится в теле синхронизированного метода, ни один
 *  другой поток исполнения не может вызвать какой-нибудь другой синхронизированный метод для того же самого объекта.
 *
 *  Многопоточная система в Java построена на основе класса Thread, его методах
 *  и дополняющем его интерфейсе RunnaЫe. Класс Thread инкапсулирует поток исполнения.
 *
 *  главный поток - создается автоматически при запуске программы.
 *  им можно управлять через объект класса Thread.
 *
 *  currentThread () - метод возвращает ссылку на тот поток исполнения, из которого он был вызван.
 *
 *  Группа потоков исполнения - это структура данных, которая управляет состоянием всей совокупности потоков исполнения в целом.
 *
 *  В самом общем смысле для создания потока исполнения следует получить экземпляр объекта типа Thread. В языке Java этой цели
 *  можно достичь следующими двумя способами:
 *    • реализовав интерфейс Runnable;
 *    • расширив класс Thread.
 *
 *  I.
 *  1.  Для реализации интерфейса Runnable в классе должен быть объявлен единственный метод run ():
 *     public void run()
 *  2. в этом классе следует получить экземпляр объекта типа Thread
 *      Thread(Runnable объект_потока, String имя_потока)
 *      объект_потока - экземпляр класса реализующего интерфейс Runnable.
 *      имя_потока - Имя нового потока исполнения
 *  3. start () - в методе start () вызывается метод run ()
 *
 *  II.
 *  class NewThread extends Thread {
 *    NewThread() {
 *         suреr("Демонстрационный поток"); // создать новый поток исполнения
 *         System.out.println("Дoчepний поток: " + this);
 *         start(); // запустить поток на исполнение
 *     }
 *
 *  isAlive() - возвращает логическое значение true, если поток, для которого он вызван, еще исполняется.
 *  join() - метод ожидает завершения того потока исполнения, для которого он вызван.
 *
 *  setPriority(int уровень) - установить приоритет потока исполнения.
 *  уровень - должно быть в пределах от MIN_PRIORITY до МAX_PRIORITY (1 -10).
 *  getPriority() - получить текущее значение приоритета потока исполнения.
 *
 *  Монитор - это объект, используемый в качестве взаимоисключающей блокировки.
 *     Только один поток исполнения может в одно и то же время владеть монитором. Когда поток исполнения
 *     запрашивает блокировку, то говорят, что он входит в монитор.
 *  Чтобы войти в монитор объекта, достаточно вызвать метод, объявленный с модификатором доступа synchronized.
 *
 *  sуnсhrоnizеd(ссылка_на_объект) {
 *      // синхронизируемые операторы}
 *   Блок оператора synchronized гарантирует, что вызов метода, являющегося членом того же класса,
 *   что и синхронизируемый объект, на который делается указанная ссылка_на_объект,
 *   произойдет только тогда, когда текущий поток исполнения успешно войдет в монитор данного объекта.
 *
 *   Чтобы избежать опроса, в Java внедрен изящный механизм взаимодействия потоков
 *   исполнения с помощью методов wait() , notify() и notifyAll().
 *     • Метод wait() вынуждает вызывающий поток исполнения уступить монитор и перейти в состояние ожидания до тех пор,
 *       пока какой-нибудь другой поток исполнения не войдет в тот же монитор и не вызовет метод notify() .
 *     • Метод notify() возобновляет исполнение потока, из которого был вызван метод wait() для того же самого объекта.
 *     • Метод notifyAll() возобновляет исполнение всех потоков, из которых был вызван метод wait() для того же самого объекта.
 *       Одному из этих потоков предоставляется доступ.
 *
 */
public class Multithreading {
}
