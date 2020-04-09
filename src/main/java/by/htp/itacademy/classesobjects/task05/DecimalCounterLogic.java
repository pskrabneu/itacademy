package by.htp.itacademy.classesobjects.task05;

public class DecimalCounterLogic {

    public void incrementByOne(DecimalCounter counter) {

        int increasedCounter = counter.getCounter() + 1;
        counter.setCounter(increasedCounter, counter.getMinCounter(), counter.getMaxCounter());
    }

    public void decrementByOne(DecimalCounter counter) {

        int decreasedCounter = counter.getCounter() - 1;
        counter.setCounter(decreasedCounter, counter.getMinCounter(), counter.getMaxCounter());
    }


}
