package Seminar6hwOOPsolid.Service;

import Seminar6hwOOPsolid.Data.User;

import java.time.LocalDateTime;

public interface UserService <T extends User>{
    T create(String firstName, String secondName, String lastName, int id);
    void checkTheDayStatus(T user, LocalDateTime inputDate);
}
