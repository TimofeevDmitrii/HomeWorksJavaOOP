package Seminar6hwOOP.Controller;

import Seminar6hwOOP.Data.User;

import java.util.List;

public interface CountNextId {
    int getFreeId(List<User> userList, Type type);
}
