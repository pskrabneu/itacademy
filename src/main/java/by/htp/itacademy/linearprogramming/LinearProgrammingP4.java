package by.htp.itacademy.linearprogramming;

public class LinearProgrammingP4 {
    public static void main(String[] args) {

        task31(10, 3, 1, 2);
        task32(17, 59, 33,
                21, 57, 38);
//        task33();
//        task34();
//        task35();
//        task36();
//        task37();
//        task38();
//        task39();
//        task40();

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
    }


    // Task #34
    // Дана величина А, выражающая объем информации в байтах. Перевести А
    // в более крупные единицы измерения информации.
    private static void task34(int a) {

        System.out.println("\n>> Task #34");
    }


    // Task #35
    // Даны натуральные числа M и N. Вывести старшую цифру дробной части и
    // младшую цифру целой части числа M / N.
    private static void task35(int m, int n) {

        System.out.println("\n>> Task #35");
    }


    // Task #36
    // Найти частное произведений четных и нечетных цифр четырехзначного
    // числа
    private static void task36(int x) {

        System.out.println("\n>> Task #36");
    }


    // Task #37
    // Составить линейную программу, печатающее значение true,
    // если указанное высказывание является истиным,
    // и false -- в противном случае:
    // 1* Целое число "N" является четным двузначным числом.
    // 2* Сумма двух первых цифр заданного четырехзначного числа равна сумме
    //      двух его последних цифр
    // 3* Сумма цифр данного трехзначного числа "N" является четным числом
    // 4* Точка с координатами (x, y) принадлежит части плоскости, лежащей
    //      между прямыми "x = m", "x = n" (m < n)
    // 5* Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
    // 6* Треугольник со сторонами a, b, c является равнобедренным
    // 7* Сумма каких-либо двух цифр заданного трехзначного натурального числа
    //      "N" равна третьей цифре
    // 8* Заданное число "N" является степенью числа "a" (показатель степени
    //      может находиться в диапазоне от 0 до 4)
    // 9* График функции y = a * x^2 + b * x + c проходит через заданную точку
    //      с координатами (m, n)
    private static void task37() {

        System.out.println("\n>> Task #37");
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

        System.out.println("\n>> Task #39");
    }


    // Task #40
    // Дано значение "x". Получить значение:
    // -2 * x + 3 * x^2 - 4 * x^3
    // 1 + 2 * x + 3 * x^2 + 4 * x^3
    // Позаботьтесь об экономии операций
    private static void task40(int x) {

        System.out.println("\n>> Task #40");
    }

    private static int calculateTime(int hrs, int min, int sec) {
        return (hrs * 3600 + min * 60 + sec) % 86400;
    }


}
