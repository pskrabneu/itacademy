package by.htp.itacademy.classesobjects.task05;

public class DecimalArray {

    public static void main(String[] args) {

        DecimalCounter dc1 = new DecimalCounter();
        DecimalCounter dc2 = new DecimalCounter(10, -100, 100);
        DecimalCounter dc3 = new DecimalCounter(999, -1000, 1000);
        DecimalCounter dc4 = new DecimalCounter(-2000, -1000, 1000);
        DecimalCounter dc5 = new DecimalCounter(2000, -1000, 1000);

        DecimalCounterLogic dcLogic = new DecimalCounterLogic();

        System.out.println("Before increase = " + dc1.getCounter());
        dcLogic.incrementByOne(dc1);
        System.out.println("After increase = " + dc1.getCounter());
        dcLogic.decrementByOne(dc1);
        System.out.println("After decrement = " + dc1.getCounter());

        System.out.println("Before increase = " + dc2.getCounter());
        dcLogic.incrementByOne(dc2);
        System.out.println("After increase = " + dc2.getCounter());
        dcLogic.decrementByOne(dc2);
        System.out.println("After decrement = " + dc2.getCounter());

        System.out.println("Before increase = " + dc3.getCounter());
        System.out.println("Before increase = " + dc4.getCounter());
        dcLogic.decrementByOne(dc4);
        System.out.println("After decrement = " + dc4.getCounter());

        System.out.println("<------>");
        System.out.println("Before increase = " + dc5.getCounter());
        dcLogic.decrementByOne(dc5);
        dcLogic.decrementByOne(dc5);
        dcLogic.decrementByOne(dc5);
        dcLogic.decrementByOne(dc5);
        System.out.println("After decrement by 4 = " + dc5.getCounter());
        dcLogic.incrementByOne(dc5);
        dcLogic.incrementByOne(dc5);
        System.out.println("After increase by 2 = " + dc5.getCounter());


    }
}
