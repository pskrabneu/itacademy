package by.htp.itacademy.loops;

import java.util.*;

import static java.lang.Math.pow;

public class LoopsP4 {

    public static void main(String[] args) {
//        task31();
        task32();
//        task33();
//        task34();
//        task35();
//        task36();
//        task37();
//        task38();
//        task39();
//        task40();

    }


    // Task #31
    // 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
    //угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
    //программа, а также ошибочные числа пользователя.
    private static void task31() {

        System.out.println("\n>> Task #31");
        // TODO
    }


    // Task #32
    // 32. Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
    //первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
    //буквами, цифрами и знаком подчеркивания.
    private static void task32() {

        System.out.println("\n>> Task #32");
        // TODO

        System.out.println("Provide a string:");
        System.out.println("first char is a letter or '_', other chars letters or numbers or '_'");

        Scanner sc = new Scanner(System.in);

        String input;

        input = sc.nextLine().toLowerCase();

        if (input.matches("^[\\_a-z]+[\\$_\\w]*$")) {
            System.out.println("Your input is OK!!!");
        } else {
            System.out.println("Your string is wrong!!!");
        }
    }


    // Task #33
    // 33. Найдите наибольшую цифру данного натурального числа.
    private static void task33() {
        System.out.println("\n>> Task #33");
        // TODO

    }

    // Task #34
    // 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
    private static void task34() {

        System.out.println("\n>> Task #34");
        // TODO
    }


    // Task #35
    // 35. Найдите количество четных цифр данного натурального числа.
    private static void task35() {

        System.out.println("\n>> Task #35");
        // TODO
    }


    // Task #36
    // 36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
    //делится на их произведение. Найти эти числа.
    private static void task36() {

        System.out.println("\n>> Task #36");
        // TODO
    }


    // Task #37
    // 37. Даны два двузначных числа А и В. Из этих чисел составили "two" четырехзначных числа: первое число
    //получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали
    //число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится
    //на 99, а второе на 49.
    private static void task37() {

        System.out.println("\n>> Task #37");
        // TODO
    }


    // Task #38
    //38. Для заданного натурального числа определить, образуют ли его цифры арифметическую
    //прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
    private static void task38() {

        System.out.println("\n>> Task #38");
        // TODO
    }


    // Task #39
    // 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то
    //получили исходное число. Найти это число.
    private static void task39() {

        System.out.println("\n>> Task #39");
        // TODO
    }

    // Task #40
    // 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои
    //цифры.
    private static void task40() {

        System.out.println("\n>> Task #40");
        // TODO
    }
}
