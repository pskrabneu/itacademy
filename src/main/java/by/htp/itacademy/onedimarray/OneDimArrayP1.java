package by.htp.itacademy.onedimarray;

public class OneDimArrayP1 {

    public static void main(String[] args) {
//        task01(5);
        task02();


    }


    // Task #01
    // 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    private static void task01(int k) {
        System.out.println("\n>> Task #01");

        int[] intArray = new int[]{10, 54, 59, 55, 30, 95, 24, 1, 85, 26, 15, 38};

        int tempSum;
        int sizeArray;

        sizeArray = intArray.length;
        tempSum = 0;

        for (int i = 0; i < sizeArray; i++) {

            if (intArray[i] % k == 0) {
                tempSum += intArray[i];
            }
        }

        System.out.println("Sum of elements = " + tempSum);
    }


    // Task #02
    // 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
    private static void task02() {
        System.out.println("\n>> Task #02");

        int[] array = new int[]{1, 2, 0, 8, 5, 6, 0, 45, 0, 47, 16, 0, 63, 9};


        int sizeArray;
        sizeArray = array.length;

        int j;
        j = 0;

        for (int i = 0; i < sizeArray; i++) {

            if (array[i] == 0) {
                j++;
            }
        }

        int[] arrayNull = new int[j];

        for (int i = 0; i < sizeArray; i++) {

            if (array[i] == 0) {

                // TODO
                for ()
                arrayNull[j] = i;
                j++;
            }
        }

        System.out.println(arrayNull);
        // TODO

    }


    // Task #03
    // 03. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное // или отрицательное.
    private static void task03() {
        System.out.println("\n>> Task #03");
        // TODO

    }


    // Task #04
    // 04. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
    private static void task04() {
        System.out.println("\n>> Task #04");
        // TODO

    }


    // Task #05
    // 05. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой
    // последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
    private static void task05() {
        System.out.println("\n>> Task #05");
        // TODO

    }


    // Task #06
    // 06. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти
    // числа.
    private static void task06() {
        System.out.println("\n>> Task #06");
        // TODO

    }


    // Task #07
    // 07. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
    // большие данного Z, этим числом. Подсчитать  количество замен.
    private static void task07() {
        System.out.println("\n>> Task #07");
        // TODO

    }


    // Task #08
    // 08. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    // положительных и нулевых элементов.
    private static void task08() {
        System.out.println("\n>> Task #08");
        // TODO

    }


    // Task #09
    // 09. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
    private static void task09() {
        System.out.println("\n>> Task #09");
        // TODO

    }


    // Task #10
    // 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    private static void task10() {
        System.out.println("\n>> Task #10");
        // TODO

    }


    // Task #11
    // 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них,
    // у которых остаток от деления на М равен L (0 < L < М-1).
    private static void task11() {
        System.out.println("\n>> Task #11");
        // TODO

    }


    // Task #12
    // 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
    // простыми числами.
    private static void task12() {
        System.out.println("\n>> Task #12");
        // TODO

    }


    // Task #13
    // 13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
    // промежутке от L до N.
    private static void task13() {
        System.out.println("\n>> Task #13");
        // TODO

    }


    // Task #14
    // 14. Дан одномерный массив A[N]. Найти:
    // max(a2,a4,,a2k) + min(a1,a3,,a2k+1)
    private static void task14() {
        System.out.println("\n>> Task #14");
        // TODO

    }


    // Task #15
    // 15. Дана последовательность действительных чисел
    // a1,a2,,an . Указать те ее элементы, которые принадлежат отрезку
    // [с, d].
    private static void task15() {
        System.out.println("\n>> Task #15");
        // TODO

    }


    // Task #16
    // 16. Даны действительные числа
    // a1,a2,,an . Найти
    // max(a1 + a2n,a2 + a2n−1,,an + an+1).
    private static void task16() {
        System.out.println("\n>> Task #16");
        // TODO

    }


    // Task #17
    // 17. Дана последовательность целых чисел
    // a1,a2,,an . Образовать новую последовательность, выбросив из исходной
    // те члены, которые равны min(a1,a2,,an).
    private static void task17() {
        System.out.println("\n>> Task #17");
        // TODO

    }


    // Task #18
    // 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить
    // игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
    // передних гранях кубиков равна 10. (Iгральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
    // которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
    private static void task18() {
        System.out.println("\n>> Task #18");
        // TODO

    }


    // Task #19
    // 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
    // несколько, то определить наименьшее из них.
    private static void task19() {
        System.out.println("\n>> Task #19");
        // TODO

    }


    // Task #20
    // 20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
    // (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
    private static void task20() {
        System.out.println("\n>> Task #20");
        // TODO

    }


}
