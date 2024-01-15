package Seminar3hwOOP;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupNumber;
    private List<PartTimeStudent> studentList;

    public Group(int groupNumber) {
        this.groupNumber=groupNumber;
        studentList = fillStudentList();
    }

    public Group(int groupNumber, List<PartTimeStudent> studentList) {
        this.groupNumber = groupNumber;
        this.studentList = studentList;
    }

    public int getGroupNumber() {
        return groupNumber;
    }


    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<PartTimeStudent> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<PartTimeStudent> studentList) {
        this.studentList = studentList;
    }

    private List<PartTimeStudent> fillStudentList(){
        // minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int minStudValue = 5;
        int maxStudValue = 25;
        int numberOfStudents = minStudValue+ (int) (Math.random() * (maxStudValue-minStudValue+1)); // генерируем количество студентов в группе от 5 до 25
        int minAge = 18; // Пусть минимальный возраст студента-заочника: 18 лет
        int maxAge = 50; // Пусть максимальный возраст студента-заочника: 50 лет
        List<PartTimeStudent> studentList = new ArrayList<>();
        for (int i = 0; i<numberOfStudents; i++){
            int currAge = minAge+ (int) (Math.random() * (maxAge-minAge+1));
            studentList.add(new PartTimeStudent("name"+i,"surname"+i, currAge));
        }
        return studentList;
    }

    @Override
    public String toString() {
        return String.format("Номер группы %d, количество студентов - %d", groupNumber,studentList.size());
    }
}
