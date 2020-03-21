package by.htp.itacademy.decomposition;


// Task #09
// 09. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class DecompositionTask09 {

    public static void main(String[] args) {
        System.out.println("\n>> Task #09");

        int x;
        int y;
        int z;

        x = 8;
        y = 48;
        z = 24;

        System.out.println(gcd(gcd(x, y), z));
    }

    private static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }





}
