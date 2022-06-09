/**
 * тип имя_переменной[]; int month_days[];
 * переменная_массива = new тип [размер] ; month_days = new int[12];
 *
 * int month_days[] = new int[12];
 *
 * Элементы массива, для которых память была выделена операцией
 * new, будут автоматически инициализированы нулевыми значениями
 */

public class chapter03_Array {

    public static void main(String args[]) {

        // одномерные массивы
        // Рассчет количества дней, от рождества Христового до даты рождения
        {
            int AgeYear = 1984, AgeMonth = 8, AgeDays = 11;
            int YearStandart = 365, YearLeap = 366;
            int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int x, NumberOfDays = 0, NumberOfYearLeap = 0;
            int NumberDaysMonth = 0;

            for (x = 1; x < AgeYear; x++) {
                if (x % 4 == 0) {
                    NumberOfDays = NumberOfDays + YearLeap;
                    NumberOfYearLeap = NumberOfYearLeap + 1;
                } else NumberOfDays = NumberOfDays + YearStandart;
            }

            System.out.println("Number Days (year) = " + NumberOfDays);

            for (x = 1; x < AgeMonth; x++) {
                NumberOfDays = NumberOfDays + month_days[x];
                NumberDaysMonth = NumberDaysMonth + month_days[x];
            }

            NumberOfDays = NumberOfDays + AgeDays;

            System.out.println("Number Days (month) = " + NumberDaysMonth);
            System.out.println("Number Of Leap Year = " + NumberOfYearLeap);
            System.out.println("Number of days = " + NumberOfDays);
        }

        // многомерные массивы
        {
            int threeD[] [] [] = new int[3][4][5];
            int i, j , k;

            for(i=0; i<3; i++)
                for(j=0; j<4; j++)
                    for(k=0; k<5; k++)
                        threeD[i] [j] [k] = i * j * k;

            for(i=0; i<3; i++) {
                for (j = 0; j < 4; j++) {
                    for (k = 0; k < 5; k++) System.out.print(threeD[i][j][k] + " ");
                    System.out.println();
                }
                System.out.println();
            }
        }
    }

}
