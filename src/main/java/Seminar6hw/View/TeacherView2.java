package Seminar6hw.View;

import Seminar6hw.Data.Student;
import Seminar6hw.Data.Teacher;

public class TeacherView2 implements UserView<Teacher>{
    @Override
    public void sendOnConsole(Teacher teacher) {
        System.out.println(String.format("Тип - %s, Номер группы - %d, Имя - %s, Фамилия - %s, Отчество - %s",
                teacher.getClass(), teacher.getTeacherId(),teacher.getFirstName(),
                teacher.getSecondName(),teacher.getLastName()));
    }
}
