package Seminar6hwOOP.Service;

import Seminar6hwOOP.Data.User;

public interface UserService <T extends User>{

    T create(String firstName, String secondName, String lastName);

}
