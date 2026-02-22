import java.util.*;

public class OOPSBannerAppUC7 {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static class CharacterPatternMap {
        private static Map<Character, CharacterPattern> map = new HashMap<>();

        static {
            map.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            map.put('P', new CharacterPattern('P', new String[]{
                    "****** ",
                    "*     *",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      ",
                    "*      "
            }));
        }

        public static String[] getPattern(char ch) {
            CharacterPattern cp = map.get(Character.toUpperCase(ch));
            return cp != null ? cp.getPattern() : null;
        }
    }

    public static void main(String[] args) {
        String word = "OOPS";
        int height = 7;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                String[] pattern = CharacterPatternMap.getPattern(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }
            System.out.println(line);
        }
    }
}
