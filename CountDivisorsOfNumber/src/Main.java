public class Main {
    public static void main(String[] args) {
        System.out.println(getCountDivisors(4));
        System.out.println(getCountDivisors(5));
        System.out.println(getCountDivisors(12));
        System.out.println(getCountDivisors(30));
    }
    private static int getCountDivisors(int number){
        int count = 0;
        for(int i = number; i > 0; i--){
            if(number % i == 0)
                count++;
        }
        return count;
    }
}