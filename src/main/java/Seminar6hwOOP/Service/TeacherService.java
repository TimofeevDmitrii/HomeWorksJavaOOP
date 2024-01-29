package Seminar6hwOOP.Service;

import Seminar6hwOOP.Data.Teacher;

import java.time.LocalDateTime;

public class TeacherService implements UserService<Teacher> {

    @Override
    public Teacher create(String firstName, String secondName, String lastName, int id) {
        return new Teacher(firstName,secondName,lastName, id);
    }

    @Override
    public String checkTheDayStatus(Teacher user, LocalDateTime inputDate) {
        return user.isWorkDay(inputDate);
    }
}
