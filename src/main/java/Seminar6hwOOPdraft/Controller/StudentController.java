package Seminar6hwOOPdraft.Controller;

import Seminar6hwOOPdraft.Data.User;
import Seminar6hwOOPdraft.Service.StudentService;

public class StudentController implements UserController{

    StudentService studentService = new StudentService();


    @Override
    public User create(String firstName, String secondName, String lastName) {
        return null;
    }
}
