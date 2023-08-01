import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(minMax(new int[]{1,1})).forEach(System.out::println);
    }
    public static int[] minMax(int[] arr) {
        return new int[]{ Arrays.stream(arr).min().orElse(0),
                Arrays.stream(arr).max().orElse(0)};
    }
}