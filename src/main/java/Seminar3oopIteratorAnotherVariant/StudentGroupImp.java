package Seminar3oopIteratorAnotherVariant;


import java.util.Iterator;
import java.util.List;

public class StudentGroupImp implements Iterator<PlainStudent>,Iterable<PlainStudent>{
    private List<PlainStudent> groupList;
    private int counter;

    public StudentGroupImp(List<PlainStudent> groupList) {
        this.groupList = groupList;
    }

    public List<PlainStudent> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<PlainStudent> groupList) {
        this.groupList = groupList;
    }

    public void addStudent(PlainStudent plainStudent){
        groupList.add(plainStudent);}

    public void removeStudent(PlainStudent plainStudent){
        groupList.remove(plainStudent);}

    public int getCounter() {
        return counter;
    }

    @Override
    public Iterator<PlainStudent> iterator() {
        Iterator<PlainStudent> iterator = this;
        return iterator;
    }

    @Override
    public boolean hasNext() {
        if (counter<groupList.size())
            return true;
        else{
            counter = 0;
            return false;
        }
    }

    @Override
    public PlainStudent next() {
        if (hasNext())
            return groupList.get(counter++);
        else
            return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            groupList.remove(--counter);
    }
}
