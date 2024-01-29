package Seminar6hwOOPdraft.View;

import Seminar6hwOOPdraft.Data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
