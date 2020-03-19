package by.htp.itacademy.decomposition;

import static java.lang.Math.min;
import static java.lang.Math.max;


// Task #08
// 08. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//    которое меньше     максимального элемента     массива,     но больше     всех других     элементов).
public class DecompositionTask08 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #08");

        int[] array = new int[] {202, 1, 8, 4, 10, 2003, -2, 0, 18, 58, 4, 69, 7020};

        int theBiggest;
        int theAfterBiggest;
        int sizeArray;

        // for dell
        int temp1;
        int temp2;

        theAfterBiggest = Integer.MAX_VALUE;
        theBiggest = Integer.MIN_VALUE;

        sizeArray = array.length;

        for (int i = 0; i < sizeArray; i++) {

            theBiggest = max(array[i], theBiggest);

            temp1 = min(theBiggest, theAfterBiggest);
            temp2 = min(theAfterBiggest, array[i]);

            System.out.println(">>>" + i + " = " + array[i]);
            System.out.println("temp1 = " + temp1 + ", temp2 = " + temp2);


        }

        System.out.println(theBiggest);
        System.out.println(theAfterBiggest);


        // TODO

    }

















}
