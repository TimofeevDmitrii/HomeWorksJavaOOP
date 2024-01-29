package Seminar6hwOOPsolid.View;

import Seminar6hwOOPsolid.Data.User;

public interface UserView <T extends User>{
    void sendOnConsole(T user);
}
