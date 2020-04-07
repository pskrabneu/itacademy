package by.htp.itacademy.classesobjects.task05;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
//        единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//        произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//        позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class DecimalCounter {

    private int counter;
    private int maxCounter;
    private int minCounter;

    public int getMaxCounter() {
        return maxCounter;
    }

    public void setMaxCounter(int maxCounter) {
        this.maxCounter = maxCounter;
    }

    public int getMinCounter() {
        return minCounter;
    }

    public void setMinCounter(int minCounter) {
        this.minCounter = minCounter;
    }

    public DecimalCounter() {
        this.counter = 0;
        this.maxCounter = 1000;
        this.minCounter = -1000;
    }

    // Как быть, если логика проверки значения нужна в
    // 1. Конструкторе
    // 2. setCounter(int counter)
    // 3. в классе DecimalCounterLogic в функции incrementByOne(), decrementByOne()
    // ее повторять (копи-паст, не лучший вариант) или выносить?
    public DecimalCounter(int counter, int minCounter, int maxCounter) {

        if (counter < minCounter) {
            this.counter = Math.min(counter, minCounter);
        } else if (counter > maxCounter) {
            this.counter = Math.max(counter, maxCounter);
        } else {
            this.counter = counter;
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
