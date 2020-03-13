package by.htp.itacademy.decomposition;

import static by.htp.itacademy.util.Util.findGreatestNumber;
import static by.htp.itacademy.util.Util.findSmallestNumber;


// Task #05
// 05. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
public class DecompositionTask05 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #05");
        // TODO

        int x1;
        int x2;
        int x3;

        x1 = 4589;
        x2 = 456;
        x3 = 2587;

        System.out.println("Sum of 'greatest' and 'smallest' of the following numbers:");
        System.out.println("[" + x1 + "]");
        System.out.println("[" + x2 + "]");
        System.out.println("[" + x3 + "]");
        System.out.println("is [" + (findGreatestNumber(x1, x2, x3) +
                findSmallestNumber(x1, x2, x3)) + "]");
    }
}
