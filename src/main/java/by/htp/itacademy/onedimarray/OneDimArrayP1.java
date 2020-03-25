package by.htp.itacademy.onedimarray;

import java.util.LinkedList;

import static by.htp.itacademy.util.Util.getRandomNumber;

public class OneDimArrayP1 {

    public static void main(String[] args) {
        task01(5);
        task02();
        task03();
        task04();
        task05();
        task06();
        task07(16);
        task08();
        task09();
        task10();
        task11(7, 11);
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
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

        // get size of array where [0]
        for (int i = 0; i < sizeArray; i++) {

            if (array[i] == 0) {
                j++;
            }
        }

        int[] arrayNull = new int[j];

        // counter for arrayNull
        int y = 0;

        for (int i = 0; i < sizeArray; i++) {

            if (array[i] == 0) {

                arrayNull[y] = i;
                y++;
            }
        }

        for (int i = 0; i < y; i++) {

            System.out.println(arrayNull[i]);
        }
    }


    // Task #03
    // 03. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше
    // - положительное или отрицательное.
    private static void task03() {
        System.out.println("\n>> Task #03");
        // TODO

    }


    // Task #04
    // 04. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
    private static void task04() {
        System.out.println("\n>> Task #04");

        int[] array = new int[]{8, 12, 18, 18, 89};

        // isArise: 0 -- decrement, 1 -- strait line, 2 -- increment, 3 -- mixed
        int isArise;
        isArise = 1;

        int sizeArray;
        sizeArray = array.length;

        for (int i = 0; i < sizeArray - 1; i++) {

            if (array[i] == array[i + 1]) {

                continue;
            } else if (array[i] > array[i + 1] && isArise != 2 && isArise != 3) {

                isArise = 0;
            } else if (array[i] < array[i + 1] && isArise != 0 && isArise != 3) {

                isArise = 2;
            } else {

                isArise = 3;
            }
        }

        switch (isArise) {
            case 0:
                System.out.println("Sequence is decrease = " + isArise);
                break;

            case 1:
                System.out.println("Sequence is strait = " + isArise);
                break;

            case 2:
                System.out.println("Sequence is increase = " + isArise);
                break;

            default:
                System.out.println("Sequence is mixed = " + isArise);
        }
    }


    // Task #05
    // 05. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой
    // последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
    private static void task05() {
        System.out.println("\n>> Task #05");

        int[] arrayInt = new int[]{1, 7, 5, 66, 7, 83, 61, 69};

        LinkedList<Integer> array = new LinkedList<>();

        int sizeArray = arrayInt.length;

        for (int i = 0; i < sizeArray; i++) {

            if (arrayInt[i] % 2 == 0) {

                array.add(arrayInt[i]);
            }
        }

        if (array.isEmpty()) {

            System.out.println("There is no even elements!");
        } else {
            System.out.println(array.toString());
        }
    }


    // Task #06
    // 06. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти
    // числа.
    private static void task06() {
        System.out.println("\n>> Task #06");

        int[] arrayInt = new int[]{11, 2, 4, 6, 3, 7, 18, 12, 7, 4, 8, 9};

        int maximum;
        int minimum;
        int arraySize;

        maximum = Integer.MIN_VALUE;
        minimum = Integer.MAX_VALUE;

        arraySize = arrayInt.length;

        for (int i = 0; i < arraySize; i++) {

            maximum = Math.max(arrayInt[i], maximum);
            minimum = Math.min(arrayInt[i], minimum);
        }

        System.out.println("The length is = " + (maximum - minimum));
    }


    // Task #07
    // 07. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
    // большие данного Z, этим числом. Подсчитать  количество замен.
    private static void task07(int x) {
        System.out.println("\n>> Task #07");
        // Skipped

        // TODO

    }

    // Task #08
    // 08. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    // положительных и нулевых элементов.
    private static void task08() {
        System.out.println("\n>> Task #08");
        // Skipped
        // TODO

    }


    // Task #09
    // 09. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
    private static void task09() {
        System.out.println("\n>> Task #09");
        // Skipped
        // TODO

    }


    // Task #10
    // 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    private static void task10() {
        System.out.println("\n>> Task #10");

        int[] array = new int[]{2, 5, 6, 34, 7, 12, 3, 9, 3, 1, 0, 1, 65, 32};

        int arraySize = array.length;

        for (int i = 0; i < arraySize; i++) {

            if (array[i] > i) {

                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("\b\b");
    }


    // Task #11
    // 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них,
    // у которых остаток от деления на М равен L (0 < L < М-1).
    private static void task11(int l, int m) {
        System.out.println("\n>> Task #11");

        int[] array = new int[]{2, 5, 29, 9, 71, 56, 40, 12, 64, 37, 22, 15, 17, 18};

        int arraySize;
        arraySize = array.length;

        for (int i = 0; i < arraySize; i++) {

            if (array[i] % m == l) {

                System.out.print(array[i] + ", ");
            }
        }

        System.out.print("\b\b");
    }


    // Task #12
    // 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
    // простыми числами.
    private static void task12() {
        System.out.println("\n>> Task #12");
        // Skipped
        // TODO

    }


    // Task #13
    // 13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
    // промежутке от L до N.
    private static void task13() {
        System.out.println("\n>> Task #13");

        // Skipped
        // TODO

    }


    // Task #14
    // 14. Дан одномерный массив A[N]. Найти:
    // max(a2,a4,,a2k) + min(a1,a3,,a2k+1)
    private static void task14() {
        System.out.println("\n>> Task #14");

        int[] array = new int[]{2, 4, 5, 8, 4, 5, 0, 4, 5, 8, 7, 9, 6, 6, 3, 4, 7, 10, 6, 7, 12};

        int minimum;
        int maximum;
        int arraySize;

        minimum = Integer.MAX_VALUE;
        maximum = Integer.MIN_VALUE;
        arraySize = array.length;

        for (int i = 0; i < arraySize; i++) {

            if (i % 2 == 0) {

                // for even
                maximum = Math.max(array[i], maximum);
            } else {

                // for odd
                minimum = Math.min(array[i], minimum);
            }
        }

        System.out.println("Max = " + maximum);
        System.out.println("Min = " + minimum);

        System.out.println(maximum + minimum);
    }


    // Task #15
    // 15. Дана последовательность действительных чисел
    // a1,a2,,an . Указать те ее элементы, которые принадлежат отрезку
    // [с, d].
    private static void task15() {
        System.out.println("\n>> Task #15");
        // Skip
        // TODO

    }


    // Task #16
    // 16. Даны действительные числа
    // a1,a2,,an . Найти
    // max(a1 + a2n,a2 + a2n−1,,an + an+1).
    private static void task16() {
        System.out.println("\n>> Task #16");

        double[] array = new double[]{0, 3, 5, 6, 2, 7, 2, 4.7, 4, 6.7, 2.5,
                3.7, 6, 7, 2, 61, 7, 5.7, 2.4, 1.7, 4, 6, 9, 0, 7.8, 45, 3, 7};

        double maximum;
        int arraySemiSize;

        maximum = Double.MIN_VALUE;
        arraySemiSize = array.length / 2;

        for (int i = 0; i < arraySemiSize * 2; i += 2) {

            maximum = Math.max(array[i] + array[i + 1], maximum);
        }

        System.out.println("Max = " + maximum);
    }


    // Task #17
    // 17. Дана последовательность целых чисел
    // a1,a2,,an . Образовать новую последовательность, выбросив из исходной
    // те члены, которые равны min(a1,a2,,an).
    private static void task17() {
        System.out.println("\n>> Task #17");
        // Skipped
        // TODO

    }


    // Task #18
    // 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить
    // игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
    // передних гранях кубиков равна 10. (Iгральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
    // которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
    private static void task18() {
        System.out.println("\n>> Task #18");

        int position01;
        int position02;

        int[] array = new int[10];

        int xSide01;
        int xSide02;

        int counter = 0;
        boolean isEquals10 = false;

        position01 = 2;
        position02 = 6;
        xSide01 = 6;
        xSide02 = 1;

        do {

            counter++;

            // init array and check sum
            isEquals10 = isEquals(arrayInit(position01, position02,
                    xSide01, xSide02, array),
                    10, 3);

        } while (!isEquals10);

        System.out.println((counter - 1));
    }


    // Task #19
    // 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
    // несколько, то определить наименьшее из них.
    private static void task19() {
        System.out.println("\n>> Task #19");
        // Skipped
        // TODO

    }


    // Task #20
    // 20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
    // (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
    private static void task20() {
        System.out.println("\n>> Task #20");
        // Skipped
        // TODO

    }

    // array init
    // p1 -- position 1, p2 -- position 2
    // x1 -- value in position 1, x2 -- value in position 2
    // size -- size of Array
    private static int[] arrayInit(int p1, int p2, int x1, int x2, int[] array) {

        int size = array.length;

        for (int i = 0; i < size; i++) {

            if (i == p1 || i == p2) {

                array[p1] = x1;
                array[p2] = x2;
            } else {

                array[i] = getRandomNumber(1, 6);
            }
        }

        return array;
    }

    // calculate sum of sequence with 3 neighbor elements in array
    // array -- array of int elements
    // mustEquals -- what its should be equals
    // seq -- qty of elements in line
    private static boolean isEquals(int[] array, int mustEquals, int seq) {

        int arraySize = array.length;
        int sumOfSeq;
        boolean b = false;

        for (int i = 0; i < (arraySize - seq + 1); i++) {

            sumOfSeq = array[i] + array[i + 1] + array[i + 2];

            if (sumOfSeq == mustEquals) {
                b = true;
                System.out.println(array[i] + ", "  + array[i + 1] + ", " + array[i + 2]);
                break;
            } else {
                b = false;
            }
        }

        return b;
    }




}
