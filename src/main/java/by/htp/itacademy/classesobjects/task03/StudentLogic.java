package by.htp.itacademy.classesobjects.task03;

public class StudentLogic {

    public String getFullStudentName(Student student) {

        return student.getLastName() + " " + student.getInitials();
    }

    public void printStudentInfoForHighScore(Student student) {

        int[] arrayScore = student.getScore();

        boolean isTenOrNine = false;

        for (int i = 0; i < 5; i++) {

            if (arrayScore[i] < 9) {

                isTenOrNine = false;
                break;
            } else {

                isTenOrNine = true;
            }
        }

        if (isTenOrNine) {

            String name = getFullStudentName(student);
            String group = student.getGroupNumber();

            System.out.println("Name: " + name + " Group: " + group);
        }
    }
}
