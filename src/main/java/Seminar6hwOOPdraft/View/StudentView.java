package Seminar6hwOOPdraft.View;

import Seminar6hwOOPdraft.Data.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student stud: list)
            System.out.println(stud);
    }
}
