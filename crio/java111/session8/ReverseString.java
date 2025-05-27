package crio.java111.session8;

public class ReverseString {
    static String reverseWords(String string) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            strBuilder.append(string.charAt(i));
        }
        return strBuilder.toString();
    }

    public static void main(String args[]) {
        String string = "Cat";
        System.out.println(reverseWords(string));
        System.out.println(reverseWords(""));
        // assert (reverseWords(string).equals("taC")) : "Expect \"taC\" for string =
        // \"Cat\"";
        // string = "cart";
        // assert (reverseWords(string).equals("trac")) : "Expect \"trac\" for string =
        // \"cart\"";
        // System.out.println("All test cases in main function passed");

    }
}
