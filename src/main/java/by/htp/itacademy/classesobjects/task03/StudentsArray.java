package by.htp.itacademy.classesobjects.task03;

import java.util.ArrayList;

public class StudentsArray {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        Student student01 = new Student("Ivanovskiy", "AM", "Z-101");
        Student student02 = new Student("Petrovskiy", "BB", "Z-102");
        Student student03 = new Student("Vasilevskiy", "MJ", "Z-101");
        Student student04 = new Student("Zelenovich", "OR", "Z-102");
        Student student05 = new Student("Vaisman", "CE", "Z-102");
        Student student06 = new Student("Reutov", "PW", "Z-101");

        student01.setScore(new int[]{5, 9, 8, 9, 10});
        student02.setScore(new int[]{10, 9, 10, 9, 10});
        student03.setScore(new int[]{10, 9, 10, 9, 10});
        student04.setScore(new int[]{9, 9, 10, 9, 10});
        student05.setScore(new int[]{6, 9, 10, 9, 10});
        student06.setScore(new int[]{9, 9, 9, 9, 10});

        studentList.add(student01);
        studentList.add(student02);
        studentList.add(student03);
        studentList.add(student04);
        studentList.add(student05);
        studentList.add(student06);

        StudentLogic studentLogic = new StudentLogic();

        for (Student student : studentList) {

            studentLogic.printStudentInfoForHighScore(student);
        }
    }
}
