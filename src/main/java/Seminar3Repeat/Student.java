package Seminar3Repeat;

public class Student implements Comparable<Student>{
    private int studentId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getStudentId(){return studentId;}

    public String getFirstName(){return firstName;}

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
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
