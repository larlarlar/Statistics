import java.util.Arrays;

public class StatisticsService {

    public long calculateSum(long[] gains) {
        long sum = 0;
        for (long gain : gains) {
            sum += gain;
        }
        return sum;
    }
    public long calculateAverage(long[] gains) {
        long sum = 0;
        for (long gain : gains) {
            sum += gain;
        }
        long Average = sum / 12;
        return Average;
    }


    public long findMax(long[] gains) {
         long currentMax = gains[0];
        int max_index = 0;
                for(int l=1; l < gains.length; l++) { if (gains[l] >= currentMax){
                    currentMax = gains[l];
                    max_index = l;

            }
        }
                return max_index;
    }
    public long findMin(long[] gains) {
        long currentMin = gains[0];
        int min_index = 0;
        for(int l=1; l < gains.length; l++) { if (gains[l] <= currentMin){
            currentMin = gains[l];
            min_index = l;
        }
        }
        return min_index;
    }
public long findUnderAverage(long[] gains) {
    long sum = 0;
    for (long gain : gains) {
        sum += gain;
    }
    long Average = sum / 12;
    long count = 0;
        for (int l = 0; l < gains.length; l++) {
            if (gains[l] < Average) {
                count++;
            }
        } return count;
}
    public long findOverAverage(long[] gains) {
        long sum = 0;
        for (long gain : gains) {
            sum += gain;
        }
        long Average = sum / 12;
        long countover = 0;
        for (int l = 0; l < gains.length; l++) {
            if (gains[l] > Average) {
                countover++;
            }
        } return countover;
    }
}
