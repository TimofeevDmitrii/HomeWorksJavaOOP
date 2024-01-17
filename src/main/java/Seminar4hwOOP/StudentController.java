package Seminar4hwOOP;

public class StudentController implements UserController<Student>{
    @Override
    public Student create(int userId, String firstName, String secondName, String lastName) {
        return new Student(userId, firstName, secondName, lastName);
    }
}
