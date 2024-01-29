package Seminar6hwOOP.Controller;

import Seminar6hwOOP.Data.Student;
import Seminar6hwOOP.Data.Teacher;
import Seminar6hwOOP.Data.User;

import java.util.List;

public class IdCounterV2 implements CountNextId {

    @Override
    public int getFreeId(List<User> userList, Type type) {
        boolean isStudent = Type.STUDENT==type;
        int lastId;
        if (isStudent)
            lastId = 10000;
        else
            lastId = 2000;
        for (User user: userList){
            if (user instanceof Teacher && !isStudent)
                lastId = ((Teacher) user).getTeacherId();
            else if (user instanceof Student && isStudent)
                lastId = ((Student) user).getStudentId();
        }
        return lastId +1;
    }
}
