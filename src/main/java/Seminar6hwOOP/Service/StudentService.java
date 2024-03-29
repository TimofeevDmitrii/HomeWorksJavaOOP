package Seminar6hwOOP.Service;

import Seminar6hwOOP.Data.Student;

import java.time.LocalDateTime;

public class StudentService implements UserService<Student> {

    @Override
    public Student create(String firstName, String secondName, String lastName, int id) {
        return new Student(firstName,secondName,lastName, id);
    }

    @Override
    public String checkTheDayStatus(Student user, LocalDateTime inputDate) {
        return user.isStudyDay(inputDate);
    }


}
