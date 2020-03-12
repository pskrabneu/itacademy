package by.htp.itacademy.decomposition;

import static by.htp.itacademy.util.Util.findTheGreatestCommonDivisor;

// Task #02
// 02. Написать метод(методы) для нахождения наибольшего общего делителя и
// наименьшего общего кратного двух натуральных чисел:
public class DecompositionTask02 {

    public static void main(String[] args) {

        int n;
        int m;

        n = 3357585;
        m = 3662208;
        // 1683

        System.out.println("\n>> Task #02");

        System.out.println("Two given numbers: [" + n + "] and " + "[" + m + "]");

        System.out.println("Greatest common divisor: " + findTheGreatestCommonDivisor(n, m));

    }


}
