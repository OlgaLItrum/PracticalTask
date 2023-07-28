import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            ArrayList<String> names = new ArrayList<>();
            System.out.println("Enter count names");
            int count = Integer.parseInt(in.nextLine());
            int index = 0;
            while (index < count){
                System.out.println("Enter name");
                names.add(String.valueOf(in.nextLine()));
                index++;
            }
            showNames(names);
        }
    }

    private static void showNames(ArrayList<String> names) {
        final String text = " like this";
        final String andWord = " and ";
        switch (names.size()) {
            case 0 -> System.out.println("no one likes this");
            case 1 -> System.out.println(names.get(0) + " likes this");
            case 2 -> System.out.println(names.get(0) + andWord + names.get(1) + text);
            case 3 -> System.out.println(names.get(0) + ", " + names.get(1) +
                    andWord + names.get(2) + text);
            default -> System.out.println(names.get(0) + ", " + names.get(1) +
                    andWord + (names.size() - 2) + " others" + text);
        }

    }

}