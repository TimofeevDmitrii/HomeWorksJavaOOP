package Seminar3hwOOP;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Group> {

    private List<Group> groupList;
    private int counter;

    public StreamIterator(Stream stream) {
        this.groupList = stream.getGroupList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter<groupList.size();
    }

    @Override
    public Group next() {
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
