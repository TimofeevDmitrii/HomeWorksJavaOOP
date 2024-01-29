package Seminar6hw;

import Seminar6hw.Data.Student;

public class StudentController implements UserController<Student> {
    @Override
    public Student create(String firstName, String secondName, String lastName, int id) {
        return new Student(firstName, secondName, lastName, id);
    }
}
