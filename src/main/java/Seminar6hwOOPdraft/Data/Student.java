package Seminar6hwOOPdraft.Data;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Random;

public class Student extends User implements Comparable<Student>, StudentBehaviour{
    private static int nextStudentId=0;
    private int studentId;

    public Student(String firstName, String secondName, String lastName) {
        super(firstName,secondName,lastName);
        this.studentId = nextStudentId++;
    }

    public int getStudentId(){return studentId;}

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    public String isStudyDay(LocalDateTime inputDate){

        DayOfWeek dayOfWeek = inputDate.getDayOfWeek();
        int numOfDay=dayOfWeek.getValue();

        if (numOfDay<=5)
            return dayOfWeek+" считается учебным днем в расписании вуза для студентов (уточните график)";
        else
            return dayOfWeek+" считается выходным днем в расписании вуза для студентов";
    }

    @Override
    public int compareTo(Student o) {
        if (studentId>o.getStudentId())
            return 1;
        else if(studentId==o.getStudentId())
            return 0;
        else
            return -1;
    }

    @Override
    public boolean willGoStudy() {
        Random rnd = new Random();
        return rnd.nextBoolean();
    }
}
