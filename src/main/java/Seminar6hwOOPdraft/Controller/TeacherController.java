package Seminar6hwOOPdraft.Controller;

import Seminar6hwOOPdraft.Data.Teacher;

public class TeacherController implements UserController<Teacher> {

    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return new Teacher(firstName,secondName,lastName);
    }
}
