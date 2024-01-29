package Seminar6hw;

import Seminar6hw.Data.User;

public interface UserController <T extends User>{
    T create(String firstName, String secondName, String lastName, int id);
}
