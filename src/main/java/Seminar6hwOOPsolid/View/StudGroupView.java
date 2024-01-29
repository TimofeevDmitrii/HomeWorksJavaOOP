package Seminar6hwOOPsolid.View;

import Seminar6hwOOPsolid.Data.Student;
import Seminar6hwOOPsolid.Data.StudentGroup;

public class StudGroupView {
    public void printOnConsole(StudentGroup studentGroup){
        System.out.println("Группа №"+ studentGroup.getGroupNumber());
        System.out.println(studentGroup.getTeacher());
        for (Student student: studentGroup.getGroupList())
            System.out.println(student);
        System.out.println();
    }
}
