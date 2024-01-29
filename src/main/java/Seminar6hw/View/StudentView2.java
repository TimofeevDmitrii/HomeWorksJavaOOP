package Seminar6hw.View;

import Seminar6hw.Data.Student;

public class StudentView2 implements UserView<Student>{
    @Override
    public void sendOnConsole(Student student) {
        System.out.println(String.format("Тип - %s, Номер группы - %d, Имя - %s, Фамилия - %s, Отчество - %s",
                student.getClass(), student.getGroupNumber(),student.getFirstName(),
                student.getSecondName(),student.getLastName()));
    }
}
