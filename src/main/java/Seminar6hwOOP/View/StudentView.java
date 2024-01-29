package Seminar6hwOOP.View;

import Seminar6hwOOP.Data.Student;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(Student student) {
        System.out.println(student);
    }
}
