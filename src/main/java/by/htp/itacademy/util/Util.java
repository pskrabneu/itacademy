package by.htp.itacademy.util;

import java.util.Random;
import java.util.LinkedList;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

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

    // calculate distance between 2 Points
    public static double distanceBetweenTwoPoints(Point p1, Point p2) {

        return distance(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }


    // calculate Time
    // returns qty of secs of given time
    public static int calculateTime(int hrs, int min, int sec) {
        return (hrs * 3600 + min * 60 + sec) % 86400;
    }


    // Finding all divisors of given number
    public static LinkedList<Integer> findDivisors(int x) {

        LinkedList<Integer> listDivisors = new LinkedList<>();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {

                listDivisors.add(i);
            }
        }

        return listDivisors;
    }

    // Finding the "greatest common divisor" of two given integers
    public static int findTheGreatestCommonDivisor(long n, long m) {

        LinkedList<Integer> listDivisorsN = new LinkedList<>();
        LinkedList<Integer> listDivisorsM = new LinkedList<>();

        LinkedList<Integer> listDivisorsMinSize = new LinkedList<>();
        LinkedList<Integer> listDivisorsMaxSize = new LinkedList<>();

        listDivisorsN.addAll(findDivisors((int) n));
        listDivisorsM.addAll(findDivisors((int) m));

        // minimal size of 2 arrays
        int minArrayListSize;
        minArrayListSize = Math.min(listDivisorsN.size(), listDivisorsM.size());

        if (listDivisorsM.size() <= listDivisorsN.size()) {

            listDivisorsMinSize.addAll(listDivisorsM);
            listDivisorsMaxSize.addAll(listDivisorsN);
        } else {

            listDivisorsMinSize.addAll(listDivisorsN);
            listDivisorsMaxSize.addAll(listDivisorsM);
        }

        int greatestCommonDivisor = 1;
        int temp;

        for (int i = minArrayListSize - 1; i >= 0; i--) {

            temp = listDivisorsMinSize.get(i);

            if (listDivisorsMaxSize.contains(temp)) {
                greatestCommonDivisor = temp;
                break;
            }
        }

        return greatestCommonDivisor;
    }

    // find Least Common Multiple of two numbers
    public static long findTheLeastCommonMultiple(long n, long m) {

        long multiplied;
        long gcd;

        gcd = findTheGreatestCommonDivisor(n, m);
        multiplied = n * m;

        return multiplied / gcd;
    }

    // find the greatest from 3 numbers
    public static int findGreatestNumber(int x1, int x2, int x3) {

        return max(x1, max(x2, x3));
    }

    // find the smallest from 3 numbers
    public static int findSmallestNumber(int x1, int x2, int x3) {

        return min(x1, min(x2, x3));
    }

    // calculate quantity of connections between n points
    public static int calculateConnectionsBetweenPoints(int n) {

        int qty;

        if (n % 2 == 0) {
            qty = n * ((n - 1) / 2) + n / 2;

        } else {

            qty = n * ((n - 1) / 2);
        }

        return qty;
    }

    // return random int number from min to max (inclusive)
    public static int getRandomNumber(int min, int max) {

        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
    }

    // print 1 dim array
    public static void print1DimArray(int[] array) {

        int sizeArray;

        sizeArray = array.length;

        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\b\b");
    }

    // print 2 dim array
    public static void print2DimArray(int[][] array) {

        int sizeArray;

        sizeArray = array.length;

        for (int i = 0; i < sizeArray; i++) {
            print1DimArray(array[i]);
        }
    }


}
