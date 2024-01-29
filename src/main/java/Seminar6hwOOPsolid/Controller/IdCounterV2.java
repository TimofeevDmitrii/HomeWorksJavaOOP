package Seminar6hwOOPsolid.Controller;

import Seminar6hwOOPsolid.Data.Student;
import Seminar6hwOOPsolid.Data.Teacher;
import Seminar6hwOOPsolid.Data.User;

import java.util.List;

public class IdCounterV2 implements CountNextId{
    @Override
    public int countNextStudentId(List<User> userList) {
        int lastStudentId = 10000;
        for (User user : userList) {
            if (user instanceof Student)
                lastStudentId = ((Student) user).getStudentId();
        }
        return ++lastStudentId;
    }

    @Override
    public int countNextTeacherId(List<User> userList) {
        int lastTeacherId = 2000;
        for (User user : userList) {
            if (user instanceof Teacher)
                lastTeacherId = ((Teacher) user).getTeacherId();
        }
        return ++lastTeacherId;
    }
}
