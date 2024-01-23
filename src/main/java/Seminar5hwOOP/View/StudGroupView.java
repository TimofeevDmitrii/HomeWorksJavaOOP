package Seminar5hwOOP.View;

import Seminar5hwOOP.Data.StudyGroup;
import Seminar5hwOOP.Data.Student;

public class StudGroupView {
    public void printOnConsole(StudyGroup studyGroup){
        System.out.println("Группа №"+ studyGroup.getGroupNumber());
        System.out.println(studyGroup.getTeacher());
        for (Student student: studyGroup.getStudentList())
            System.out.println(student);
        System.out.println();
    }
}
