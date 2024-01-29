package Seminar6hw.View;

import Seminar6hw.Data.Student;
import Seminar6hw.Data.StudentGroup;

public class StudGroupView {
    public void printOnConsole(StudentGroup studentGroup){
        System.out.println("Группа №"+ studentGroup.getGroupNumber());
        System.out.println(studentGroup.getTeacher());
        for (Student student: studentGroup.getGroupList())
            System.out.println(student);
        System.out.println();
    }
}
