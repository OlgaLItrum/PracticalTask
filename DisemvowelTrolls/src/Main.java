import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
                System.out.println(convertToNotTrollString(in.nextLine()));
        }
    }
    public static String convertToNotTrollString(String trollString){
        IntStream intStream = trollString.codePoints();
        return intStream
                .filter(num -> num != 97 && num != 101 && num != 111 && num != 105 && num != 117)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }
}