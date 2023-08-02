
public class Main {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a','b','c','d','f' }));
    }

    public static char findMissingLetter(char[] array)
    {
        int objectChar = 0;
        String arrayChar = String.valueOf(array);
        for(int i = 1; i < arrayChar.length(); i++){
            if(!(arrayChar.charAt(i) > arrayChar.charAt(i - 1)
                    && arrayChar.charAt(i) - arrayChar.charAt(i - 1) == 1))
                objectChar = (arrayChar.charAt(i - 1)) + 1;

        }
        return (char) objectChar;
    }
}