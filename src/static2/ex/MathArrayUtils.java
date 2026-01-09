package static2.ex;

public class MathArrayUtils {


    private MathArrayUtils() {

    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total+=value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0]; // 첫 번째 값을 기준으로 잡음
        for (int value : values) {
            if (value < min) { // 더 작은 값이 나타나면
                min = value;   // 교체
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0]; // 첫 번째 값을 기준으로 잡음
        for (int value : values) {
            if (value > max) { // 더 큰 값이 나타나면
                max = value;   // 교체
            }
        }
        return max;
    }
}
