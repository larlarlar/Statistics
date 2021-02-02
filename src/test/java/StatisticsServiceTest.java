import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long sum = service.calculateSum(gains);
        assertEquals(expectedSum, sum);
    }

    @Test
    void calculateAverage() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = 180;
        long expectedAverage = 15;
        long average = service.calculateAverage(gains, sum);
        assertEquals(expectedAverage, average);
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 7;
        long maxIndex = service.findMax(gains);
        assertEquals(expectedMax, maxIndex);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 8;
        long minIndex = service.findMin(gains);
        assertEquals(expectedMin, minIndex);
    }

    @Test
    void findUnderAverage() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long average = 15;
        long expectedUnderAverage = 5;
        long countUnder = service.findUnderAverage(gains, average);
        assertEquals(expectedUnderAverage, countUnder);
    }

    @Test
    void findOverAverage() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long average = 15;
        long expectedOverAverage = 5;
        long countOver = service.findOverAverage(gains, average);
        assertEquals(expectedOverAverage, countOver);
    }
}