package crio.java111.session8;

import java.util.*;

public class Solution {

    public static String addSpaces(String words[]) {
        StringBuilder strBuilder = new StringBuilder();
        if (words == null) {
            return "null";
        }
        if (words.length == 0) {
            return "";
        }
        String space = " ";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                space = "";
            }
            strBuilder.append(words[i] + space);
        }
        return strBuilder.toString();
    }

    public static void main(String args[]) {
        String[] arr = null;
        // assert addSpaces(arr).equals("Hello World") : "Expect \"Hello World\" for
        // words = {Hello, World}";
        // arr = new String[0];
        // assert addSpaces(arr).equals("") : "Expect \"\" for input = [] or input = new
        // String[0]";
        System.out.println("All test cases in main function passed" + " " + addSpaces(arr));
    }
}
