package by.htp.itacademy.conditions;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

public class ConditionsBranchingP3 {

    public static void main(String[] args) {

        task21();
        task22(10, 8);
        task23();
        task24(24);
        task25(30);
        task26(3, -7, 13);
        task27(3, 6, 34, 10);
        task28(4, 7, 10, 16);
        task29(6, 2, 10, 10, 8, 3);
        task30(10.5, 24.5, -3.8);
    }

    // Task #21
    // 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В
    //зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
    private static void task21() {

        String s;
        String text;

        text = "I like ";

        Scanner sc = new Scanner(System.in);

        System.out.println("\n>> Task #21");
        System.out.println("Write who ar you: (B)oy or (G)irl?");
        while (sc.hasNext()) {

            s = sc.next();

            if (s.equals("B")) {
                System.out.println(text + "boys!");
                break;
            } else if (s.equals("G")) {
                System.out.println(text + "girls!");
                break;
            } else {
                System.out.println("Enter (B) or (G)");
            }
        }
    }


    // Task #22
    // 22. Перераспределить значения переменных х и у так,
    // чтобы в х оказалось большее из этих значений, а в y - меньшее.
    private static void task22(int x, int y) {

        int temp;

        System.out.println("\n>> Task #22");
        System.out.println("Before: x = " + x + " and y = " + y);

        if (x < y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("After: x = " + x + " and y = " + y);
    }


    // Task #23
    // 23. Определить правильность даты, введенной с клавиатуры
    // (число — от 1 до 31, месяц — от 1 до 12). Если введены
    // некорректные данные, то сообщить об этом.
    private static void task23() {

        Scanner sc = new Scanner(System.in);

        boolean trueData;

        String invalidDate;
        String validDate;

        invalidDate = "The date is invalid";
        validDate = "The date you've entered is ";

        int theDay = 0;
        int theMonth = 0;

        System.out.println("\n>> Task #23");

        System.out.println("Enter the number of Day from 1 to 31");

        while (!sc.hasNext("([1-9]|[12][0-9]|3[01])")) {
            String in = sc.next();
            System.out.println("This is not correct: " + in);
            System.out.println("Enter the correct number of Day from 1 to 31");
        }

        theDay = sc.nextInt();

        System.out.println("Enter the number of Month from 1 to 12");

        while (!sc.hasNext("([1-9]|1[0-2])")) {
            String in = sc.next();
            System.out.println("This is not correct: " + in);
            System.out.println("Enter the correct number of Month from 1 to 12");
        }

        theMonth = sc.nextInt();

        switch (theMonth) {
            case 2:
                if (theDay > 28) {
                    System.out.println(invalidDate);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (theDay > 30) {
                    System.out.println(invalidDate);
                } else {
                    System.out.println(validDate + theDay + "/" + theMonth);
                }
                break;
            default:
                System.out.println(validDate + theDay + "/" + theMonth);
        }
    }


    // Task #24
    // 24. Составить программу, определяющую результат
    // гадания на ромашке — «любит—не любит», взяв за исходное
    // данное количество лепестков п.
    private static void task24(int n) {

        System.out.println("\n>> Task #24");

        if (n % 2 != 0 || n == 1) {
            System.out.println("Love me!");
        } else {
            System.out.println("Doesn't love");
        }
    }

    // Task #25
    // 25. Написать программу — модель анализа пожарного датчика в помещении,
    // которая выводит сообщение
    // «Пожароопасная ситуация», если температура в комнате превысила 60° С.
    private static void task25(int t) {

        System.out.println("\n>> Task #25");

        if (t >= 60) {
            System.out.println("Alarm! Fire hazard!!!");
        } else {
            System.out.println("All is under control");
        }
    }

    // Task #26
    // 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
    private static void task26(int x, int y, int z) {

        System.out.println("\n>> Task #26");

        int minimum;
        int maximum;

        minimum = Integer.MAX_VALUE;
        maximum = Integer.MIN_VALUE;

        int[] nums = new int[]{x, y, z};

        System.out.print("List of elements: ");

        for (int e : nums) {
            System.out.print(e + ", ");
            maximum = max(e, maximum);
            minimum = min(e, minimum);
        }

        System.out.println("\nMax elem = " + maximum);
        System.out.println("Min elem = " + minimum);
    }


    // Task #27
    // 27. Найти max{min(a, b), min(c, d)}.
    private static void task27(int a, int b, int c, int d) {

        System.out.println("\n>> Task #27");

        int temp;

        temp = max(min(a, b), min(c, d));

        System.out.println("The result is " + temp);
    }


    // Task #28
    // 28. Даны три числа a, b, с. Определить, какое из них равно d.
    // Если ни одно не равно d, то найти max(d — a, d — b, d — c).
    private static void task28(int a, int b, int c, int d) {

        int temp;

        System.out.println("\n>> Task #28");

        if (a == d || b == d || c == d) {
            System.out.println("a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("d = " + d);
        } else {
            temp = max(max(d - a, d - b), (d - c));
            System.out.println("max(d — a, d — b, d — c) = " + temp);
        }
    }


    // Task #29
    // 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    // Определить, будут ли они расположены на одной прямой.
    private static void task29(double x1, double y1,
                               double x2, double y2,
                               double x3, double y3) {

        System.out.println("\n>> Task #29");

        double slope;
        double shift;
        double tempY;

        slope = (y2 - y1) / (x2 - x1);
        shift = -x1 * slope + y1;

        tempY = x3 * slope + shift;

        if (tempY == y3) {
            System.out.println("Three points lay on the same line!");
        } else {
            System.out.println("Three points don't lay on the same line!");
        }
    }


    // Task #30
    // 30. Даны действительные числа а,b,с. Удвоить эти числа,
    // если а > b > с, и заменить их абсолютными значениями, если
    // это не так.
    private static void task30(double a, double b, double c) {

        System.out.println("\n>> Task #30");

        if (a > b && b > c) {
            a = 2 * a;
            b = 2 * b;
            c = 2 * c;

            System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        } else {
            System.out.println("a = " + abs(a) + ", b = " + abs(b) + ", c = " + abs(c));
        }
    }
}
