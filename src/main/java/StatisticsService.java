
public class StatisticsService {
    @Test.junit.jupiter.api.Test
void calculateSum() {
    StatisticsService service = new StatisticsService();
    long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 180;
    long actual = service.calculateSum(gains);
    assertEquals(expected, actual);
}

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;
        long actual = service.findMax(gains);

        assertEquals(expected, actual);
    }
}
