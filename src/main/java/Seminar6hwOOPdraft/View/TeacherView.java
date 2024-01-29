package Seminar6hwOOPdraft.View;

import Seminar6hwOOPdraft.Data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teach: list)
            System.out.println(teach);
    }
}
