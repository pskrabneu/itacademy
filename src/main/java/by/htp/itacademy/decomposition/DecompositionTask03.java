package by.htp.itacademy.decomposition;

import static by.htp.itacademy.util.Util.findTheGreatestCommonDivisor;

// Task #03
// 03. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class DecompositionTask03 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #03");

        int x1;
        int x2;
        int x3;
        int x4;

        x1 = 14451360;
        x2 = 471240;
        x3 = 27991656;
        x4 = 3659040;

        int greatestDivisor1;
        int greatestDivisor2;
        int finalGreatestDivisor;

        greatestDivisor1 = findTheGreatestCommonDivisor(x1, x2);
        greatestDivisor2 = findTheGreatestCommonDivisor(x3, x4);

        finalGreatestDivisor = findTheGreatestCommonDivisor(greatestDivisor1, greatestDivisor2);

        System.out.println("The Greatest Common Divisor of the numbers: ");
        System.out.println("[" + x1 + "]");
        System.out.println("[" + x2 + "]");
        System.out.println("[" + x3 + "]");
        System.out.println("[" + x4 + "]");
        System.out.println("is [" + finalGreatestDivisor + "]");
    }
}
