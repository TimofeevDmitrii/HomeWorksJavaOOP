package Seminar5hwOOP.Controller;


import Seminar5hwOOP.Data.Student;
import Seminar5hwOOP.Service.DataService;
import Seminar5hwOOP.Service.Type;
import Seminar5hwOOP.View.StudentView;

import java.util.List;


public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void printAllStudents(){
        List<Student> studentList = dataService.getAllStudents();
        for(Student student: studentList)
            studentView.printOnConsole(student);
    }
}
