package crio.java111.session5;

public class SearchTarget {
    public static int searchTarget(int length, int[] array, int target) {
        for (int i = 0; i < length; i++) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        assert (1 == searchTarget(5, new int[] { 13, 7, 5, 3, 1 }, 7));
        // assert (-1 == searchTarget(5, new int[] { 13, 7, 5, 3, 1 }, 8));
        System.out.println("All test cases in main function passed");
    }
}
