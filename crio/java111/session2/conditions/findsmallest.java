package crio.java111.session2.conditions;

public class findsmallest {
    public static int findSmallest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > c) {
            return b;
        } else {
            return c;
        }

    }

    public static void main(String args[]) {
        assert (findSmallest(1, 9, 78) == 1) : "Expect 1 for a = 1, b = 9, c = 78";
        System.out.println("All test cases in main function passed");

    }
}
