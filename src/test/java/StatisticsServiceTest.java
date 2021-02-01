import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;

        long Sum = service.calculateSum(gains);
        assertEquals(expectedSum, Sum);
    }
    @Test
    void calculateAverage () {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage = 15;

        long Average = service.calculateAverage(gains);
        assertEquals(expectedAverage, Average);

    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 7;
        long max_index = service.findMax(gains);
        assertEquals(expectedMax, max_index);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 8;
        long min_index = service.findMin(gains);
        assertEquals(expectedMin, min_index);}

        @Test
        void findUnderAverage() {
            StatisticsService service = new StatisticsService();
            long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expectedUnderAverage = 5;
            long count = service.findUnderAverage(gains);
            assertEquals(expectedUnderAverage, count);
    }
    @Test
    void findOverAverage() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedOverAverage = 5;
        long countover = service.findOverAverage(gains);
        assertEquals(expectedOverAverage, countover);
    }
}