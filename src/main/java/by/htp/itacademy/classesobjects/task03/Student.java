package by.htp.itacademy.classesobjects.task03;

// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
//пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Student {

    private String lastName;
    private String initials;

    private String groupNumber;

    private int[] score = new int[5];

    public Student(String lastName, String initials) {

        this.lastName = lastName;
        this.initials = initials;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials.charAt(0) + ". " + initials.charAt(1) + ".";
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
}
