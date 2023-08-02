import java.util.List;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    System.out.println(isValidBraces(")(}{]["));
    System.out.println(isValidBraces("[({})]"));
    System.out.println(isValidBraces("(}"));
  }

  private static boolean isValidBraces(String brackets) {
    if (brackets.length() % 2 != 0)
      return false;

    int firstHash = Character.hashCode(brackets.charAt(0));
    int lastHash = Character.hashCode(brackets.charAt(brackets.length() - 1));

    boolean isValidStart = (firstHash == 91) || (firstHash == 40) || (firstHash == 123);
    boolean isValidEnd = lastHash == 93 || lastHash == 125 || lastHash == 41;

    if (isValidEnd && isValidStart) {
      List<Character> open = List.of(new Character[]{'(', '[', '{'});
      List<Character> close = List.of(new Character[]{')', ']', '}'});

      char[] arrayBrackets = brackets.toCharArray();
      Stack<Character> bracketStack = new Stack<>();

      for (int i = 0; i < brackets.length(); i++) {
        if (open.contains(arrayBrackets[i])){
          bracketStack.push(arrayBrackets[i]);
        } else if (close.indexOf(arrayBrackets[i]) == open.indexOf(bracketStack.peek())) {
          bracketStack.pop();
        } else {
          return false;
        }
      }
    } else {
      return false;
    }

    return true;
  }
}