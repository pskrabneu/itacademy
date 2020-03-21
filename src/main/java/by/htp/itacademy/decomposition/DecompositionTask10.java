package by.htp.itacademy.decomposition;

import static by.htp.itacademy.util.Util.factorial;

// Task #10
// 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class DecompositionTask10 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #10");

        long temp = 0;

        for (int i = 1; i <= 9; i += 2) {

            temp += factorial(i);
        }

        System.out.println("Sum of factorials odd numbers from 1 to 9 = " + temp);
    }
}
