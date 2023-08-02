import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }
    public static String camelCase(String input) {
        StringBuilder builder = new StringBuilder();
        Stream<Character> streamCharacter = input.chars().mapToObj(c -> (char)c);
        streamCharacter.forEach(character ->
            builder.append(Character.isUpperCase(character) ? " " + character : character ));
        return builder.toString();
    }
}