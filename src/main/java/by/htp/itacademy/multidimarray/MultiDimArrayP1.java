package by.htp.itacademy.multidimarray;

import by.htp.itacademy.util.Util;

public class MultiDimArrayP1 {

    public static void main(String[] args) {

//        task01();
//        task02();
//        task03();
//        task04();
//        task05();
//        task06();
//        task07();
//        task08();
//        task09();
//        task10();
        task11(); // TODO
//        task12();
//        task13();
//        task14();
//        task15();
//        task16();
//        task17();
//        task18();
//        task19();
//        task20();
//        task21();
//        task22();
//        task23();
//        task24();
//        task25();
//        task26();
//        task27();
//        task28();
//        task29();
//        task30();
//        task31();
//        task32();
//        task33();
//        task34();
//        task35();
//        task36();
//        task37();
//        task38();
//        task39();
//        task40();
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


    // Task #11
// 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
// первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.
    private static void task11() {
        System.out.println("\n>> Task #11");

        int xColumn;
        int xRow;

        int lowValue;
        int highValue;

        xColumn = 8;
        xRow = 6;

        lowValue = -10;
        highValue = 35;

        int[][] array = new int[xColumn][xRow];

        // array init
        for (int i = 0; i < xColumn; i++) {

            for (int j = 0; j < xRow; j++) {
                array[i][j] = Util.getRandomNumber(lowValue, highValue);
            }
        }

        // array transformation and print



// TODO

    }


    // Task #12
// 12. Получить квадратную матрицу порядка n:
    private static void task12() {
        System.out.println("\n>> Task #12"
// TODO
        );
    }


    // Task #13
// 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task13() {
        System.out.println("\n>> Task #13"
// TODO
        );
    }


    // Task #14
// 14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task14() {
        System.out.println("\n>> Task #14"
// TODO
        );
    }


    // Task #15
// 15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task15() {
        System.out.println("\n>> Task #15"
// TODO
        );
    }


    // Task #16
// 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task16() {
        System.out.println("\n>> Task #16"
// TODO
        );
    }


    // Task #17
// 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task17() {
        System.out.println("\n>> Task #17"
// TODO
        );
    }


    // Task #18
// 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task18() {
        System.out.println("\n>> Task #18"
// TODO
        );
    }


    // Task #19
// 19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task19() {
        System.out.println("\n>> Task #19"
// TODO
        );
    }


    // Task #20
// 20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task20() {
        System.out.println("\n>> Task #20"
// TODO
        );
    }


    // Task #21
// 21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task21() {
        System.out.println("\n>> Task #21"
// TODO
        );
    }

    // Task #22
// 22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task22() {
        System.out.println("\n>> Task #22"
// TODO
        );
    }


    // Task #23
// 23. Сформировать квадратную матрицу порядка N по правилу: и подсчитать количество положительных элементов в ней.
    private static void task23() {
        System.out.println("\n>> Task #23"
// TODO
        );
    }


    // Task #24
// 24. Дан линейный массив x1, x2,, xn-1, xn . Получить действительную квадратную матрицу порядка n:
    private static void task24() {
        System.out.println("\n>> Task #24"
// TODO
        );
    }


    // Task #25
// 25. Получить квадратную матрицу порядка n:
    private static void task25() {
        System.out.println("\n>> Task #25"
// TODO
        );
    }


    // Task #26
// 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
// а) вычислить сумму отрицательных элементов в каждой строке;
// б) определить максимальный элемент в каждой строке;
// в) переставить местами максимальный и минимальный элементы матрицы.
    private static void task26() {
        System.out.println("\n>> Task #26"
// TODO
        );
    }


    // Task #27
// 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
    private static void task27() {
        System.out.println("\n>> Task #27"
// TODO
        );
    }


    // Task #28
// 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.
    private static void task28() {
        System.out.println("\n>> Task #28"
// TODO
        );
    }


    // Task #29
// 29. Найти положительные элементы главной диагонали квадратной матрицы.
    private static void task29() {
        System.out.println("\n>> Task #29"
// TODO
        );
    }


    // Task #30
// 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
    private static void task30() {
        System.out.println("\n>> Task #30"
// TODO
        );
    }


    // Task #31
// 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.
    private static void task31() {
        System.out.println("\n>> Task #31"
// TODO
        );
    }


    // Task #32
// 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    private static void task32() {
        System.out.println("\n>> Task #32"
// TODO
        );
    }


    // Task #33
// 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    private static void task33() {
        System.out.println("\n>> Task #33"
// TODO
        );
    }


    // Task #34
// 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
    private static void task34() {
        System.out.println("\n>> Task #34"
// TODO
        );
    }


    // Task #35
// 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    private static void task35() {
        System.out.println("\n>> Task #35"
// TODO
        );
    }


    // Task #36
// 36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат сглаживания заданной матрицы
    private static void task36() {
        System.out.println("\n>> Task #36"
// TODO
        );
    }


    // Task #37
// 37. Переставить строки матрицы случайным образом.
    private static void task37() {
        System.out.println("\n>> Task #37"
// TODO
        );
    }


    // Task #38
// 38. Найдите сумму двух матриц
    private static void task38() {
        System.out.println("\n>> Task #38"
// TODO
        );
    }


    // Task #39
// 39. Найдите произведение двух матриц.
    private static void task39() {
        System.out.println("\n>> Task #39"
// TODO
        );
    }


    // Task #40
// 40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3:
    private static void task40() {
        System.out.println("\n>> Task #40"
// TODO
        );
    }


}
