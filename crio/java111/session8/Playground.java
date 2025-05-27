package crio.java111.session8;

public class Playground {
    public static String numberToString(int num) {
        StringBuilder str = new StringBuilder();
        char[] number = new char[100];
        int i = 0;
        int n = num;
        while (n > 0) {
            number[i] = (char) ((n % 10) + '0');
            n = n / 10;
            i++;
        }
        for (int k = i - 1; k >= 0; k--) {
            str.append(number[k]);
        }
        return str.toString();
    }

    static String chessGrandmaster(String[] x) {
        int winCount = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("Win")) {
                winCount++;
            }
        }
        if (winCount == x.length) {
            return "Grand Master";
        }
        if (winCount > 0) {
            return "International Master";
        }
        return "Master";

    }

    public static void main(String[] args) {
        String str = "i am rohith";
        String s = "" + str.charAt(0);
        System.out.println();
    }
}
