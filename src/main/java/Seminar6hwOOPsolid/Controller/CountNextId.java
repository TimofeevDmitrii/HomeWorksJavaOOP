package Seminar6hwOOPsolid.Controller;

import Seminar6hwOOPsolid.Data.User;

import java.util.List;

public interface CountNextId {
    public int countNextStudentId(List<User> userList);
    public int countNextTeacherId(List<User> userList);
}
