package by.htp.itacademy.conditions;

import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.max;
import static java.lang.Math.abs;
import static java.lang.Math.round;
import static java.lang.Math.pow;


public class ConditionsBranchingP4 {

    public static void main(String[] args) {

        task31(4, 5, 3, 5, 12);
        task32(-2, -6, 1);
        task33();
        task34();
        task35(251);
        task36(0);
        task37(10);
        task38(12);
        task39(7);
        task40(10);
    }

    // Task #31
    // 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    // Определить, пройдет ли кирпич через отверстие.
    private static void task31(int xHole, int yHole, int xBrick, int yBrick, int zBrick) {

        System.out.println("\n>> Task #31");

        int minimumBrickSize = min(xBrick, min(yBrick, zBrick));

        int middleBrickSize = min(
                max(xBrick, min(yBrick, zBrick)),
                max(min(xBrick, yBrick), zBrick)
        );

        int minHoleSize;
        int maxHoleSize;

        minHoleSize = min(xHole, yHole);
        maxHoleSize = max(xHole, yHole);

        if (minimumBrickSize < minHoleSize && middleBrickSize < maxHoleSize) {
            System.out.println("Brick is pass through hole");
        } else {
            System.out.println("Brick is stuck");
        }
    }


    // Task #32
    // 32. Написать программу, которая по заданным трем числам определяет,
    // является ли сумма каких-либо двух из них
    // положительной.
    private static void task32(int x, int y, int z) {

        System.out.println("\n>> Task #32");

        boolean sumPositive;

        sumPositive = (x + y) > 0 || (y + z) > 0 || (z + x) > 0;

        if (sumPositive) {
            System.out.println("Sum of two numbers is positive");
        } else {
            System.out.println("Sum of two numbers is NOT positive");
        }
    }


    // Task #33
    // 33. Написать программу, которая по паролю будет определять уровень доступа
    // сотрудника к секретной информации в
    //базе данных.
    // Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа.
    // Они имеют следующие пароли:
    // 9583, 1747 — доступны модули баз А, В, С;
    // 3331, 7922 — доступны модули баз В, С;
    // 9455, 8997 — доступен модуль базы С.
    private static void task33() {

        Scanner sc = new Scanner(System.in);

        String pass;
        String accessMessage;

        accessMessage = "You have access to the following module(s): ";

        System.out.println("\n>> Task #33");

        System.out.println("Enter your password:");

        pass = sc.nextLine();

        switch (pass) {
            case "9583":
            case "1747":
                System.out.println(accessMessage + "A, B, C");
                break;

            case "3331":
            case "7922":
                System.out.println(accessMessage + "B, C");
                break;

            case "9455":
            case "8997":
                System.out.println(accessMessage + "C");
                break;

            default:
                System.out.println("Your credentials are not correct");
        }
    }


    // Task #34
    // 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
    //запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
    //«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
    //денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
    private static void task34() {

        System.out.println("\n>> Task #34");

        double bookCost;
        double money;

        String bookMessage;
        String moneyMessage;
        String notCorrect;
        String moneyPattern;

        bookMessage = "Provide cost of the book as XX.XX or XXX.XX";
        moneyMessage = "Provide money you have paid for the book as XX.XX or XXX.XX";
        notCorrect = "This is not correct: ";
        moneyPattern = "\\d{1,3}[.]{1}\\d{1,2}";

        System.out.println("\n>> Task #34");

        Scanner sc = new Scanner(System.in);

        System.out.println(bookMessage);

        // ask for "Book's cost" (\d{1,3}[.]{1}\d{1,2})
        while (!sc.hasNext(moneyPattern)) {
            String in = sc.next();
            System.out.println(notCorrect + in);
            System.out.println(bookMessage);
        }

        bookCost = sc.nextDouble();

        System.out.println(moneyMessage);

        // ask for "Money amount from buyer" (\d{1,3}[.]{1}\d{1,2})
        while (!sc.hasNext(moneyPattern)) {
            String in = sc.next();
            System.out.println(notCorrect + in);
            System.out.println(moneyMessage);
        }

        money = sc.nextDouble();

        if ((money - bookCost) == 0) {
            System.out.println("Thank you!");
        } else if ((money - bookCost) > 0) {
            System.out.println("Take the withdraw");
        } else {
            System.out.println("Need more money: " + abs(round((money - bookCost) * 100.00) / 100.00));
        }
    }


    // Task #35
    // 35. Вычислить число и месяц в невисокосном году по номеру дня.
    private static void task35(int n) {

        int[] monthDay = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("\n>> Task #35");

        if (n > 0 && n < 366) {
            for (int i = 0; i < monthDay.length; i++) {

                if (n <= monthDay[i]) {
                    System.out.println("Month is " + (i + 1));
                    System.out.println("Day is " + n);
                    break;
                }

                n = n - monthDay[i];
            }
        } else {
            System.out.println("Provide number from 1 to 365");
        }
    }

    // Task #36
    // 36. Вычислить значение функции:
    private static void task36(int x) {

        System.out.println("\n>> Task #36");

        if (x <= 3) {
            System.out.println("Result is: " +
                    (pow(x, 2) - 3 * x + 9));
        } else {
            System.out.println("Result is: " +
                    (1 / (pow(x, 3) + 6)));
        }
    }


    // Task #37
    // 37. Вычислить значение функции:
    private static void task37(int x) {

        System.out.println("\n>> Task #37");

        if (x >= 3) {
            System.out.println("Result is: " +
                    (-1 * pow(x, 2) + 3 * x + 9));
        } else {
            System.out.println("Result is: " +
                    (1 / (pow(x, 3) - 6)));
        }
    }


    // Task #38
    // 38. Вычислить значение функции:
    private static void task38(int x) {

        System.out.println("\n>> Task #38");

        if (x >= 0 && x <= 3) {
            System.out.println("Result is: " +
                    pow(x, 2));
        } else {
            System.out.println("Result is: " + 4);
        }
    }


    // Task #39
    // 39. Вычислить значение функции:
    private static void task39(int x) {

        System.out.println("\n>> Task #39");

        if (x >= 8) {
            System.out.println("Result is: " +
                    (-1 * pow(x, 2) + x - 9));
        } else {
            System.out.println("Result is: " +
                    (1 / (pow(x, 4) - 6)));
        }
    }


    // Task #40
    // 40. Вычислить значение функции:
    private static void task40(int x) {

        System.out.println("\n>> Task #40");

        if (x <= 13) {
            System.out.println("Result is: " +
                    (-1 * pow(x, 3) + 9));
        } else if (x == -1) {
            System.out.println("Result is not defined");
        } else {
            System.out.println("Result is: " +
                    (-3 / (x + 1)));
        }
    }
}
