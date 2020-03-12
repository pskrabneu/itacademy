package by.htp.itacademy.decomposition;

import java.util.LinkedList;

import static by.htp.itacademy.util.Util.*;

public class DecompositionP1 {

    public static void main(String[] args) {

//        task01();
        task02(4545, 255);
//        task03();
//        task04();
//        task05();
//        task06();
//        task07();
//        task08();
//        task09();
//        task10();
//        task11();
//        task12();
//        task13();
//        task14();
//        task15();
//        task16();
//        task17();
//        task18();
//        task19();
//        task20();


    }

    // Task #01
    // 01. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
    private static void task01() {
        System.out.println("\n>> Task #01");
        // See package by.htp.itacademy.util.Util.calculateAreaOfTriangle;

    }

    // Task #02
    // 02. Написать метод(методы) для нахождения наибольшего общего делителя и
    // наименьшего общего кратного двух натуральных чисел:
    private static void task02(int n, int m) {
        System.out.println("\n>> Task #02");

        LinkedList<Integer> listDivN = new LinkedList<>();
        LinkedList<Integer> listDivM = new LinkedList<>();

        listDivM.addAll(findDivisors(m));
        listDivN.addAll(findDivisors(n));

        int minListSize;
        minListSize = Math.min(listDivN.size(), listDivM.size());

        int x;
        int greatestCommonDivisor = 1;

        for (int i = minListSize - 1; i >= 0; i--) {
            if (listDivN.size() <= listDivM.size()) {
                x = listDivN.get(i);
                if (listDivM.contains(x)) {
                    greatestCommonDivisor = x;
//                    System.out.println(greatestCommonDivisor);
                    break;
                }
            } else {
                x = listDivM.get(i);
                if (listDivN.contains(x)) {
                    greatestCommonDivisor = x;
//                    System.out.println(greatestCommonDivisor);
                    break;
                }
            }
        }
            System.out.println(greatestCommonDivisor);


        // TODO

//        System.out.println(listDivN);
//        System.out.println(listDivM);


    }

    // Task #03
    // 03. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    private static void task03() {
        System.out.println("\n>> Task #03");
        // TODO

    }


    // Task #04
    // 04. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
    private static void task04() {
        System.out.println("\n>> Task #04");
        // TODO

    }


    // Task #05
    // 05. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
    private static void task05() {
        System.out.println("\n>> Task #05");
        // TODO

    }


    // Task #06
    // 06. Вычислить площадь правильного шестиугольника со стороной а,
    // используя метод вычисления площади треугольника.
    private static void task06() {
        System.out.println("\n>> Task #06");
        // TODO

    }


    // Task #07
    // 07. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
    // пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
    private static void task07() {
        System.out.println("\n>> Task #07");
        // TODO

    }


    // Task #08
    // 08. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
    //    которое меньше     максимального элемента     массива,     но больше     всех других     элементов).
    private static void task08() {
        System.out.println("\n>> Task #08");
        // TODO

    }


    // Task #09
    // 09. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    private static void task09() {
        System.out.println("\n>> Task #09");
        // TODO

    }


    // Task #10
    // 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    private static void task10() {
        System.out.println("\n>> Task #10");
        // TODO

    }


    // Task #11
    // 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    //    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    //    массива с номерами от k до m.
    private static void task11() {
        System.out.println("\n>> Task #11");
        // TODO

    }


    // Task #12
    // 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
    //    если угол между сторонами длиной X и Y— прямой.
    private static void task12() {
        System.out.println("\n>> Task #12");
        // TODO

    }


    // Task #13
    //      13.     Дано натуральное     число N.     Написать метод(методы) для формирования массива,
    //     элементами которого являются     цифры числа     N .
    private static void task13() {
        System.out.println("\n>> Task #13");
        // TODO

    }


    // Task #14
    // 14.    Написать метод(методы),определяющий,в каком из данных двух чисел больше цифр.
    private static void task14() {
        System.out.println("\n>> Task #14");
        // TODO

    }


    // Task #15
    // 15.     Даны натуральные     числа К     и N.
    //        Написать метод(методы) формирования массива А,элементами которого     являются числа, сумма
    //        цифр которых     равна К     и которые     не большее     N .
    private static void task15() {
        System.out.println("\n>> Task #15");
        // TODO


    }


    // Task #16
    // 16.     Два простых     числа называются «близнецами»,     если они
    //    отличаются друг     от друга     на 2(например,41и 43).Найти
    //    и напечатать     все пары «близнецов»     из отрезка[    n,2n],     где n -     заданное натуральное
    //    число больше 2.     Для решения     задачи использовать     декомпозицию .
    private static void task16() {
        System.out.println("\n>> Task #16");
        // TODO

    }


    // Task #17
    //17.     Натуральное число, в     записи которого     n цифр, называется     числом Армстронга, если
    //    сумма его     цифр,возведенная     в степень     n,     равна самому     числу.Найти все
    //    числа Армстронга     от 1     до k.     Для решения     задачи использовать     декомпозицию .
    private static void task17() {
        System.out.println("\n>> Task #17");
        // TODO

    }


    // Task #18
    //18.     Найти все     натуральные n-     значные числа, цифры     в которых     образуют строго
    //    возрастающую последовательность             (например, 1234,5789).
    //    Для решения     задачи использовать     декомпозицию.
    private static void task18() {
        System.out.println("\n>> Task #18");
        // TODO

    }


    // Task #19
    //19.     Написать программу, определяющую     сумму n -     значных чисел, содержащих
    //    только нечетные     цифры. Определить     также,     сколько четных     цифр в
    //    найденной сумме.     Для решения     задачи использовать     декомпозицию.
    private static void task19() {
        System.out.println("\n>> Task #19");
        // TODO


    }


    // Task #20
    //20.     Iз заданного     числа вычли     сумму его     цифр. Iз результата     вновь вычли
    //    сумму его     цифр и     т.д. Сколько таких     действий надо     произвести,
    //    чтобы получился     нуль?     Для решения     задачи использовать     декомпозицию .
    private static void task20() {
        System.out.println("\n>> Task #20");
        // TODO

    }


}
