import java.util.HashMap;
import java.util.Map;

public class oopsbanner {

    static Map<Character, String[]> letterMap = new HashMap<>();

    static {
        letterMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        letterMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        letterMap.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }

    public static void printBanner(String word) {
        int height = 5;

        for (int row = 0; row < height; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = letterMap.get(Character.toUpperCase(ch));
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}
