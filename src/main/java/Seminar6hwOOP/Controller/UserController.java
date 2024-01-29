package Seminar6hwOOP.Controller;

import Seminar6hwOOP.Data.User;

public interface UserController <T extends User>{
    T create(String firstName, String secondName, String lastName);
}
