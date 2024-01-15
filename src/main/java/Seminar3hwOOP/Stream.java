package Seminar3hwOOP;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group>{
    private String streamName;
    private List<Group> groupList;

    public Stream(List<Group> groupList, String streamName) {
        this.groupList = groupList;
        this.streamName = streamName;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return String.format("%s, количество групп - %d", streamName, groupList.size());
    }
}
