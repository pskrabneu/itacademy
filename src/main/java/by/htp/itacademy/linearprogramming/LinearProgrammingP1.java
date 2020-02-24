package by.htp.itacademy.linearprogramming;

public class LinearProgrammingP1 {
    public static void main(String[] args) {
//        task01(3.5, 4.8);
//        task02(11);
//        task03(2, 12);
//        task04(2, 4, 6);
//        task05(3, 7);
//        task06(7, 9);
//        task07(2.3);
//        task08(0, 5, 3);
        task09(1, 1, 1, 1);

    }

    // Task #01
    // Даны 2 действительных (float / double) числа x и y. Вычислить их сумму, разность, произведение, частное.
    private static void task01(double x, double y) {

        System.out.println(">> Task #01");
        System.out.println("Numbers: x = " + x + ", y = " + y);

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
    private static void task04(double a, double b, double c) {

        System.out.println("\n>> Task #04");
        System.out.println("z = " + ((a - 3) * b / 2 + c));
    }

    // Task #05
    // Составить алгоритм нахождения среднего арифметического двух чисел
    private static void task05(double x, double y) {

        System.out.println("\n>> Task #05");
        System.out.println("The arithmetic average of " + x + " and " +
                y + " is " + (x + y) / 2);
    }

    // Task #06
    // Написать код: в 'n' малых бидонах 80л молока. Сколько литров молока в 'm' больших
    // бидонах, если в каждом большом бидоне на 12л больше, чем в малом?
    private static void task06(int n, int m) {
        double tempLiter;

        tempLiter = 80 / (double) n;

        System.out.println("\n>> Task #06");
        System.out.println("In " + m + " big canister contains " + (tempLiter + 12) * m +
                " of milk");
    }

    // Task #07
    // Дан прямоугольник, ширина которого в 2 раза меньше длины. Найти площадь прямоугольника.
    private static void task07(double x) {

        double temp;

        temp = 2 * x;

        System.out.println("\n>> Task #07");
        System.out.println("The rectangle square with " + x + " and " +
                temp + " equals " + x * temp);
    }

    // Task #08
    // Вычислить значение выражения по формуле
    // (все переменные принимают действительные значения):
    //((b + sqrt(b^2 + 4 * a * c)) / (2 * a)) - (a^3 + b^(-2))
    private static void task08(double a, double b, double c) {

        double temp = 0;

        System.out.println("\n>> Task #08");

        if (a != 0) {
            temp = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
            temp = (temp + b) / (2 * a);
            temp = temp - Math.pow(a, 3) * c + (1 / Math.pow(b, 2));

            System.out.println("The result is " + temp);
        } else {
            System.out.println("Invalid value of a");
        }
    }

    // Task #09
    // Вычислить значение выражения по формуле
    // (все переменные принимают действительные значения):
    // (a * b) / (c * d) - ((a * b) - c) / (c * d)
    private static void task09(double a, double b, double c, double d) {

        System.out.println("\n>> Task #09");

        if (c != 0 && d != 0) {

            double prodAb;
            double prodCd;

            prodAb = a * b;
            prodCd = c * b;

            System.out.println("The result is " + ((prodAb / prodCd) - (prodAb - c) / prodCd));

        } else {
            System.out.println("Invalid value of c and d");
        }
    }

    // Task #10
    // Вычислить значение выражения по формуле
    // (все переменные принимают действительные значения):
    // (sin(x) + cos(y) / (cos(x) - sin(y) * (tg(x * y))
    private static void task10(double x, double y) {

        System.out.println("\n>> Task #10");


    }
}
