package by.htp.itacademy.util;

public class Util {


    // Find figures for any int number
    // and append them to StringBuilder
    public static StringBuilder findFigures(int x) {

        int n;

        StringBuilder sb = new StringBuilder();

        while (x >= 1) {
            n = x % 10;

            sb.append(n);

            x = (x - n) / 10;
        }

        return sb;
    }


    // Find dividers for any int number and print them
    public static void findDividers(int x) {

        for (int i = 1; i <= x; i++) {

            if (x % i == 0 && i != 1 && i != x) {

                System.out.printf("%d ", i);
            }
        }
    }

    // Find factorial for int number and
    // return long number
    public static long factorial(int n) {

        long result;

        if (n == 0 || n == 1) {
            return 1;
        } else {
            result = factorial(n - 1) * n;
            return result;
        }
    }


}
