package by.htp.itacademy.decomposition;

import static java.lang.Math.min;
import static java.lang.Math.max;


// Task #08
// 08. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//    которое меньше     максимального элемента     массива,     но больше     всех других     элементов).
public class DecompositionTask08 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #08");

        int[] array = new int[] {200, 1, 802, 4, 5964, 2003, -2, 0, -58, 58, 4, 69, 2003, 5964};

        int theBiggest;
        int theAfterBiggest;
        int sizeArray;

        theAfterBiggest = Integer.MIN_VALUE;
        theBiggest = Integer.MIN_VALUE + 1;

        sizeArray = array.length;

        for (int i = 0; i < sizeArray; i++) {
            if (array[i] != theBiggest) {
                theAfterBiggest = getMiddle(theBiggest, theAfterBiggest, array[i]);
                theBiggest = max(array[i], theBiggest);
            }
        }

        System.out.println("Max = " + theBiggest);
        System.out.println("After max = " + theAfterBiggest);
    }

    private static int getMiddle(int x, int y, int z) {

        return min(
                max(x, min(y, z)),
                max(min(x, y), z));
    }
}
