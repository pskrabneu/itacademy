package by.htp.itacademy.linearprogramming;

public class LinearProgrammingP1 {
    public static void main(String[] args) {
        task01();
        task02(11);
        task03(2, 12);

    }

    // Task #01
    // Даны 2 действительных (float / double) числа x и y. Вычислить их сумму, разность, произведение, частное.
    private static void task01() {
        double x;
        double y;

        x = 3.5;
        y = 4.8;

        System.out.println(">> Task #01");

        // Sum
        System.out.println("Sum: x + y = " + (x + y));

        // Difference
        System.out.println("Difference: x - y = " + (x - y));

        // Multiply
        System.out.println("Multiply: x * y = " + (x * y));

        // Division
        System.out.println("Division: x / y = " + (x / y));
    }

    // Task #02
    // Найти значение функции: c = 3 + a
    private static void task02(int a) {
        System.out.println("\n>> Task #02");
        System.out.println("c" + "(" + a + ") = " + Math.addExact(a, 3));
    }

    // Task #03
    // Найти значение функции: z = 2 * x + (y - 2) * 5
    private static void task03(int x, int y) {
        int z;

        z = Math.multiplyExact(2, x) + Math.multiplyExact(Math.addExact(y, -2), 5);

        System.out.println("\n>> Task #03");
        System.out.println("if x = " + x + " and y = " + y + " then z = " + z);
    }

    // Task #04
    // Найти значение функции: z = ((a - 3) * b / 2) + c
    private static void task04(int a, int b, int c) {
        float z;


    }


    // Task #05
    // Составить алгоритм нахождения среднего арифметического двух чисел

    // Task #06
    // Написать код: в 'n' малых бидонах 80л молока. Сколько литров молока в 'm' больших
    // бидонах, если в каждом большом бидоне на 12л больше, чем в малом?
    private static void task04(int n, int m) {

    }

    // Task #07
    // Дан прямоугольник, ширина которого в 2 раза меньше длины. Найти площадь прямоугольника.

    // Task #08
    // Вычислить значение выражения по формуле
    // (все переменные принимают действительные значения):
    //((b + sqrt(b^2 + 4 * a * c)) / (2 * a)) - (a^3 + b^(-2))


    // Task #09
    // Вычислить значение выражения по формуле
    // (все переменные принимают действительные значения):
    // (a * b) / (c * d) - ((a * b) - c) / (c * d)


    // Task #10
    // Вычислить значение выражения по формуле
    // (все переменные принимают действительные значения):
    // (sin(x) + cos(y) / (cos(x) - sin(y) * (tg(x * y))


    // Task #11
    // Вычислить периметр и площадь прямоугольного треугольника по длинам
    // a и b двух катетов


    // Task #12
    // Вычислить расстояние между двумя точками с данными координатами
    // (x1, y1) и (x2, y2)


    // Task #13
    // Заданы координаты 3-х вершин треугольника (x1, y2), (x2, y2), (x3, y3).
    // Найти его периметр и площадь


    // Task #14
    // Вычислить длину окружности и площадь круга
    // одного и того же заданного радиуса R

    // Task #15
    // Написать программу, которая выводить на экран первые 4 степени числа ПИ


    // Task #16
    // НАйти произведение цифр 4-значного числа

    // Task #17
    // Даны 2 числа. Найти среднее арифметическое кубов этих чисел и среднее
    // геометрическое модулей этих чисел


    // Task #18
    // Дана длина ребра куба. Найти площадь грани,
    // площадь полной поверхности,
    //















}
