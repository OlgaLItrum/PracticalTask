
public class Main {
    public static void main(String[] args) {
        System.out.println(findNumber(new int[]{17, 17, 3, 17, 17, 17, 17}));
        System.out.println(findNumber(new int[]{1, 1, 2}));
        System.out.println(findNumber(new int[]{1, 1, 2, 2, 5, 4, 4}));
    }

    private static int findNumber(int[] array){
        int number = 0;
        for (int j : array) number ^= j;
        return number;
    }
}