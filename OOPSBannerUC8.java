import java.util.*;

public class OOPSBannerUC8 {

    static Map<Character, String[]> patternMap = new HashMap<>();

    static void loadPatterns() {
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });
    }

    static void renderWord(String word) {
        int height = 7;
        word = word.toUpperCase();

        for (int i = 0; i < height; i++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        loadPatterns();
        renderWord("OOPS");
    }
}
