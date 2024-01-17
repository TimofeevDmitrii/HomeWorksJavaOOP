package Seminar4hwOOP;

public interface UserController <T extends User>{
    T create(int userId, String firstName, String secondName, String lastName);
}
