package starters.StringPrograms;

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

    public static void main(String[] args) {
        System.out.println("Longest str : " + longestPalindrome("cbbd"));
    }
}
