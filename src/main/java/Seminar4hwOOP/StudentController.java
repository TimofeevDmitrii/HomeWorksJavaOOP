package Seminar4hwOOP;

public class StudentController implements UserController<Student>{
    @Override
    public Student create(String firstName, String secondName, String lastName) {
        return new Student(firstName, secondName, lastName);
    }
}
