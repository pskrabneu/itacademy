package by.htp.itacademy.linearprogramming;

import static java.lang.Math.pow;

public class LinearProgrammingP4 {
    public static void main(String[] args) {

        task31(10, 3, 1, 2);
        task32(17, 59, 33,
                21, 57, 38);
        task33('g');
        task34(568989569);
        task35(155848, 6);
        task36(2574);
        task37();
        task38(5, 9);
        task39(10.25);
        task40(5);
    }


    // Task #31
    // Составить программу для вычисления пути, пройденного лодкой, если
    // ее скорость стоячей воде V км/ч, скорость течения реки V1 км/ч,
    // время движения по озеру T1 ч, а против течения реки T2 ч.
    private static void task31(int vBoat, int vRiver, double t, double tStream) {

        System.out.println("\n>> Task #31");
        System.out.println("Distance on lake = " + vBoat * t + " km");
        System.out.println("Distance upstream = " + (vBoat - vRiver) * tStream + " km");
    }


    // Task #32
    // Текущее показание электронных часов:
    // H(0 <= H <= 23) M(0 <= M <= 59) S(0 <= S <= 59). Какое время будут
    // показывать часы через p(ч), q(мин), r(с)?
    private static void task32(int currentH, int currentM, int currentS,
                               int afterH, int afterM, int afterS) {

        int aH;
        int aM;
        int aS;
        int totalSec;

        totalSec = calculateTime(currentH, currentM, currentS) + calculateTime(afterH, afterM, afterS);

        aH = totalSec / 3600;
        totalSec = totalSec - aH * 3600;
        aM = totalSec / 60;
        totalSec = totalSec - aM * 60;
        aS = totalSec;

        System.out.println("\n>> Task #32");
        System.out.println("Current time is " + currentH + ":" +
                currentM + ":" + currentS);
        System.out.println("After " + afterH + ":" + afterM + ":" + afterS);
        System.out.println("its will be " + (aH % 24) + ":" + aM + ":" + aS);
    }


    // Task #33
    // Вывести любой символ и определить его порядковый номер, а также
    // указать предыдущий и последующий символы.
    private static void task33(char c) {

        System.out.println("\n>> Task #33");
        System.out.println("Before char " + (char) (c - 1) + ", " +
                "Current char " + c + ", " +
                "After char " + (char) (c + 1));
    }


    // Task #34
    // Дана величина А, выражающая объем информации в байтах. Перевести А
    // в более крупные единицы измерения информации.
    private static void task34(int a) {

        System.out.println("\n>> Task #34");
        System.out.println(a + " bytes is:");
        System.out.println((a / 1024 + 1) + " kilobytes or");
        System.out.println((a / 1024 / 1024 + 1) + " megabytes");
    }


    // Task #35
    // Даны натуральные числа M и N. Вывести старшую цифру дробной части и
    // младшую цифру целой части числа M / N.
    private static void task35(int m, int n) {

        System.out.println("\n>> Task #35");
        System.out.println((int) (m / n) % 10 + "." + ((int) (((double) m / (double) n) * 10)) % 10);
    }


    // Task #36
    // Найти частное произведений четных и нечетных цифр четырехзначного
    // числа
    private static void task36(int x) {

        int temp;
        int fig1;
        int fig2;
        int fig3;
        int fig4;

        fig1 = x % 10;
        temp = (x - fig1) / 10;
        fig2 = temp % 10;
        temp = (temp - fig2) / 10;
        fig3 = temp % 10;
        fig4 = (temp - fig3) / 10;

        System.out.println("\n>> Task #36");
        System.out.println("Number = " + x);
        System.out.println((double) (fig4 * fig2) / (double) (fig3 * fig1));
    }


    // Task #37
    // Составить линейную программу, печатающее значение true,
    // если указанное высказывание является истиным,
    // и false -- в противном случае:
    private static void task37() {

        System.out.println("\n>> Task #37");

        {// 1* Целое число "N" является четным двузначным числом.

            int x1;
            boolean b1;

            x1 = 52;

            b1 = (x1 % 2 == 0) && (x1 >= 10) && (x1 <= 99);
            System.out.println("1) Число N = " + x1 + " является четным двузначным числом -> " + b1);
        }

        {// 2* Сумма двух первых цифр заданного четырехзначного числа равна сумме
            //      двух его последних цифр

            int x2;
            boolean b2;

            x2 = 1405;

            b2 = ((x2 / 1000) + ((x2 - (x2 / 1000) * 1000) / 100)) == ((x2 / 10) % 10 + x2 % 10);

            System.out.println("2) -> " + b2);
        }

        {// 3* Сумма цифр данного трехзначного числа "N" является четным числом

            int x3;
            boolean b3;
            int temp;

            x3 = 111;

            temp = x3 / 100 + (x3 / 10) % 10 + x3 % 10;

            b3 = temp % 2 == 0;

            System.out.println("3) -> " + b3);
        }

        {// 4* Точка с координатами (x, y) принадлежит части плоскости, лежащей
            //      между прямыми "x = m", "x = n" (m < n)

            double x4;
            double y4;
            int m;
            int n;
            boolean b4;

            x4 = 2.5;
            y4 = 6;
            m = 2;
            n = 5;

            b4 = (x4 >= m) && (x4 <= n);

            System.out.println("4) -> " + b4);
        }

        {// 5* Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа

            int x5;
            int temp5;
            boolean b5;

            x5 = 549;

            temp5 = x5 / 100 + (x5 / 10) % 10 + x5 % 10;

            b5 = pow(x5, 2) == pow(temp5, 3);

            System.out.println("5) -> " + b5);
        }

        {// 6* Треугольник со сторонами a, b, c является равнобедренным
            int a6;
            int b6;
            int c6;
            boolean bl6;

            a6 = 8;
            b6 = 7;
            c6 = 6;

            bl6 = (a6 == b6) || (b6 == c6) || (c6 == a6);

            System.out.println("6) -> " + bl6);
        }

        {// 7* Сумма каких-либо двух цифр заданного трехзначного натурального числа
            //      "N" равна третьей цифре
            int x7;
            int fig1;
            int fig2;
            int fig3;
            boolean b7;

            x7 = 458;

            fig1 = x7 / 100;
            fig2 = (x7 / 10) % 10;
            fig3 = x7 % 10;

            b7 = (fig1 + fig2) == fig3 || (fig2 + fig3) == fig1 || (fig1 + fig3) == fig2;

            System.out.println("7) -> " + b7);
        }

        // 8* Заданное число "N" является степенью числа "a" (показатель степени
        //      может находиться в диапазоне от 0 до 4)
        // TODO

        // 9* График функции y = a * x^2 + b * x + c проходит через заданную точку
        //      с координатами (m, n)
        {
            double a;
            double b;
            double c;
            double m;
            double n;

            a = 2;
            b = -4;
            c = -6;
            m = 4;
            n = 10;

            double fx = a * m * m + b * m + c;

            if (n == fx) {
                System.out.println("The function graph passes through the point");
            } else {
                System.out.println("The function graph doesn't pass through the point");
            }
        }
    }


    // Task #38
    // Для данных областей составить линейную программу, которая печатает
    // true, если точка с координатами (x, y) принадлежит закрашенной области,
    // и false в противном случае:
    // TODO -- три рисунка
    private static void task38(double x, double y) {

        System.out.println("\n>> Task #38");
    }


    // Task #39
    // Дано действительное число "x". Не пользуясь никакими другими
    // арифметическими операциями, кроме умножения, сложения и вычитания,
    // вычислите за минимальное число операций:
    // 2 * x^4 - 3 * x^3 + 4 * x^2 - 5 * x + 6
    private static void task39(double x) {

        double result;

        result = x * x;
        result = 2 * result * result - 3 * result * x + 4 * result - 5 * x + 6;

        System.out.println("\n>> Task #39");
        System.out.println("Result of operation = " + result);
    }


    // Task #40
    // Дано значение "x". Получить значение:
    // -2 * x + 3 * x^2 - 4 * x^3
    // 1 + 2 * x + 3 * x^2 + 4 * x^3
    // Позаботьтесь об экономии операций
    private static void task40(int x) {

        int p1;
        int p2;
        int p3;

        p1 = 2 * x;
        p2 = 3 * x * x;
        p3 = 4 * x * x * x;

        System.out.println("\n>> Task #40");
        System.out.println("First equation = " + (-p1 + p2 - p3));
        System.out.println("Second equation = " + (1 + p1 + p2 + p3));
    }

    private static int calculateTime(int hrs, int min, int sec) {
        return (hrs * 3600 + min * 60 + sec) % 86400;
    }
}
