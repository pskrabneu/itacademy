package by.htp.itacademy.classesobjects.task01;


//1. Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
//        Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
//        из этих двух переменных.
public class Test1 {

    private int variable01;

    private int variable02;

    public int getVariable01() {
        return variable01;
    }

    public void setVariable01(int variable01) {
        this.variable01 = variable01;
    }

    public int getVariable02() {
        return variable02;
    }

    public void setVariable02(int variable02) {
        this.variable02 = variable02;
    }

    public void printVariables() {

        System.out.println("Variable01 = " + this.variable01);
        System.out.println("Variable02 = " + this.variable02);
    }

    public int getMaximum() {

        return Math.max(this.variable01, this.variable02);
    }

    public int getSum() {

        return this.variable01 + this.variable02;
    }
}
