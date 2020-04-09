package by.htp.itacademy.classesobjects.task05;

public class DecimacCounterLogic {

    public void incrementByOne(DecimalCounter counter) {
        counter.setCounter(counter.getCounter() + 1, counter.getMinCounter(), counter.getMaxCounter());
    }

    public void decrementByOne(DecimalCounter counter) {
        counter.setCounter(counter.getCounter() - 1, counter.getMinCounter(), counter.getMaxCounter());
    }


}
