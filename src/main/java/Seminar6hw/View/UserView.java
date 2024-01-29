package Seminar6hw.View;

import Seminar6hw.Data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(T user);
}
