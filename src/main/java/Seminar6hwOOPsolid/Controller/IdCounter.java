package Seminar6hwOOPsolid.Controller;


import Seminar6hwOOPsolid.Data.Teacher;
import Seminar6hwOOPsolid.Data.User;
import Seminar6hwOOPsolid.Data.Student;

import java.util.List;

public class IdCounter implements CountNextId{

    @Override
    public int countNextStudentId(List<User> userList) {
        int lastStudentId = 0;
        for (User user : userList) {
            if (user instanceof Student)
                lastStudentId = ((Student) user).getStudentId();
        }
        return ++lastStudentId;
    }

    @Override
    public int countNextTeacherId(List<User> userList) {
        int lastTeacherId = 0;
        for (User user : userList) {
            if (user instanceof Teacher)
                lastTeacherId = ((Teacher) user).getTeacherId();
        }
        return ++lastTeacherId;
    }

}
