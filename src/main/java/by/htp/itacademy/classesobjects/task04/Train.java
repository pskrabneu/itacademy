package by.htp.itacademy.classesobjects.task04;

import java.util.Date;

//  4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
//    данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
////    поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
////    возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
//    быть упорядочены по времени отправления.
public class Train {

    private String destinationTrain;
    private String numberTrain;
    private Date departureTime;

    public Train(String destinationTrain, String numberTrain, Date departureTime) {
        this.destinationTrain = destinationTrain;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
    }

    public String getDestinationTrain() {
        return destinationTrain;
    }

    public void setDestinationTrain(String destinationTrain) {
        this.destinationTrain = destinationTrain;
    }

    public String getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(String numberTrain) {
        this.numberTrain = numberTrain;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }



}
