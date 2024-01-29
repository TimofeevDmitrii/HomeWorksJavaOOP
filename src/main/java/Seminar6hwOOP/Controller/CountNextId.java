package Seminar6hwOOP.Controller;

import Seminar6hwOOP.Data.User;

import java.util.List;

public interface CountNextId {
    public int countNextStudentId(List<User> userList);
    public int countNextTeacherId(List<User> userList);
}
