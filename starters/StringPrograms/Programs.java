package starters.StringPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class Programs {

    public static boolean isPalindroneString(String str) {
        String result = new String();
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result.equals(str);
    }

    public static String longestPalindrome(String s) {
        String maxString = new String();
        String iString = new String();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                iString += s.charAt(j);

                if (isPalindroneString(iString)) {
                    maxString = iString;
                }
            }

        }
        return maxString;
    }

    public static boolean validIndex(int i, int j, char[][] board, char startValue) {
        int m = board.length;
        int n = board[0].length;
        if (i > -1 && i < m && j > -1 && j < n) {
            return board[i][j] == startValue;
        }
        return false;
    }

    public static boolean isExists(char[][] board, String word, int x, int y) {
        int strIndex = 1;
        char startValue = word.charAt(strIndex);
        int i = x;
        int j = y;
        while (i > 0 && j > 0 && i < board.length && j < board[0].length) {
            int xi1 = i + 1;
            int xi2 = i - 1;
            int yi1 = y + 1;
            int yi2 = y - 1;

            boolean valueFound = false;
            if (validIndex(xi1, yi1, board, startValue)) {
                i = xi1;
                y = yi1;
                valueFound = true;
            }
            if (validIndex(xi1, yi2, board, startValue)) {

                i = xi1;
                y = yi2;
                valueFound = true;
            }
            if (validIndex(xi2, yi1, board, startValue)) {

                i = xi2;
                y = yi1;
                valueFound = true;
            }
            if (validIndex(xi2, yi2, board, startValue)) {

                i = xi2;
                y = yi2;
                valueFound = true;
            }
            if (valueFound) {
                strIndex++;

                if (strIndex >= word.length()) {
                    return true;
                }
                startValue = word.charAt(strIndex);
            } else {
                return false;
            }

        }
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        if (board[0].length == 0) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == word.charAt(0) & isExists(board, word, i, j)) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        // char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        // String words = "ABCCED";
        // System.out.println(exist(board, words));
        ArrayList<Integer> arr = new ArrayList<>();
        arr.

    }
}
