package by.htp.itacademy.linearprogramming;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
import static java.lang.Math.tan;
import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;
import static java.lang.Math.acos;

public class LinearProgrammingP3 {
    public static void main(String[] args) {

        task21(123.456);
        task22(6505);
        task23(6, 10);
        task24(10, 6, PI / 4);
        task25(1, -1, -2);
        task26(20, 30, PI / 6);
        task27(3);
        task28(15.6);
        task29(3, 4, 5);
        task30(10, 20, 60);
    }


    // Task #21
    // Дано действительное (double) число R вида nnn.ddd (три цифровых
    // разряда в целой и дробной части). Поменять местами дробную
    // и целую части числа и вывести получнное значение.
    private static void task21(double r) {

        int x1;
        int x2;

        x1 = (int) r;
        x2 = (int) (r * 1000 - x1 * 1000);

        System.out.println("\n>> Task #21");
        System.out.println("The result is " + x2 + "." + x1);
    }


    // Task #22
    // Дано натуральное число "Т", которое представляет длительность
    // прошедшего времени в секундах. Вывести данное значение
    // длительности в часах, минутах и секундах в следующей форме:
    // HHч MMмин SSс
    private static void task22(int t) {

        int temp;
        int hours;
        int min;
        int sec;

        temp = t;

        hours = t / 3600;
        t = t - hours * 3600;
        min = t / 60;
        sec = t - min * 60;

        System.out.println("\n>> Task #22");
        System.out.println("\n" + temp + " seconds equals: " + hours + "ч " + min + "мин " + sec + "sec");
    }


    // Task #23
    // Найти площадь кольца, внутренний радиус которого равен
    // "r", а внешний -- "R" (R > r)
    private static void task23(double rSmall, double rBig) {

        System.out.println("\n>> Task #23");
        System.out.println("Square of the ring is " + (PI * pow(rBig, 2) - PI * pow(rSmall, 2)));

    }


    // Task #24
    // Найти площадь равнобедренной трапеции с основаниями "a" и "b"
    // и углом "alpha" при большем основании "a"
    private static void task24(double a, double b, double alpha) {

        double high;
        double tempBase;

        tempBase = (a - b) / 2;
        high = tan(alpha) * tempBase;

        System.out.println("\n>> Task #24");
        System.out.println("The area of trapezium is " + (high * b + high * tempBase));
    }


    // Task #25
    // Вычислить корни квадратного уравнения a * x^2 + b * x + c = 0
    // с заданными коэффициентами a, b, c (предполагается, что a != 0 и
    // дискриминант уравнения неотрицателен)
    private static void task25(int a, int b, int c) {

        double discrim;

        discrim = sqrt(pow(b, 2) - 4 * a * c);

        System.out.println("\n>> Task #25");
        System.out.println("x1 = " + (-b + discrim) / (2 * a));
        System.out.println("x2 = " + (-b - discrim) / (2 * a));
    }


    // Task #26
    // НАйти площадь треугольника, две стороны которого равны "a"и "b",
    // а угол между сторонами "y"
    private static void task26(double a, double b, double alpha) {

        System.out.println("\n>> Task #26");
        System.out.println("The area of the triangle = " + (a * b * sin(alpha)) / 2);
    }


    // Task #27
    // Дано значение "a". Не используя никаких функций и никаких операций,
    // кроме умножения, получить значение a^3 за три операции и a^10 за четыре
    // операции
    private static void task27(int a) {

        int temp;
        int temp1;

        // 1
        temp = a * a;

        System.out.println("\n>> Task #27");
        System.out.println("a^3 = " + temp * a);

        // 2
        temp1 = temp * temp;

        // 3
        temp1 = temp1 * temp1;

        // 4
        temp1 = temp1 * temp;
        System.out.println("a^10 = " + temp1);
    }


    // Task #28
    // Составить программу перевода радианной меры угла в градусы, минуты, секунды
    private static void task28(double alpha) {

        double tempRad;
        double grades;
        double minutes;
        double sec;

        tempRad = alpha % (2 * PI);
        grades = toDegrees(tempRad);
        minutes = (grades - (int) grades) * 60;
        sec = (minutes - (int) minutes) * 60;

        System.out.println("\n>> Task #28");
        System.out.println(alpha + " radians is:");
        System.out.println((int) grades + " degrees");
        System.out.println((int) minutes + " minutes");
        System.out.println((int) sec + " seconds");
    }


    // Task #29
    // Найти (в радианах и градусах) все углы треугольника со сторонами
    // a, b, c
    private static void task29(double a, double b, double c) {

        double alphaCos;
        double bethaCos;
        double gammaCos;

        alphaCos = (pow(b, 2) + pow(c, 2) - pow(a, 2)) / (2 * b * c);
        bethaCos = (pow(c, 2) + pow(a, 2) - pow(b, 2)) / (2 * c * a);
        gammaCos = PI - acos(bethaCos) - acos(alphaCos);

        System.out.println("\n>> Task #29");
        System.out.println("Angles of the triangle with sides: " + a + ", " + b + ", " + c);
        System.out.println("a = " + acos(alphaCos) + " radians, " +
                toDegrees(acos(alphaCos)) + " degrees");
        System.out.println("b = " + acos(bethaCos) + " radians, " +
                toDegrees(acos(bethaCos)) + " degrees");
        System.out.println("c = " + gammaCos + " radians, " +
                toDegrees(gammaCos) + " degrees");

    }


    // Task #30
    // Три сопротивления "R1", "R2" и "R3" соединены параллельно
    // Найдите сопротивление соединения
    private static void task30(int r1, int r2, int r3) {

        double rTotal;

        rTotal = (double) 1 / r1 + (double) 1 / r2 + (double) 1 / r3;
        rTotal = 1 / rTotal;

        System.out.println("\n>> Task #30");
        System.out.println("The resistance is " + rTotal);
    }
}
