package by.htp.itacademy.multidimarray;

import by.htp.itacademy.util.*;

public class MultiDimArrayP4 {

    public static void main(String[] args) {

//        task31();
//        task32();
//        task33();
//        task34();
//        task35();
//        task36();
//        task37();
        task38();
//        task39();
//        task40();
    }


    // Task #31
// 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.
    private static void task31() {
        System.out.println("\n>> Task #31");
        // Skipped
    }


    // Task #32
// 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    private static void task32() {
        System.out.println("\n>> Task #32");
        // Skipped
    }


    // Task #33
// 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    private static void task33() {
        System.out.println("\n>> Task #33");
        // Skipped
    }


    // Task #34
// 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
    private static void task34() {
        System.out.println("\n>> Task #34");
        // Skipped
    }


    // Task #35
// 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    private static void task35() {
        System.out.println("\n>> Task #35");
        // Skipped
    }


    // Task #36
// 36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой
// получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
// Построить результат сглаживания заданной матрицы
    private static void task36() {
        System.out.println("\n>> Task #36");

        // Interesting to solve
// TODO

    }


    // Task #37
// 37. Переставить строки матрицы случайным образом.
    private static void task37() {
        System.out.println("\n>> Task #37");

        // Skipped
    }


    // Task #38
// 38. Найдите сумму двух матриц
    private static void task38() {
        System.out.println("\n>> Task #38");

        // Qty of Rows
        int rows = 4;

        // Qty of Columns
        int columns = 5;

        // array 1
        int[][] array1 = new int[rows][columns];

        // array2
        int[][] array2 = new int[rows][columns];

        // result array
        int[][] arrayResult = new int[rows][columns];

        // arrays init and sum
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                array1[i][j] = Util.getRandomNumber(-10, 35);
                array2[i][j] = Util.getRandomNumber(-20, 40);
                arrayResult[i][j] = array1[i][j] + array2[i][j];
            }
        }

        Util.print2DimArray(array1);

        System.out.println("<---------------------->");

        Util.print2DimArray(array2);

        System.out.println("<---------------------->");

        Util.print2DimArray(arrayResult);
    }


    // Task #39
// 39. Найдите произведение двух матриц.
    private static void task39() {
        System.out.println("\n>> Task #39");
        // Skipped
    }


    // Task #40
// 40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная
// из чисел 1, 2, 3, ..., n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух
// больших диагоналей равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3:
    private static void task40() {
        System.out.println("\n>> Task #40");

        int arrayDim = 4;

        int[][] arrayMagic = new int[arrayDim][arrayDim];


        // Interesting to solve


// TODO

    }


}
