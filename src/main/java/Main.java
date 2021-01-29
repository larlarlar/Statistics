public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        //подготавливаем данные
        String[] monthsnames = {"JAN", "FEB", "MRCH", "APRL", "MAY", "JUN", "JUL", "AUG", "SPT", "OCT", "NOV", "DEC"};
        int[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        for (int gain : gains) { System.out.println(gain);
        }}
    int[] gains = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public long calculateSum(long[] gains) {
        long sum = 0;
        for (long gain : gains) {
            sum += gain;
        }
        return sum;
    }
public long findMax(long[] gains) {
        long currentMax = gains[0];
        for (long gain : gains) {
            if (currentMax < gain) {
                currentMax = gain;}}
        return currentMax;
            }
        }

