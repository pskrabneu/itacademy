package by.htp.itacademy.decomposition;

import static by.htp.itacademy.util.Util.findTheLeastCommonMultiple;


// Task #04
// 04. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
public class DecompositionTask04 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #04");
        // TODO

        int x1;
        int x2;
        int x3;

        x1 = 77280;
        x2 = 27720;
        x3 = 1646568;

        long temp;
        long leastCommonMultiple;

        temp = findTheLeastCommonMultiple(x1, x2);

        leastCommonMultiple = findTheLeastCommonMultiple(temp, x3);

        System.out.println("The Least Common Multiple of the numbers: ");
        System.out.println("[" + x1 + "]");
        System.out.println("[" + x2 + "]");
        System.out.println("[" + x3 + "]");
        System.out.println("is [" + leastCommonMultiple + "]");
    }
}
