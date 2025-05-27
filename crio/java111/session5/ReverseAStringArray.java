package crio.java111.session5;

public class ReverseAStringArray {
    public static void printArray(String[] str) {
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " : ");
        }
        System.out.println();
    }

    public static void reverseArray(String[] arr) {
        printArray(arr);
        for (int i = 0; i < (int) arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        printArray(arr);

    }

    public static void main(String[] args) {

        reverseArray(new String[] { "1", "2", "3", "4", "5" });
        reverseArray(new String[] { "1", "2", "3", "4" });
    }
}
