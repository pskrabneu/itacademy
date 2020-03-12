package by.htp.itacademy.loops;

import java.util.Scanner;

import static by.htp.itacademy.util.Util.findDivisors;
import static by.htp.itacademy.util.Util.findFigures;
import static by.htp.itacademy.util.Util.factorial;

import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.StrictMath.tan;

public class LoopsP3 {

    public static void main(String[] args) {

//        task21(0.5, 5.6, 0.1);
//        task22(0.2, 6.5, 0.01);
//        task23(0.3, 5.8, 0.02);
//        task24();
//        task25();
//        task26();
//        task27();
//        task28();
        task29(1458, 4120580);
//        task30();

    }

    // Task #21
    // 21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
    //представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
    //значения функции:
    //F(x) = x −sin(x)
    private static void task21(double a, double b, double h) {

        System.out.println("\n>> Task #21");

        double temp;

        System.out.println(" x     | y");

        for (double i = a; i <= b; i = i + h) {

            temp = i - sin(i);

            System.out.printf("%.3f  | %.3f  %n", i, temp);
        }
    }


    // Task #22
    //22. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
    //представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
    //значения функции:
    //F(x) = sin2(x)
    private static void task22(double a, double b, double h) {

        System.out.println("\n>> Task #22");

        double temp;

        System.out.println(" x     | y");

        for (double i = a; i <= b; i = i + h) {

            temp = pow(sin(i), 2);

            System.out.printf("%.3f  | %.3f  %n", i, temp);
        }
    }


    // Task #23
    // 23. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
    //представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
    //значения функции:
    private static void task23(double a, double b, double h) {

        System.out.println("\n>> Task #23");

        double temp;

        System.out.println(" x     | y");

        for (double i = a; i <= b; i = i + h) {

            temp = 1 / (tan(i / 3)) + 0.5 * sin(i);

            System.out.printf("%.3f  | %.3f  %n", i, temp);
        }
    }

    // Task #24
    // 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
    // его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
    // числом.
    private static void task24() {

        System.out.println("\n>> Task #24");

        // TODO
    }


    // Task #25
    // 25. Требуется определить факториал числа, которое ввел пользователь.
    private static void task25() {

        Scanner sc = new Scanner(System.in);

        String errorMes = "Enter number from 0 to 20";

        System.out.println("\n>> Task #25");
        System.out.println(errorMes);

        while (!sc.hasNext("[0-9]|1[0-9]|2[0]")) {

            String in = sc.next();

            System.out.println("This is not correct: " + in);
            System.out.println(errorMes);
        }

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }


    // Task #26
    // 26. Вывести на экран соответствий между символами и их численными обозначениями в памяти
    // компьютера (Таблицу ASCII).
    private static void task26() {

        char begin = 'A';
        char end = 'z';

        System.out.println("\n>> Task #26");

        for (int i = begin; i <= end; i++) {
            System.out.println((char) i + " = " + i);
        }
    }


    // Task #27
    // 27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
    // самого числа. m и n вводятся с клавиатуры.
    private static void task27() {

        String messageM = "Enter number 'M' from 4 to 1000";
        String messageN = "Enter number 'N' from 4 to 1000 more than 'M'";

        Scanner sc = new Scanner(System.in);

        System.out.println("\n>> Task #27");

        System.out.println(messageM);

        String rangeNumbers = "([4-9]|[1-8][0-9]|9[0-9]|[1-8][0-9]{2}|9[0-8][0-9]|99[0-9]|1000)";

        while (!sc.hasNext(rangeNumbers)) {

            String in = sc.next();

            System.out.println("This is not correct: " + in);
            System.out.println(messageM);
        }

        int m = sc.nextInt();

        System.out.println(messageN);

        while (!sc.hasNext(rangeNumbers)) {

            String in = sc.next();

            System.out.println("This is not correct: " + in);
            System.out.println(messageN);
        }

        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print("Dividers for " + i + " --> ");
            System.out.print(findDivisors(i));
            System.out.println("");
        }
    }


    // Task #28
    // 28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
    //результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
    //также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
    //перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять = 0.
    private static void task28() {

        System.out.println("\n>> Task #28");
        // TODO
    }


    // Task #29
    // 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    private static void task29(int x, int y) {

        System.out.println("\n>> Task #29");

        System.out.println(x + " consists of -> " + findFigures(x));
        System.out.println(y + " consists of -> " + findFigures(y));
    }

    // Task #30
    // 30. Написать программу, переводящую римские цифры в арабские.
    private static void task30() {

        System.out.println("\n>> Task #30");
        // TODO
    }
}
