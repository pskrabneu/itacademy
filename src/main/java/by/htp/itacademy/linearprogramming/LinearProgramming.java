package by.htp.itacademy.linearprogramming;

public class LinearProgramming {
    public static void main(String[] args) {
        task01();
        task02(11);
        task03(2, 12);

    }

    // Task #01
    // Даны 2 действительных числа x и y. Вычислить их сумму, разность, произведение, частное.
    private static void task01() {
        float x;
        float y;

        x = 3.5F;
        y = 4.8F;

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


    // Task #05
    // Составить алгоритм нахождения среднего арифметического двух чисел

    // Task #06
    // Написать код: в 'n' малых бидонах 80л молока. Сколько литров молока в 'm' больших
    // бидонах, если в каждом большом бидоне на 12л больше, чем в малом?
    private static void task04(int n, int m) {
        
    }






}
