import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.join(" ", getLexicographicalOrder(new String[]{"12951295", "mice", "bull"},
                new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
        System.out.println(String.join(" ", getLexicographicalOrder(new String[]{"1295", "code", "1346", "1028", "ar"},
                new String[]{"12951295", "ode", "46", "10281066", "par"})));
    }
    private static String[] getLexicographicalOrder(String[] array1, String[] array2 ){
        Set<String> list = new HashSet<>();
        for (String word1 : array1){
            for (String word2: array2){
                if(word2.contains(word1)){
                    list.add(word1);
                }
            }
        }
        return list.stream().sorted().toArray(String[]::new);
    }
}