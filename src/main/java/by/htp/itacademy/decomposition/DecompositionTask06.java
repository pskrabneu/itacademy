package by.htp.itacademy.decomposition;

import static by.htp.itacademy.util.Util.calculateAreaOfTriangle;


// Task #06
// 06. Вычислить площадь правильного шестиугольника со стороной а,
// используя метод вычисления площади треугольника.
public class DecompositionTask06 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #06");
        // TODO

        double a;

        a = 6.25;

        System.out.println("The area of hexagon with side " + a);
        System.out.println("is " + (calculateAreaOfTriangle(a, a, a) * 6));
    }
}
