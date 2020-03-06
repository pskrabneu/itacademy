package by.htp.itacademy.loops;

public class LoopsP1 {

    public static void main(String[] args) {

//        task01();
//        task02();
//        task03();
        task04();
//        task05();
//        task06();
//        task07();
//        task08();
//        task09();
//        task10();
    }

    // Task #01
    // 1. Необходимо вывести на экран числа от 1 до 5.
    private static void task01() {

        System.out.println("\n>> Task #01");

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }


    // Task #02
    // 2. Необходимо вывести на экран числа от 5 до 1.
    private static void task02() {

        System.out.println("\n>> Task #02");

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }


    // Task #03
    // 3. Необходимо вывести на экран таблицу умножения на 3:
    private static void task03() {

        System.out.println("\n>> Task #03");
        System.out.println("     x");
        System.out.println(" y | 1   2   3");
        System.out.println("---|-----------");

        for (int y = 1; y < 4; y++) {
            System.out.print(" " + y + " |");
            for (int x = 1; x < 4; x++) {
                System.out.print(" " + x * y + "  ");
            }
            System.out.print("\n");
        }
    }

    // Task #04
    // 4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
    // включительно.
    private static void task04() {

        System.out.println("\n>> Task #04");

        int x = 2;

        while (x <= 100) {
            System.out.println(x);

            x = x + 2;
        }
    }

    // Task #05
    // 5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в
    // диапазоне от 1 до 99 включительно.
    private static void task05() {

        System.out.println("\n>> Task #05");
        // TODO
    }


    // Task #06
    // 6. Напишите программу, где пользователь вводит любое целое положительное число. А программа
    // суммирует все числа от 1 до введенного пользователем числа.
    private static void task06(int x) {

        System.out.println("\n>> Task #06");
        // TODO
    }


    // Task #07
    // 7. Вычислить значения функции на отрезке [а,b] c шагом h:
    private static void task07(int a, int b, int h) {

        System.out.println("\n>> Task #07");
        // TODO
    }


    // Task #08
    // 8. Вычислить значения функции на отрезке [а,b] c шагом h:
    private static void task08(int a, int b, int h) {

        System.out.println("\n>> Task #08");
        // TODO
    }


    // Task #09
    // 9. Найти сумму квадратов первых ста чисел.
    private static void task09() {

        System.out.println("\n>> Task #09");
        // TODO
    }


    // Task
    // 10. Составить программу нахождения произведения квадратов первых двухсот чисел.
    private static void task10() {

        System.out.println("\n>> Task #10");
        // TODO
    }
}
