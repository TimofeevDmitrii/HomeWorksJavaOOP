package Seminar6hwOOPdraft.Data;



import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PartTimeStudent extends Student {
    public PartTimeStudent(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }

    @Override
    public String isStudyDay(LocalDateTime inputDate) {
        DayOfWeek dayOfWeek = inputDate.getDayOfWeek();
        int numOfDay=dayOfWeek.getValue();

        if (numOfDay==1 || numOfDay==3 || numOfDay==5)
            return dayOfWeek+"для студентов заочной формы обучения это учебный день";
        else
            return dayOfWeek+"для студентов заочной формы обучения это выходной день";
    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "studentId=" + super.getStudentId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
