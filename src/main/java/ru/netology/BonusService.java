public class BonusService {

    @Test
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









///public class BonusService {
    //public long calculate(long amount, boolean registered) {
       // int percent = registered ? 3 : 1;
        //long bonus = amount * percent / 100 / 100;
       // long limit = 500;
       // if (bonus > limit) {
       //     bonus = limit;
       // }
      //  return bonus;
   // }
//}

