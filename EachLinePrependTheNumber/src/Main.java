import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        arrayWithTheNumber(new String[]{"a", "b", "c"}).forEach(System.out::println);
        arrayWithTheNumber(new String[]{"a", "b", "c", " ", "d", ""}).forEach(System.out::println);
        arrayWithTheNumber(new String[]{}).forEach(System.out::println);
    }
    private static List<String> arrayWithTheNumber(String[] array){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (array[i].isBlank()){
                continue;
            }
            list.add(i + 1 + ": " + array[i]);
        }
        return list;
    }
}