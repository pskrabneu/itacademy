package by.htp.itacademy.loops;

public class Util {

    protected static StringBuilder findFigures(int x) {

        int n;

        StringBuilder sb = new StringBuilder();

        while (x >= 1) {
            n = x % 10;

            sb.append(n);

            x = (x - n) / 10;
        }

        return sb;
    }

    protected static void findDividers(int x) {

        for (int i = 1; i <= x; i++) {

            if (x % i == 0 && i != 1 && i != x) {

                System.out.printf("%d ", i);
            }
        }
    }

    protected static long factorial(int n) {

        long result;

        if (n == 0 || n == 1) {
            return 1;
        } else {
            result = factorial(n - 1) * n;
            return result;
        }
    }


}
