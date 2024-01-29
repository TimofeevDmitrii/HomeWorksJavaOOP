package Seminar6hwOOPsolid.Controller;

import Seminar6hwOOPsolid.Data.FullTimeStudent;
import Seminar6hwOOPsolid.Data.PartTimeStudent;
import Seminar6hwOOPsolid.Data.Student;
import Seminar6hwOOPsolid.Data.Teacher;
import Seminar6hwOOPsolid.Service.StudentServiceV2;
import Seminar6hwOOPsolid.View.UserView;

public class ControllerV2 extends Controller{
    public ControllerV2(CountNextId nextIdCounter, UserView<Student> studentView, UserView<Teacher> teacherView) {
        super(nextIdCounter, studentView, teacherView);
        studentService = new StudentServiceV2();
    }

    public void createFullTimeStudent(String firstName, String secondName, String lastName){
        int nextStudentId = nextIdCounter.countNextStudentId(allUsers);
        FullTimeStudent student = ((StudentServiceV2) studentService).createFullTimeStudent(firstName, secondName, lastName, nextStudentId);
        checkUser(student);
        allUsers.add(student);
    }

    public void createPartTimeStudent(String firstName, String secondName, String lastName){
        int nextStudentId = nextIdCounter.countNextStudentId(allUsers);
        PartTimeStudent student = ((StudentServiceV2) studentService).createPartTimeStudent(firstName, secondName, lastName, nextStudentId);
        checkUser(student);
        allUsers.add(student);
    }
}
