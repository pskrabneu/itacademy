package by.htp.itacademy.conditions;

import java.util.Scanner;

public class ConditionsBranchingP3 {

    public static void main(String[] args) {

        task21();
//        task22(5, 8);
//        task23();
//        task24();
//        task25();
//        task26();
//        task27();
//        task28();
//        task29();
//        task30();


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

        System.out.println("\n>> Task #22");
        // TODO
    }


    // Task #23
    // 23. Определить правильность даты, введенной с клавиатуры
    // (число — от 1 до 31, месяц — от 1 до 12). Если введены
    // некорректные данные, то сообщить об этом.
    private static void task23() {

        System.out.println("\n>> Task #23");
        // TODO
    }


    // Task #24
    // 24. Составить программу, определяющую результат
    // гадания на ромашке — «любит—не любит», взяв за исходное
    // данное количество лепестков п.
    private static void task24(int n) {

        System.out.println("\n>> Task #24");
        // TODO
    }

    // Task #25
    // 25. Написать программу — модель анализа пожарного датчика в помещении,
    // которая выводит сообщение
    // «Пожароопасная ситуация », если температура в комнате превысила 60° С.
    private static void task25(int t) {

        System.out.println("\n>> Task #25");
        // TODO
    }

    // Task #26
    // 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
    private static void task26(int x, int y, int z) {

        System.out.println("\n>> Task #26");
        // TODO
    }


    // Task #27
    // 27. Найти max{min(a, b), min(c, d)}.
    private static void task27(int a, int b, int c, int d) {

        System.out.println("\n>> Task #27");
        // TODO
    }


    // Task #28
    // 28. Даны три числа a, b, с. Определить, какое из них равно d.
    // Если ни одно не равно d, то найти max(d — a, d — b, d — c).
    private static void task28(int a, int b, int c, int d) {

        System.out.println("\n>> Task #28");
        // TODO
    }


    // Task #29
    // 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    // Определить, будут ли они расположены на одной прямой.
    private static void task29(double x1, double y1,
                               double x2, double y2,
                               double x3, double y3) {

        System.out.println("\n>> Task #29");
        // TODO
    }


    // Task #30
    // 30. Даны действительные числа а,b,с. Удвоить эти числа,
    // если а > b > с, и заменить их абсолютными значениями, если
    // это не так.
    private static void task30(int a, int b, int c) {

        System.out.println("\n>> Task #30");
        // TODO
    }
}
