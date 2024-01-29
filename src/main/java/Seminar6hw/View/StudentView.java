package Seminar6hw.View;

import Seminar6hw.Data.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(Student student) {
        System.out.println(student);
    }
}
