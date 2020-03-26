package by.htp.itacademy.multidimarray;

import by.htp.itacademy.util.Util;

public class MultiDimArrayP2 {

    public static void main(String[] args) {

//        task11();
//        task12();
//        task13();
//        task14();
        task15();
//        task16();
//        task17();
//        task18();
//        task19();
//        task20();
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

        int[][] array = new int[xRow][xColumn];

        // array init
        for (int i = 0; i < xRow; i++) {

            for (int j = 0; j < xColumn; j++) {
                array[i][j] = Util.getRandomNumber(lowValue, highValue);
            }
        }

        // print array before in normal order
        Util.print2DimArray(array);

        System.out.println("<--------------------------->");

        // array transformation and print
        for (int i = 0; i < xRow; i++) {

            if ((i + 2) % 2 == 0) {

                Util.print1DimArray(array[i]);
            } else {

                for (int j = (xColumn - 1); j >= 0; j--) {

                    System.out.print(array[i][j] + ", ");
                }
                System.out.println("\b\b");
            }
        }
    }


    // Task #12
// 12. Получить квадратную матрицу порядка n:
    private static void task12() {
        System.out.println("\n>> Task #12");

        int xDim;

        xDim = 12;

        int[][] array = new int[xDim][xDim];

        // init array
        for (int i = 0; i < xDim; i++) {

            for (int j = 0; j < xDim; j++) {

                if (j == i) {

                    array[i][j] = j;
                } else {

                    array[i][j] = 0;
                }
            }
        }

        Util.print2DimArray(array);
    }


    // Task #13
// 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task13() {
        System.out.println("\n>> Task #13");

        int arrayDim;

        arrayDim = 5;

        int[][] array = new int[arrayDim][arrayDim];

        // init array
        for (int i = 0; i < arrayDim; i++) {

            if ((i + 2) % 2 == 0) {

                for (int j = 0; j < arrayDim; j++) {

                    array[i][j] = j + 1;
                }
            } else {

                for (int j = 0; j < arrayDim; j++) {

                    array[i][j] = arrayDim - j;
                }
            }
        }

        Util.print2DimArray(array);
    }


    // Task #14
// 14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task14() {
        System.out.println("\n>> Task #14");

        int arrayDim;

        arrayDim = 10;

        int[][] array = new int[arrayDim][arrayDim];

        // init array
        for (int i = 0; i < arrayDim; i++) {

            for (int j = 0; j < arrayDim; j++) {

                if ((i + 1) == (arrayDim - j)) {

                    array[i][j] = i + 1;
                } else {

                    array[i][j] = 0;
                }
            }
        }

        Util.print2DimArray(array);
    }


    // Task #15
// 15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task15() {
        System.out.println("\n>> Task #15");

        int arrayDim;

        arrayDim = 8;

        int[][] array = new int[arrayDim][arrayDim];

        for (int i = 0; i < arrayDim; i++) {

            for (int j = 0; j < arrayDim; j++) {

                if (j == i) {

                    array[i][j] = arrayDim - i;
                } else {

                    array[i][j] = 0;
                }
            }
        }

        Util.print2DimArray(array);
    }


    // Task #16
// 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task16() {
        System.out.println("\n>> Task #16");
// TODO

    }


    // Task #17
// 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task17() {
        System.out.println("\n>> Task #17");
// TODO

    }


    // Task #18
// 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task18() {
        System.out.println("\n>> Task #18");
// TODO

    }


    // Task #19
// 19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task19() {
        System.out.println("\n>> Task #19");
// TODO

    }


    // Task #20
// 20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    private static void task20() {
        System.out.println("\n>> Task #20");
// TODO

    }
}
