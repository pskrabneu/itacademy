package by.htp.itacademy.linearprogramming;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
import static java.lang.Math.tan;
import static java.lang.Math.abs;


public class LinearProgrammingP2 {
    public static void main(String[] args) {
        task11(3, 4);
        task12(3, 4, -3, -4);
        task13(0, 0, 3, 0, 3, 4);
        task14(1.0);
        task15();
        task16(1556);
        task17(2, 8);
        task18(3.5);
        task19(6.0);
        task20(9.0);
    }

    // Task #11
    // Вычислить периметр и площадь прямоугольного треугольника по длинам
    // a и b двух катетов
    private static void task11(double a, double b) {

        double c = sqrt(pow(a, 2) + pow(b, 2));

        System.out.println("\n>> Task #11");

        System.out.println("The perimeter of the triangle with:\n" +
                "a = " + a +
                "\nb = " + b +
                "\nc = " + c +
                "\nis " + (a + b + c));
        System.out.println("The area of the triangle is " + ((a * b) / 2));
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
                "\nb = " + b +
                "\nc = " + c);

        if (a != 0 || b != 0 || c != 0) {
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
        System.out.println("Radius of the circle is " + r);
        System.out.println("The length of the circle is " + 2 * PI * r);
        System.out.println("The area of the circle is " + PI * pow(r, 2));
    }


    // Task #15
    // Написать программу, которая выводить на экран первые 4 степени числа "Пи"
    private static void task15() {

        System.out.println("\n>> Task #15");
        for (int x = 1; x < 5; x++) {
            System.out.println("PI^" + x + " = " + pow(PI, x));
        }
    }


    // Task #16
    // Найти произведение цифр 4-значного числа
    private static void task16(int x) {

        int temp;
        int tempFigure;

        temp = 1;

        boolean fourDigits;

        fourDigits = x > 1000 && x < 9999;

        System.out.println("\n>> Task #16");
        if (fourDigits) {

            System.out.print("The product of ");

            for (int i = 1; i < 5; i++) {

                tempFigure = x % 10;

                x = (x - tempFigure) / 10;

                temp = temp * tempFigure;

                System.out.print(tempFigure + " * ");
            }
        } else {
            System.out.println("Please provide a number with 4 digits");
        }

        if (fourDigits) {
            System.out.print("\b\bis " + temp);
        }
    }


    // Task #17
    // Даны 2 числа. Найти среднее арифметическое кубов этих чисел и среднее
    // геометрическое модулей этих чисел
    private static void task17(int x, int y) {

        System.out.println("\n>> Task #17");

        System.out.println("The arithmetic average of " +
                x + "^3" + " and " + y + "^3" + " is " +
                (pow(x, 3) + pow(y, 3)) / 2);

        System.out.println("The geometric average of " +
                x + " and " + y + " is " +
                sqrt(x * y));
    }


    // Task #18
    // Дана длина ребра куба. Найти площадь грани,
    // площадь полной поверхности, и объем этого куба
    private static void task18(double l) {

        double sideArea;

        sideArea = pow(l, 2);

        System.out.println("\n>> Task #18");
        System.out.println("With cube edge = " + l);
        System.out.println(" - area of side = " + sideArea);
        System.out.println(" - area of cube = " + sideArea * 6);
        System.out.println(" - volume of cube = " + pow(l, 3));
    }

    // Task #19
    // Дана сторона равностороннего треугольника. Найти площадь этого
    // треугольника, его высоту, радиусы вписанной и описанной окружности
    private static void task19(double a) {

        double highTriangle;
        double insideRadius;

        insideRadius = tan(PI / 6) * a / 2;

        highTriangle = sqrt(pow(a, 2) - pow((a / 2), 2));

        System.out.println("\n>> Task #19");
        System.out.println("With side of right triangle " + a);
        System.out.println("- the area is " + a * highTriangle / 2);
        System.out.println("- the high is " + highTriangle);
        System.out.println("- the radius of inside circle is " + insideRadius);
        System.out.println("- the radius of outside circle is " + (highTriangle - insideRadius));
    }


    // Task #20
    // Дана длина окружности. Найти площадь круга, ограниченного
    // этой окружностью
    private static void task20(double l) {

        System.out.println("\n>> Task #20");
        System.out.println("With length of circle = " + l +
                "\nthe area = " + pow(l, 2) / (4 * PI));
    }

    // distance between 2 points with given coordinates
    private static double distance(double x1, double y1, double x2, double y2) {
        return sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2), 2));
    }
}
