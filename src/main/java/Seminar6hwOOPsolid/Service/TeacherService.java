package Seminar6hwOOPsolid.Service;

import Seminar6hwOOPsolid.Data.Teacher;

import java.time.LocalDateTime;

public class TeacherService implements UserService<Teacher>{

    @Override
    public Teacher create(String firstName, String secondName, String lastName, int id) {
        return new Teacher(firstName,secondName,lastName, id);
    }

    @Override
    public void checkTheDayStatus(Teacher user, LocalDateTime inputDate) {
        user.isWorkDay(inputDate);
    }
}
