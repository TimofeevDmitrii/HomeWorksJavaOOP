package Seminar6hwOOPdraft.Controller;

import Seminar6hwOOPdraft.Data.User;

public interface UserController <T extends User>{
    T create(String firstName, String secondName, String lastName);
}
