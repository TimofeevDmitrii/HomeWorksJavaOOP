package Seminar6hwOOP.Data;

import java.util.ArrayList;
import java.util.List;

public class TeacherCollective {
    List<Teacher> teacherList= new ArrayList<>();

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
