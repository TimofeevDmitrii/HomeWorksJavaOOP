package Seminar6hwOOP.Controller;

import Seminar6hwOOP.Data.User;
import Seminar6hwOOP.Service.StudentService;

public class StudentController implements UserController{

    StudentService studentService = new StudentService();


    @Override
    public User create(String firstName, String secondName, String lastName) {
        return null;
    }
}
