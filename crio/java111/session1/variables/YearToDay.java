package crio.java111.session1.variables;

import java.util.Scanner;

public class YearToDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        int days = 365;
        System.out.println("No of days for " + year + "year's are " + year * days);

    }

}
