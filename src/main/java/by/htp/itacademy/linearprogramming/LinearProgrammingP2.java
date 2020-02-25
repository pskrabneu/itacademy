package by.htp.itacademy.linearprogramming;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class LinearProgrammingP2 {
    public static void main(String[] args) {
//        task11(3,4);
//        task12(3, 0, 0, 4);
        task13(0, 0, 0, 6, 10, 0); //???
//        task14();
//        task15();
//        task16();
//        task17();
//        task18();
//        task19();
//        task20();
    }

    // Task #11
    // Вычислить периметр и площадь прямоугольного треугольника по длинам
    // a и b двух катетов
    private static void task11(double a, double b) {

        double c = sqrt(pow(a, 2) + pow(b, 2));

        System.out.println("\n>> Task #11");

        System.out.println("The perimeter of triangle with\n" +
                "a = " + a +
                "\nb = " + b +
                "\nc = " + c +
                "\nis " + (a + b + c));
        System.out.println("The square of triangle is " + ((a * b) / 2));
    }


    // Task #12
    // Вычислить расстояние между двумя точками с данными координатами
    // (x1, y1) и (x2, y2)
    private static void task12(double x1, double y1, double x2, double y2) {

        System.out.println("\n>> Task #12");
        System.out.println("The distance between 2 points is " +
                distance(x1, y1, x2, y2));
    }


    // Task #13
    // Заданы координаты 3-х вершин треугольника (x1, y2), (x2, y2), (x3, y3).
    // Найти его периметр и площадь
    private static void task13(double x1, double y1,
                              double x2, double y2,
                              double x3, double y3) {

        double a;
        double b;
        double c;
        double halfP;

        a = distance(x1, y1, x2, y2);
        b = distance(x2, y2, x3, y3);
        c = distance(x3, y3, x1, y1);

        System.out.println("\n>> Task #13");
        System.out.println("a = " + a +
                "b = " + b +
                "c = " + c);

        if (a == 0 || b == 0 || c == 0) {
            halfP = (a + b + c) / 2;

            System.out.println("The perimeter of the triangle is " + halfP * 2);
            System.out.println("The area of the triangle is " + sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c)));
        } else {
            System.out.println("The figure with given coordinates is NOT triangle");
        }
    }


    // Task #14
    // Вычислить длину окружности и площадь круга
    // одного и того же заданного радиуса R
    private static void task14(double r) {

        System.out.println("\n>> Task #14");
    }


    // Task #15
    // Написать программу, которая выводить на экран первые 4 степени числа "Пи"
    private static void task15() {

        System.out.println("\n>> Task #15");

    }



    // Task #16
    // НАйти произведение цифр 4-значного числа
    private static void task16(int x) {

        System.out.println("\n>> Task #16");

    }


    // Task #17
    // Даны 2 числа. Найти среднее арифметическое кубов этих чисел и среднее
    // геометрическое модулей этих чисел
    private static void task17(int x, int y) {

        System.out.println("\n>> Task #17");

    }


    // Task #18
    // Дана длина ребра куба. Найти площадь грани,
    // площадь полной поверхности, и объем этого куба
    private static void task18(double l) {

        System.out.println("\n>> Task #18");

    }

    // Task #19
    // Дана сторона равностороннего треугольника. Найти площадь этого
    // треугольника, его высоту, радиусы вписанной и описанной окружности
    private static void task19(double a) {

        System.out.println("\n>> Task #19");

    }


    // Task #20
    // Дана длина окружности. Найти площадь круга, ограниченного
    // этой окружностью
    private static void task20(double l) {

        System.out.println("\n>> Task #20");

    }

    // distance between 2 points with given coordinates
    private static double distance(double x1, double y1, double x2, double y2) {
        return sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2), 2));
    }
}
