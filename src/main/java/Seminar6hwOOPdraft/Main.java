package Seminar6hwOOPdraft;

import Seminar6hwOOPdraft.Data.FullTimeStudent;
import Seminar6hwOOPdraft.Data.PartTimeStudent;
import Seminar6hwOOPdraft.Controller.StudentController;
import Seminar6hwOOP.Data.*;
import Seminar6hwOOPdraft.Data.Student;
import Seminar6hwOOPdraft.Data.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        List<Student> studentList = new ArrayList<>();
        studentList.add(new PartTimeStudent("sdsd","ssdf","ttre"));
        studentList.add(new PartTimeStudent("sttt","okok","ppoi"));
        studentList.add(new PartTimeStudent("siuuu","llmj","ooioi"));
        studentList.add(new PartTimeStudent("uuye","ookkl","wwqee"));
        studentList.add(new FullTimeStudent("uikk","aaaccv","uukmm"));
        StudentGroup studentGroup = new StudentGroup(studentList);

        for (Student student: studentGroup){
            if(student.willGoStudy())
                System.out.println(student+" сегодня пойдет учиться");
            else
                System.out.println(student+" сегодня не пойдет учиться");
        }
    }
}
