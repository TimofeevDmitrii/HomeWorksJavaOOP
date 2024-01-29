package Seminar6hwOOP.Data;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> groupList;

    public StudentGroup(List<Student> groupList) {
        this.groupList = groupList;
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

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

}
