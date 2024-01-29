package Seminar6hwOOP.View;

import Seminar6hwOOP.Data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teach: list)
            System.out.println(teach);
    }
}
