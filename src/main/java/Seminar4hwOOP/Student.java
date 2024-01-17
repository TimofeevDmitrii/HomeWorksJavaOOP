package Seminar4hwOOP;

public class Student extends User implements Comparable<Student>{
    private int studentId;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName,secondName,lastName);
        this.studentId = studentId;
    }

    public int getStudentId(){return studentId;}

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (studentId>o.getStudentId())
            return 1;
        else if(studentId==o.getStudentId())
            return 0;
        else
            return -1;
    }

}
