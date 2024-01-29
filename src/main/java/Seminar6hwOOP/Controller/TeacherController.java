package Seminar6hwOOP.Controller;

import Seminar6hwOOP.Data.Teacher;

public class TeacherController implements UserController<Teacher> {

    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return new Teacher(firstName,secondName,lastName);
    }
}
