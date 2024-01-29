package Seminar6hw.View;

import Seminar6hw.Data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(Teacher teacher) {
        System.out.println(teacher);
    }
}
