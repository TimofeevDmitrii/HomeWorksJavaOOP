package Seminar6hwOOP.Controller;

import Seminar6hwOOP.Data.FullTimeStudent;
import Seminar6hwOOP.Data.PartTimeStudent;
import Seminar6hwOOP.Data.Student;
import Seminar6hwOOP.Data.Teacher;
import Seminar6hwOOP.Service.StudentServiceV2;
import Seminar6hwOOP.View.UserView;

public class ControllerV2 extends Controller {
    public ControllerV2(CountNextId nextIdCounter, UserView<Student> studentView, UserView<Teacher> teacherView) {
        super(nextIdCounter, studentView, teacherView);
        studentService = new StudentServiceV2();
    }

    public void createFullTimeStudent(String firstName, String secondName, String lastName){
        int nextStudentId = nextIdCounter.getFreeId(allUsers, Type.STUDENT);
        FullTimeStudent student = ((StudentServiceV2) studentService).createFullTimeStudent(firstName, secondName, lastName, nextStudentId);
        checkUser(student);
        allUsers.add(student);
    }

    public void createPartTimeStudent(String firstName, String secondName, String lastName){
        int nextStudentId = nextIdCounter.getFreeId(allUsers, Type.STUDENT);
        PartTimeStudent student = ((StudentServiceV2) studentService).createPartTimeStudent(firstName, secondName, lastName, nextStudentId);
        checkUser(student);
        allUsers.add(student);
    }
}
