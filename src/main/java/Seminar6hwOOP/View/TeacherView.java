package Seminar6hwOOP.View;

import Seminar6hwOOP.Data.Teacher;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(Teacher teacher) {
        System.out.println(teacher);
    }
}
