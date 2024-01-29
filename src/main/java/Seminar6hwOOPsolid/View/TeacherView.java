package Seminar6hwOOPsolid.View;

import Seminar6hwOOPsolid.Data.Teacher;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(Teacher teacher) {
        System.out.println(teacher);
    }
}
