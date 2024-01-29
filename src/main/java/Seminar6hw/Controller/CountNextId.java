package Seminar6hw.Controller;

import Seminar6hw.Data.User;

import java.util.List;

public interface CountNextId {
    public int countNextStudentId(List<User> userList);
    public int countNextTeacherId(List<User> userList);
}
