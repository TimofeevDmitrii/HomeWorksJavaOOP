package Seminar4hwOOP;

import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student stud: list)
            System.out.println(stud);
    }
}
