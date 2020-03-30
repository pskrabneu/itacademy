package by.htp.itacademy.classesobjects.task02;

// 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
//инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
public class Test2 {

    private int value01;
    private int value02;

    public Test2(int v1, int v2) {

        this.value01 = v1;
        this.value02 = v2;
    }

    public Test2() {

        this.value01 = 0;
        this.value02 = 1;
    }

    public int getValue01() {
        return value01;
    }

    public void setValue01(int value01) {
        this.value01 = value01;
    }

    public int getValue02() {
        return value02;
    }

    public void setValue02(int value02) {
        this.value02 = value02;
    }
}
