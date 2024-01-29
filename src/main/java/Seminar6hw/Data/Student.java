package Seminar6hw.Data;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Random;

public class Student extends User implements Comparable<Student>, StudentBehaviour{

    private int groupNumber;
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int id) {
        super(firstName,secondName,lastName);
        this.studentId = id;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + this.studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentId>o.getStudentId())
            return 1;
        else if(this.studentId==o.getStudentId())
            return 0;
        else
            return -1;
    }

    @Override
    public String isStudyDay(LocalDateTime inputDate) {
        DayOfWeek dayOfWeek = inputDate.getDayOfWeek();
        int numOfDay=dayOfWeek.getValue();

        if (numOfDay<=5)
            return dayOfWeek+" считается учебным днем в расписании вуза для студентов (уточните график)";
        else
            return dayOfWeek+" считается выходным днем в расписании вуза для студентов";
    }

    @Override
    public boolean passExam() {
        Random rnd = new Random();
        return rnd.nextBoolean();
    }
}
