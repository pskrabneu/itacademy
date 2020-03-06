package by.htp.itacademy.conditions;

import static java.lang.Math.round;
import static java.lang.Math.abs;

import java.util.Scanner;

public class ConditionsBranchingP4 {

    public static void main(String[] args) {

//        task31();
//        task32();
//        task33();
//        task34();
        task35(159);
//        task36();
//        task37();
//        task38();
//        task39();
//        task40();
    }

    // Task #31
    // 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    // Определить, пройдет ли кирпич через отверстие.
    private static void task31(int xHole, int yHole, int xBrick, int yBrick, int zBrick) {

        System.out.println("\n>> Task #31");
        // TODO
    }


    // Task #32
    // 32. Написать программу, которая по заданным трем числам определяет,
    // является ли сумма каких-либо двух из них
    // положительной.
    private static void task32(int x, int y, int z) {

        System.out.println("\n>> Task #32");
        // TODO
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

        System.out.println("\n>> Task #33");
        // TODO
    }


    // Task #34
    // 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
    //запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
    //«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
    //денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
    private static void task34() {

        double bookCost;
        double money;

        String bookMessage;
        String moneyMessage;
        String notCorrect;
        String moneyPattern;

        bookMessage = "Provide cost of the book as XX.XX or XX.XX";
        moneyMessage = "Provide money you have paid for the book as XX.XX or XX.XX";
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

        System.out.println("\n>> Task #35");

//        int[] days = new int[] {31, 28, 31, 30, 31, }




        // TODO
    }

    // Task #36
    // 36. Вычислить значение функции:
    private static void task36(int x) {

        System.out.println("\n>> Task #36");
        // TODO
    }


    // Task #37
    // 37. Вычислить значение функции:
    private static void task37(int x) {

        System.out.println("\n>> Task #37");
        // TODO
    }


    // Task #38
    // 38. Вычислить значение функции:
    private static void task38(int x) {

        System.out.println("\n>> Task #38");
        // TODO
    }


    // Task #39
    // 39. Вычислить значение функции:
    private static void task39(int x) {

        System.out.println("\n>> Task #39");
        // TODO
    }


    // Task #40
    // 40. Вычислить значение функции:
    private static void task40(int x) {

        System.out.println("\n>> Task #40");
        // TODO
    }
}
