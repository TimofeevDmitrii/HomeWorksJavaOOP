package Seminar6hw.Service;

import Seminar6hw.Data.FullTimeStudent;
import Seminar6hw.Data.Student;

import java.time.LocalDateTime;

public class StudentService implements UserService<Student>{

    @Override
    public Student create(String firstName, String secondName, String lastName, int id) {
        return new Student(firstName,secondName,lastName, id);
    }

    @Override
    public void checkTheDayStatus(Student user, LocalDateTime inputDate) {
        user.isStudyDay(inputDate);
    }


}
