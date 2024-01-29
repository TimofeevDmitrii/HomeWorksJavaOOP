package Seminar6hwOOP.View;

import Seminar6hwOOP.Data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
