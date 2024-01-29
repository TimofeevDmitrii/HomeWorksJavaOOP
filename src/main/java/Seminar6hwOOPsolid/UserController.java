package Seminar6hwOOPsolid;

import Seminar6hwOOPsolid.Data.User;

public interface UserController <T extends User>{
    T create(String firstName, String secondName, String lastName, int id);
}
