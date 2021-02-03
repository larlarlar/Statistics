import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();
        //подготавливаем данные
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        String[] monthnames = {"JAN", "FEB", "MRCH", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        long expectedSum = 180;
        long expectedAverage = 15;
        long expectedMax = 7;
        long expectedMin = 8;
        long expectedUnderAverage = 5;
        long expectedOverAverage = 5;

        long sum = service.calculateSum(gains);
        boolean passed1 = expectedSum == sum;
        System.out.println("Сумма всех продаж:" + sum);

        long average = service.calculateAverage(gains);
        boolean passed2 = expectedAverage == average;
        System.out.println("Средняя сумма продаж в месяц:" + average);

        long maxIndex = service.findMax(gains);
        boolean passed3 = expectedMax == maxIndex;
        long monthnumbermax = maxIndex + 1;
        System.out.println("Номер месяца, в котором был пик продаж:" + monthnumbermax);

        long minIndex = service.findMin(gains);
        boolean passed4 = expectedMin == minIndex;
        long monthnumbermin = minIndex + 1;
        System.out.println("Номер месяца, в котором был минимум продаж:" + monthnumbermin);

        long countUnder = service.findUnderAverage(gains);
        boolean passed5 = expectedUnderAverage == countUnder;
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего:" + countUnder);

        long countOver = service.findOverAverage(gains);
        boolean passed6 = expectedOverAverage == countOver;
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего:" + countOver);
    }
}
