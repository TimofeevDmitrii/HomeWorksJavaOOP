package Seminar6hwOOPsolid.Data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private List<Student> studentGroupList;
    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroupList = studentGroup.getGroupList();
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public boolean hasNext() {
        return counter<studentGroupList.size();
    }

    @Override
    public Student next() {
        if (hasNext())
            return studentGroupList.get(counter++);
        else
            return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            studentGroupList.remove(--counter);
    }
}
