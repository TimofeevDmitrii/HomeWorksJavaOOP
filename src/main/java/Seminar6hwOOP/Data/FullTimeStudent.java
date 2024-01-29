package Seminar6hwOOP.Data;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FullTimeStudent extends Student {


    public FullTimeStudent(String firstName, String secondName, String lastName, int id) {
        super(firstName, secondName, lastName, id);
    }

    @Override
    public String isStudyDay(LocalDateTime inputDate) {
        DayOfWeek dayOfWeek = inputDate.getDayOfWeek();
        int numOfDay=dayOfWeek.getValue();

        if (numOfDay<=5) {
            if (numOfDay == 3)
                return dayOfWeek + " - у студентов очной формы обучения сегодня НИР (научно-исследовательская работа)";
            else
                return dayOfWeek + " - для студентов очной формы обучения это учебный день";
        }
        else
            return dayOfWeek + " - для студентов очной формы обучения это выходной день";
    }

    @Override
    public String toString() {
        return "FullTimeStudent{" +
                "studentId=" + super.getStudentId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
