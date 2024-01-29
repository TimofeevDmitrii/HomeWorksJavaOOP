package Seminar6hwOOP.View;

import Seminar6hwOOP.Data.User;

public interface UserView <T extends User>{
    void sendOnConsole(T user);
}
