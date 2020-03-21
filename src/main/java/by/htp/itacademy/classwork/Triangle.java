package by.htp.itacademy.classwork;


import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
// вычисления площади, периметра и точки пересечения медиан.
public class Triangle extends Point {

    private Point p1;
    private Point p2;
    private Point p3;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Triangle(Point p1, Point p2, Point p3) {

        if (isPossible(p1, p2, p3)) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    private boolean isPossible(Point p1, Point p2, Point p3) {
        double a = distanceBetweenTwoPoints(p1, p2);
        double b = distanceBetweenTwoPoints(p2, p3);
        double c = distanceBetweenTwoPoints(p3, p1);

        if (a == b + c || b == c + a || c == a + b) {
            return false;
        } else {
            return true;
        }
    }

    // distance between 2 points with given coordinates
    private double distance(double x1, double y1,
                            double x2, double y2) {
        return sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2), 2));
    }

    // calculate distance between 2 Points
    private double distanceBetweenTwoPoints(Point p1, Point p2) {

        return distance(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    // calculate perimeter
    private double calculatePerimeter(Triangle triangle) {

        double a = distanceBetweenTwoPoints(triangle.p1, triangle.p2);
        double b = distanceBetweenTwoPoints(triangle.p2, triangle.p3);
        double c = distanceBetweenTwoPoints(triangle.p3, triangle.p1);

        return a + b + c;
    }

    // calculate area
    private double calculateArea(Triangle triangle) {
        double semiPerimeter = calculatePerimeter(triangle) / 2;

        double a = distanceBetweenTwoPoints(triangle.p1, triangle.p2);
        double b = distanceBetweenTwoPoints(triangle.p2, triangle.p3);
        double c = distanceBetweenTwoPoints(triangle.p3, triangle.p1);

        return sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    // calculate point of medians intersection
//    private double calculateMediansIntersection(Triangle triangle) {
//
//    }

}
