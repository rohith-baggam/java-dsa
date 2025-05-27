package crio.java111.session1.variables;

import java.util.Scanner;

public class CubeOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        long CubeOfANumber = number * number * number;
        System.out.println("Cube of " + number + " : " + CubeOfANumber);
    }
}
