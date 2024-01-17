package Seminar4hwOOP;

public class TeacherController implements UserController<Teacher>{
    @Override
    public Teacher create(int userId, String firstName, String secondName, String lastName) {
        return new Teacher(userId,firstName,secondName,lastName);
    }
}
