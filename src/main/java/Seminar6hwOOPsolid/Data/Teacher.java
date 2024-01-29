package Seminar6hwOOPsolid.Data;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Teacher extends User implements Comparable<Teacher>, TeacherBehaviour{

    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int id) {
        super(firstName, secondName, lastName);
        this.teacherId=id;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + this.teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.teacherId>o.getTeacherId())
            return 1;
        else if(this.teacherId==o.getTeacherId())
            return 0;
        else
            return -1;
    }

    @Override
    public String isWorkDay(LocalDateTime inputDate) {
        DayOfWeek dayOfWeek = inputDate.getDayOfWeek();
        int numOfDay=dayOfWeek.getValue();

        if (numOfDay<=5)
            return dayOfWeek+" считается рабочим днем в расписании вуза для преподавателей (уточните график)";
        else
            return dayOfWeek+" считается выходным днем в расписании вуза для преподавателей";
    }

    @Override
    public String checkExam(Student student) {
        if (student.passExam())
            return student+" сдал экзамен";
        else
            return student+" не сдал экзамен";
    }
}
