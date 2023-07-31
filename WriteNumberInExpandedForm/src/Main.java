import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(getExpandedForm(1019019));
        System.out.println(getExpandedForm(12));
        System.out.println(getExpandedForm(42));
        System.out.println(getExpandedForm(70304));
    }
    private static String getExpandedForm(int number){
        if(number > 10){
            List<Integer> integers = new ArrayList<>();
            int count = 10;
            int currentNumber = number;
            for (int i = 0; i < String.valueOf(number).length(); i++){
                integers.add(currentNumber % count);
                currentNumber -= currentNumber % count;
                count *= 10;
            }

            return integers.stream()
                    .filter(num -> !num.equals(0))
                    .sorted((ob1, ob2) -> -ob1.compareTo(ob2))
                    .map(String::valueOf)
                    .collect(Collectors.joining(" + "));
        }
        return String.valueOf(number);
    }
}