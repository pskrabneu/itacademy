package by.htp.itacademy.classesobjects.task05;

public class DecimacCounterLogic {

    public void incrementByOne(DecimalCounter counter) {
        counter.setCounter(counter.getCounter() + 1);
    }

    public void decrementByOne(DecimalCounter counter) {
        counter.setCounter(counter.getCounter() - 1);
    }


}
