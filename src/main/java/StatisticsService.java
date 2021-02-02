import java.util.Arrays;

public class StatisticsService<sum, average> {
    public long calculateSum(long[] gains) {
        long sum = 0;
        for (long gain : gains) {
            sum += gain;
        }
        return sum;
    }

    public long calculateAverage(long[] gains, long sum) {
        long average = sum / gains.length;
        return average;
    }


    public long findMax(long[] gains) {
        long currentMax = gains[0];
        int maxIndex = 0;
        for (int l = 1; l < gains.length; l++) {
            if (gains[l] >= currentMax) {
                currentMax = gains[l];
                maxIndex = l;
            }
        }
        return maxIndex;
    }

    public long findMin(long[] gains) {
        long currentMin = gains[0];
        int minIndex = 0;
        for (int l = 1; l < gains.length; l++) {
            if (gains[l] <= currentMin) {
                currentMin = gains[l];
                minIndex = l;
            }
        }
        return minIndex;
    }

    public long findUnderAverage(long[] gains, long average) {
        long countUnder = 0;
        for (int l = 0; l < gains.length; l++) {
            if (gains[l] < average) {
                countUnder++;
            }
        }
        return countUnder;
    }

    public long findOverAverage(long[] gains, long average) {
        long countOver = 0;
        for (int l = 0; l < gains.length; l++) {
            if (gains[l] > average) {
                countOver++;
            }
        }
        return countOver;
    }
}
