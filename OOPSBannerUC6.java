public class OOPSBannerUC6 {

    static String O(int i) {
        String[] o = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
        return o[i];
    }

    static String P(int i) {
        String[] p = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
        return p[i];
    }

    static String S(int i) {
        String[] s = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
        return s[i];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    O(i) + "  " +
                    O(i) + "  " +
                    P(i) + "  " +
                    S(i)
            );
        }
    }
}
