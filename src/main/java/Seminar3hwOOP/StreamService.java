package Seminar3hwOOP;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    public List<Stream> getSortedStreamListByGroupsQuantity(List<Stream> streamList) {
        List<Stream> sortedStreamList = new ArrayList<>(streamList);
        sortedStreamList.sort(new StreamComparator());
        return sortedStreamList;
    }

    public void printStream(Stream stream){
        System.out.println(stream);
        for (Group group: stream){
            System.out.println(group);
        }
    }
}
