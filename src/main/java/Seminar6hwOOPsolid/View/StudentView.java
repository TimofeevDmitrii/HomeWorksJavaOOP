package Seminar6hwOOPsolid.View;

import Seminar6hwOOPsolid.Data.Student;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(Student student) {
        System.out.println(student);
    }
}
