package Seminar6hw.Data;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{

    private Teacher teacher;
    private int groupNumber;

    private List<Student> groupList;

    public StudentGroup(Teacher teacher, List<Student> groupList, int groupNumber) {
        this.teacher = teacher;
        this.groupList = groupList;
        this.groupNumber = groupNumber;
    }

    public List<Student> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Student> groupList) {
        this.groupList = groupList;
    }

    public void addStudent(Student student){
        groupList.add(student);}

    public void removeStudent(Student student){
        groupList.remove(student);}

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString(){
        return String.format("Группа №%d, преподаватель - %s, количество студентов - %d",
                groupNumber, teacher, groupList.size());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

}
