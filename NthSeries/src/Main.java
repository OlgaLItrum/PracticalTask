public class Main {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
        System.out.println(seriesSum(2));
    }
    public static String seriesSum(int n) {
        if(n != 0){
            double number = 0;
            for(int i = 1; i < n * 3; i+=3){
                number += (double)1/i ;
            }
            return String.format("%.2f", number);
        }
        return "0.00";
    }
}