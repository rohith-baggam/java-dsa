package crio.java111.session2.loops;

public class PrimeNumber {
    public static boolean checkPrime(int n) {

        if (n == 0 || n == 1) {
            return false;
        }
        int increment = n > 0 ? 1 : -1;
        int i = n - 1;
        while (i != 1) {
            if (n % i == 0) {
                System.out.println(i);
                return false;
            }
            i = i - increment;
        }
        return true;
    }

    public static void main(String args[]) {
        int n = 7;
        boolean answer = checkPrime(n);
        System.out.println(answer);

        int[] arr = { 1, 2, 3 };
        int[] brr = { 4, 5, 6 };
        int[] c = arr.length > brr.length ? arr : brr;
        assert answer == true : "Expect true for n = 3";
        System.out.println("All test cases in main function passed");
    }
}
