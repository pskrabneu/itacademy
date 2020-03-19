package by.htp.itacademy.decomposition;

import static by.htp.itacademy.util.Util.distanceBetweenTwoPoints;

import by.htp.itacademy.util.Point;


// Task #07
// 07. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
// пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
public class DecompositionTask07 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #07");

        double[][] points = new double[][]{
                {-6, -4, -3, -1, 1, 4, 7},
                {6, 4, 3, 1, 1, 3, 7}
        };

        double distance;
        int size;
        double temp;

        distance = 0;

        size = points[0].length;

        Point[] pointArray = new Point[size];

        // initiate the array of Points
        for (int i = 0; i < size; i++) {

            pointArray[i] = new Point(points[0][i], points[1][i]);
        }

        for (int i = 0; i <= (size - 2); i++) {

            for (int j = i + 1; j <= (size - 1); j++) {

                temp = distanceBetweenTwoPoints(pointArray[i], pointArray[j]);

                if (temp > distance) {

                    distance = temp;
                }
            }
        }

        System.out.println("Max distance = " + distance);
    }
}
