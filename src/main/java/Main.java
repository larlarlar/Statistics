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

          long Sum = service.calculateSum(gains);
          boolean passed1 = expectedSum == Sum;
          System.out.println("Сумма всех продаж:" + Sum);

          long Average = service.calculateAverage(gains);

          boolean passed2 = expectedAverage == Average;
          System.out.println("Средняя сумма продаж в месяц:" + Average);

          long max_index = service.findMax(gains);
          boolean passed3 = expectedMax == max_index;
          long monthnumbermax = max_index + 1;
          System.out.println("Номер месяца, в котором был пик продаж:" + monthnumbermax);

          long min_index = service.findMin(gains);
          boolean passed4 = expectedMin == min_index;
          long monthnumbermin = min_index + 1;
          System.out.println("Номер месяца, в котором был минимум продаж:" + monthnumbermin);

          long count = service.findUnderAverage(gains);
          boolean passed5 = expectedUnderAverage == count;
          System.out.println("Кол-во месяцев, в которых продажи были ниже среднего:" + count);

          long countover = service.findOverAverage(gains);
          boolean passed6 = expectedOverAverage == countover;
          System.out.println("Кол-во месяцев, в которых продажи были выше среднего:" + countover);
     }
}
