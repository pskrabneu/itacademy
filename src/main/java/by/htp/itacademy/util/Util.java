package by.htp.itacademy.util;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

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


    // calculate area of a triangle with given 3 sides
    // with Heron formula
    public static double calculateAreaOfTriangle(double a, double b, double c) {

        double halfPerimeter;

        halfPerimeter = (a + b + c) / 2;

        return sqrt(halfPerimeter * (halfPerimeter - a) *
                (halfPerimeter - b) * (halfPerimeter - c));
    }

    // distance between 2 points with given coordinates
    public static double distance(double x1, double y1,
                                  double x2, double y2) {
        return sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2), 2));
    }


    // calculate Time
    // returns qty of secs of given time
    public static int calculateTime(int hrs, int min, int sec) {
        return (hrs * 3600 + min * 60 + sec) % 86400;
    }


}
