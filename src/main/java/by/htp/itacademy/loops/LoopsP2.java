package by.htp.itacademy.loops;

import static java.lang.Math.pow;

public class LoopsP2 {

    public static void main(String[] args) {
//        task11();
//        task12();
//        task13();
        task14();
//        task15();
//        task16();
//        task17();
//        task18();
//        task19();
//        task20();
    }


    // Task #11
    // 11. Составить программу нахождения разности кубов первых двухсот чисел
    private static void task11() {

        System.out.println("\n>> Task #11");
        // TODO
    }




    // Task #12
    // 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
    //нахождения произведения первых 10 членов этой последовательности.
    private static void task12() {

        System.out.println("\n>> Task #02");
        // TODO
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
    private static void task14() {

        System.out.println("\n>> Task #14");

        double x;
        double sum;

        x = 1;

        while (x < 1) {
        }
        // TODO
    }




    // Task #15
    // 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
    private static void task15() {

        System.out.println("\n>> Task #15");
        // TODO
    }


    // Task #16
    // 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
    private static void task16(int x) {

        System.out.println("\n>> Task #16");
        // TODO
    }


    // Task #17
    // 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
    private static void task17(int a, int b, int h) {

        System.out.println("\n>> Task #17");
        // TODO
    }


    // Task #18
    // 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
    // модуль которых больше или
    // равен заданному е. Общий член ряда имеет вид:
    private static void task18(int a, int b, int h) {

        System.out.println("\n>> Task #18");
        // TODO
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

}
