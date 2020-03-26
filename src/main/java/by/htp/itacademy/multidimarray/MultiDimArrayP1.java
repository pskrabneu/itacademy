package by.htp.itacademy.multidimarray;

import by.htp.itacademy.util.Util;

public class MultiDimArrayP1 {

    public static void main(String[] args) {

        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();
        task09();
        task10();
    }

    // Task #01
// 01. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
// была ровно одна единица, и вывести на экран.
    private static void task01() {
        System.out.println("\n>> Task #01");

        int dimColumn = 3;
        int dimRow = 4;

        int[][] array = new int[dimColumn][dimRow];

        for (int i = 0; i < dimColumn; i++) {

            for (int j = 0; j < dimRow; j++) {

                if (j == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < dimColumn; i++) {

            for (int j = 0; j < dimRow; j++) {

                System.out.print(array[i][j] + ", ");
            }

            System.out.println("\b\b");
        }
    }


    // Task #02
// 02. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
    private static void task02() {
        System.out.println("\n>> Task #02");

        int xColumn;
        int xRow;

        xRow = 2;
        xColumn = 3;

        int[][] array = new int[xRow][xColumn];

        for (int i = 0; i < xRow; i++) {

            for (int j = 0; j < xColumn; j++) {
                array[i][j] = Util.getRandomNumber(0, 9);
            }
        }

        Util.print2DimArray(array);
    }


    // Task #03
// 03. Дана матрица. Вывести на экран первый и последний столбцы.
    private static void task03() {
        System.out.println("\n>> Task #03");
        // Skipped
// TODO

    }


    // Task #04
// 04. Дана матрица. Вывести на экран первую и последнюю строки.
    private static void task04() {
        System.out.println("\n>> Task #04");
        // Skipped
// TODO

    }


    // Task #05
// 05. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
    private static void task05() {
        System.out.println("\n>> Task #05");

        int[][] array = new int[][]{
                {2, 5, 2, 8, 2, 6, 7, 19, 67, 2, 9, 0, 3, 5, 1},
                {4, 9, 6, 7, 12, 12, 4, 5, 6, 8, 7, 9, 3, 6, 7},
                {3, 2, 4, 6, 5, 4, 6, 8, 7, 3, 12, 6, 8, 4, 6, 5, 1},
                {9, 8, 0, 9, 8, 3, 40, 5, -9, -3, 4, 9, 5, -3, 9, 5, 6},
                {6, 5, 4, 6, 21, 3, 2, 1, 4, 6, 57, 4, -9, 8, 7, 9},
                {5, 4, 6, 2, 1, 3, 2, 13, 5, 4, 6, 5, 4, 6},
                {4, 3, 1, 21, 6, 5, 4, 9, -7, 3, 2, 4, -9, 8, 7}
        };

        int arraySize;

        arraySize = array.length;

        for (int i = 0; i < arraySize; i++) {

            if (i % 2 == 0 && i != 0) {

                Util.print1DimArray(array[i]);
            }
        }
    }


    // Task #06
// 06. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    private static void task06() {
        System.out.println("\n>> Task #06");
        // Skipped
// TODO

    }


    // Task #07
// 07. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
    private static void task07() {
        System.out.println("\n>> Task #07");
                // Skipped
// TODO

    }


    // Task #08
// 08. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.
    private static void task08() {
        System.out.println("\n>> Task #08");
        // Skipped


// TODO

    }


    // Task #09
// 09. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    private static void task09() {
        System.out.println("\n>> Task #09");

        int[][] array = new int[][]{
                {2, 5, 2, 8, 2, 6, 7},
                {4, 9, 6, 7, 12, 12, 4},
                {3, 2, 4, 6, 5, 4, 6},
                {9, 8, 0, 9, 8, 3, 40},
                {6, 5, 4, 6, 21, 3, 2},
                {5, 4, 6, 2, 1, 3, 2},
                {4, 3, 1, 21, 6, 5, 4}
        };

        int arraySize = array.length;

        for (int i = 0; i < arraySize; i++) {

            for (int j = 0; j < arraySize; j++) {

                if (i == j) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }


    // Task #10
// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    private static void task10() {
        System.out.println("\n>> Task #10");
        // Skipped
// TODO
    }
}
