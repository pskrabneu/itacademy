package by.htp.itacademy.conditions;

import static by.htp.itacademy.util.Util.calculateAreaOfTriangle;
import static by.htp.itacademy.util.Util.distance;

public class ConditionsBranchingP2 {

    public static void main(String[] args) {

        task11(5.5, 9.4, 7.5,
                8.8, 6.5, 7.8);
        task12(1.8, -4.4, 5.4);
        task13(1, 8, 4, 6);
        task14(35, 55);
        task15(5, 7);
        task16(1, -6);
        task17(8, 3);
        task18(-3, -7, -4);
        task19(-2.5, 8, 9.3);
        task20(16, 25, 28,2);
    }

    // Task #11
    // 11. Составить программу, которая определит площадь какого треугольника больше.
    private static void task11(double a1, double b1, double c1,
                               double a2, double b2, double c2) {

        double area1;
        double area2;

        area1 = calculateAreaOfTriangle(a1, b1, c1);
        area2 = calculateAreaOfTriangle(a2, b2, c2);

        System.out.println("\n>> Task #11");

        if (area1 > area2) {
            System.out.println("Area of the first triangle is more");
        } else if (area1 < area2) {
            System.out.println("Area of the second triangle is more");
        } else {
            System.out.println("Areas of both triangle are equal");
        }
    }


    // Task #12
    // 12. Даны три действительных числа. Возвести в квадрат те из них,
    // значения которых неотрицательны, и в четвертую
    // степень — отрицательные.
    private static void task12(double a, double b, double c) {

        System.out.println("\n>> Task #12");

        double[] elem = new double[3];

        elem[0] = a;
        elem[1] = b;
        elem[2] = c;

        for (double item :
                elem) {
            if (item >= 0) {
                System.out.println(item + "^2 = " + Math.pow(item, 2));
            } else {
                System.out.println(item + "^4 = " + Math.pow(item, 4));
            }
        }
    }


    // Task #13
    // 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
    // которая из точек находится ближе к
    // началу координат.
    private static void task13(double x1, double y1, double x2, double y2) {

        double d1;
        double d2;

        d1 = distance(x1, y1, 0, 0);
        d2 = distance(x2, y2, 0, 0);

        System.out.println("\n>> Task #13");

        if (d1 > d2) {
            System.out.println("A point is far from 0:0 then B");
        } else if (d1 < d2) {
            System.out.println("B point is far from 0:0 then A");
        } else {
            System.out.println("Points A and B locate on the same distance from 0:0");
        }
    }


    // Task #14
    // 14. Даны два угла треугольника (в градусах). Определить,
    // существует ли такой треугольник, и если да, то будет ли он
    // прямоугольным.
    private static void task14(double alpha, double betha) {

        System.out.println("\n>> Task #14");

        double sumAngls;
        sumAngls = alpha + betha;

        if (sumAngls < 180) {
            System.out.println("Triangle with angles:" +
                    " " + alpha + ", " + betha + ", " + (180 - sumAngls) + " is existed");

            if (sumAngls == 90) {
                System.out.println("And this is right triangle!");
            }
        } else {
            System.out.println("Triangle is not existed");
        }
    }

    // Task #15
    // 15. Даны действительные числа х и у, не равные друг другу.
    // Меньшее из этих двух чисел заменить половиной их
    // суммы, а большее — их удвоенным произведением.
    private static void task15(double x, double y) {

        System.out.println("\n>> Task #15");

        double halfSum;
        double doubledProd;

        halfSum = (x + y) / 2;
        doubledProd = x * y * 2;

        if (x > y) {
            y = halfSum;
            x = doubledProd;
        } else {
            x = halfSum;
            y = doubledProd;
        }

        System.out.println("Less number = " + halfSum);
        System.out.println("Bigger number = " + doubledProd);
    }

    // Task #16
    // 16. На плоскости ХОY задана своими координатами точка А.
    // Указать, где она расположена (на какой оси или в каком
    // координатном угле).
    private static void task16(double x, double y) {

        String st = "The point with coordinates " + x +
                "," + y + " in ";

        System.out.println("\n>> Task #16");

        if (x == 0 && y == 0) {
            System.out.println(st + "the beginning of coordinates");
        } else if (x == 0 && y != 0) {
            System.out.println(st + "y axe");
        } else if (x != 0 && y == 0) {
            System.out.println(st + "x axe");
        } else if (x > 0 && y > 0) {
            System.out.println(st + "I quarter");
        } else if (x < 0 && y > 0) {
            System.out.println(st + "II quarter");
        } else if (x < 0 && y < 0) {
            System.out.println(st + "III quarter");
        } else {
            System.out.println(st + "IV quarter");
        }
    }


    // Task #17
    // 17. Даны целые числа m, n. Если числа не равны, то заменить каждое
    // из них одним и тем же числом, равным большему
    // из исходных, а если равны, то заменить числа нулями.
    private static void task17(int m, int n) {

        System.out.println("\n>> Task #17");

        if (m > n) {
            n = m;
        } else if (m < n) {
            m = n;
        } else {
            m = 0;
            n = 0;
        }

        System.out.println("After operations:" +
                "\nm = " + m +
                "\nn = " + n);
    }


    // Task #18
    // 18. Подсчитать количество отрицательных среди чисел а, b, с.
    private static void task18(int a, int b, int c) {

        int[] v = new int[3];
        int temp = 0;

        v[0] = a;
        v[1] = b;
        v[2] = c;

        for (int e: v) {
            if (e < 0) {
                temp++;
            }
        }

        System.out.println("\n>> Task #18");
        System.out.println("Qty of negative numbers is " + temp);
    }


    // Task #19
    // 19. Подсчитать количество положительных среди чисел а, b, с.
    private static void task19(double a, double b, double c) {

        double[] num = new double[]{a, b, c};

        int qty = 0;

        for (int i = 0; i < 3; i++) {
            if (num[i] > 0) {
                qty++;
            }
        }

        System.out.println("\n>> Task #19");
        System.out.println("Quantity of positive numbers = " + qty);
    }


    // Task #20
    // 20. Определить, делителем каких чисел а, b, с является число k.
    private static void task20(int a, int b, int c, int k) {

        System.out.println("\n>> Task #20");

        int[] d = new int[3];

        d[0] = a;
        d[1] = b;
        d[2] = c;

        for (int e: d) {
            if ((e > k) && (e % k == 0)) {
                System.out.println(k + " is divider of " + e);
            }
        }
    }
}
