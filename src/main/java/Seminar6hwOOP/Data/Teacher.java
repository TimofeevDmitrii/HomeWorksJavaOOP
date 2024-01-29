package Seminar6hwOOP.Data;

public class Teacher extends User implements TeacherBehaviour {
    private static int nextTeacherID=0;
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = nextTeacherID++;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public boolean checkHomeWork(Student student) {
        return false;
    }
}
