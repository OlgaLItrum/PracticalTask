import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        generateListWithWave("qwerty").forEach(System.out::println);
        generateListWithWave("hello").forEach(System.out::println);
    }
    private static List<String> generateListWithWave(String word){
        List<String> listWithWave = new ArrayList<>();
        if(!word.isBlank()){
            for (int i = 0; i < word.length(); i++){
                listWithWave.add(word.replace(word.charAt(i), Character.toUpperCase(word.charAt(i))));
            }
        }
        return listWithWave;
    }
}