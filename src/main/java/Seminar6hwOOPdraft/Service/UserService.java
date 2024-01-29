package Seminar6hwOOPdraft.Service;

import Seminar6hwOOPdraft.Data.User;

public interface UserService <T extends User>{

    T create(String firstName, String secondName, String lastName);

}
