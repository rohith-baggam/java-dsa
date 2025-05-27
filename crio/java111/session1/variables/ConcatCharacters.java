package crio.java111.session1.variables;

import java.util.Scanner;

public class ConcatCharacters {
    public static char[] inputCharArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] charArray = new char[n];

        for (int i = 0; i < n; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        scanner.close();
        return charArray;
    }

    public static void main(String[] args) {
        char[] charArray = inputCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            str.append(charArray[i]);
        }
        System.out.println("Concatinated String " + str);
    }
}
