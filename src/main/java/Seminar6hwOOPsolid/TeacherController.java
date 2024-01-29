package Seminar6hwOOPsolid;

import Seminar6hwOOPsolid.Data.Teacher;

public class TeacherController implements UserController<Teacher> {

    @Override
    public Teacher create(String firstName, String secondName, String lastName, int id) {
        return new Teacher(firstName,secondName,lastName, id);
    }
}
