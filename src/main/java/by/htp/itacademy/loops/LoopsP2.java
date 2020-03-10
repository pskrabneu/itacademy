package by.htp.itacademy.loops;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class LoopsP2 {

    public static void main(String[] args) {
//        task11();
//        task12();
//        task13();
//        task14(6);
//        task15();
//        task16();
//        task17(5.5, 5);
        task18(0.021);
//        task19();
//        task20();
    }


    // Task #11
    // 11. Составить программу нахождения разности кубов первых двухсот чисел
    private static void task11() {

        System.out.println("\n>> Task #11");

        int temp;

        for (int i = 2; i <= 200; i++) {

            temp = (int) (pow(i, 3) - pow((i - 1), 3));

            System.out.println(i + "^3 - " + (i - 1) + "^3 = " + temp);
        }
    }


    // Task #12
    // 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
    //нахождения произведения первых 10 членов этой последовательности.
    private static void task12() {

        long temp = 1;

        System.out.println("\n>> Task #12");

        for (int i = 2; i <= 10; i++) {
            temp = temp * sequenceFor12(i);
        }
        System.out.println("Result = " + temp);
    }


    // Task #13
    // 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
    private static void task13() {

        System.out.println("\n>> Task #13");
        System.out.println(" x\t\t|  y     ");
        System.out.println("__________________");

        double y;

        for (double x = -5; x <= 5; x = x + 0.5) {
            y = 5 - pow(x, 2) / 2;

            System.out.println(" " + x + "\t|  " + y);
        }
    }

    // Task #14
    // 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
    private static void task14(int n) {

        System.out.println("\n>> Task #14");

        double sum;
        sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (1 / (double) i);
        }

        System.out.println("Result = " + sum);
    }


    // Task #15
    // 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
    private static void task15() {

        System.out.println("\n>> Task #15");

        int sum;
        sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum = sum + (int) pow(2, i);
        }

        System.out.println("Result is = " + sum);
    }


    // Task #16
    // 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
    private static void task16() {

        System.out.println("\n>> Task #16");

        long prod;

        prod = 1;

        for (int i = 1; i <= 9; i++) {
            prod = prod * sequenceFor16(i);
        }

        System.out.println("Result = " + prod);
    }


    // Task #17
    // 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
    private static void task17(double a, int n) {

        System.out.println("\n>> Task #17");
        // TODO
    }


    // Task #18
    // 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
    // модуль которых больше или
    // равен заданному е. Общий член ряда имеет вид:
    private static void task18(double e) {

        System.out.println("\n>> Task #18");

        int i;
        double sum;
        double temp;

        i = 1;
        sum = 0;
        temp = 0;

        do {
            sum = sum + temp;

            temp = abs(sequenceFor18(i));

            i = i + 1;
        } while (e <= temp);

        System.out.println("Result = " + sum);
        System.out.println("And i = " + i);
    }


    // Task #19
    // 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
    // модуль которых больше или
    // равен заданному е. Общий член ряда имеет вид:
    private static void task19() {

        System.out.println("\n>> Task #19");
        // TODO
    }

    // Task #20
    // 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
    //равен заданному е. Общий член ряда имеет вид:
    private static void task20() {

        System.out.println("\n>> Task #20");
        // TODO

    }

    private static int sequenceFor12(int n) {

        if (n == 1) {
            return 1;
        }
        return 6 + sequenceFor12(n - 1);
    }

    private static int sequenceFor16(int n) {
        if (n == 1) {
            return 3;
        }
        return (1 + sequenceFor16(n - 1) + n);
    }

    private static double sequenceFor18(int x) {
        return pow(-1, x - 1) / (double) x;
    }

}
