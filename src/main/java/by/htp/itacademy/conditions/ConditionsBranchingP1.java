package by.htp.itacademy.conditions;

import java.util.Scanner;

public class ConditionsBranchingP1 {

    public static void main(String[] args) {

        task01(5, 8);
        task02(6, 7);
        task03();
        task04(2, 2);
        task05(5, 8);
        task06(4, 7);
        task07(1, -8, 2, 2);
        task08(4, 5);
        task09(2, 2, 2);
        task10(2.5, 6.3);
    }

    // Task #01
    // 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7,
    // в противном случае – цифру 8.
    private static void task01(int x, int y) {

        System.out.println("\n>> Task #01");
        if (x < y) {
            System.out.println("7");
        } else {
            System.out.println("8");
        }
    }


    // Task #02
    // 2. Составить программу сравнения двух чисел 1 и 2.
    // Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no»
    private static void task02(int x, int y) {

        System.out.println("\n>> Task #02");
        if (x < y) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }


    // Task #03
    // 3. Составить программу сравнения введенного числа а и цифры 3.
    // Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
    private static void task03() {

        System.out.println("\n>> Task #03");
        System.out.println("Enter int value: \n");

        int x;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if (x < 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    // Task #04
    // 4. Составить программу: равны ли два числа а и b?
    private static void task04(int a, int b) {

        System.out.println("\n>> Task #04");

        if (a == b) {
            System.out.println(a + " and " + b + " are equal");
        } else {
            System.out.println(a + " and " + b + " are NOT equal");
        }
    }

    // Task #05
    // 5. Составить программу: определения наименьшего из двух чисел а и b.
    private static void task05(int a, int b) {

        System.out.println("\n>> Task #05");

        if (a > b) {
            System.out.println("B is the lowest number");
        } else if (a < b) {
            System.out.println("A is the lowest number");
        } else {
            System.out.println("A equals B");
        }
    }

    // Task #06
    // 6. Составить программу: определения наибольшего из двух чисел а и b.
    private static void task06(int a, int b) {

        System.out.println("\n>> Task #06");

        if (a > b) {
            System.out.println("A is the greatest number");
        } else if (a < b) {
            System.out.println("B is the greatest number");
        } else {
            System.out.println("A equals B");
        }
    }


    // Task #07
    // 7. Составить программу нахождения модуля выражения
    // a*x*x + b*x + c при заданных значениях a, b, c и х
    private static void task07(int a, int b, int c, int x) {

        int temp;

        temp = a * x * x + b * x + c;

        System.out.println("\n>> Task #07");

        if (temp >= 0) {
            System.out.println("Module of the equation is " + temp);
        } else {
            System.out.println("Module of the equation is " + (-temp));
        }
    }


    // Task #08
    // 8. Составить программу нахождения наименьшего
    // из квадратов двух чисел а и b.
    private static void task08(int a, int b) {

        System.out.println("\n>> Task #08");

        if ((a * a) > (b * b)) {
            System.out.println("A^2 is more then B^2");
        } else if ((a * a) < (b * b)) {
            System.out.println("A^2 is less then B^2");
        } else {
            System.out.println("A^2 is equals B^2");
        }
    }


    // Task #09
    // 9. Составить программу, которая определит по трем введенным сторонам,
    // является ли данный треугольник равносторонним.
    private static void task09(double a, double b, double c) {

        System.out.println("\n>> Task #09");

        if (a == b && b == c) {
            System.out.println("We have a right triangle!");
        } else {
            System.out.println("We have a regular triangle!");
        }
    }


    // Task
    // 10. Составить программу, которая определит площадь какого круга меньше.
    private static void task10(double r1, double r2) {

        System.out.println("\n>> Task #10");

        if (Math.PI * Math.pow(r1, 2) > Math.PI * Math.pow(r2, 2)) {
            System.out.println("Area of the first circle is more");
        } else if (Math.PI * Math.pow(r1, 2) < Math.PI * Math.pow(r2, 2)) {
            System.out.println("Area of the first circle is less");
        } else {
            System.out.println("Area of the first and second circles is equal");
        }
    }
}
