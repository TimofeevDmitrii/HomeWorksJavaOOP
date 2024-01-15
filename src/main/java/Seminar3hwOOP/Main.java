package Seminar3hwOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Stream> streamList = new ArrayList<>();

        List<Group> groupList3 = new ArrayList<>();
        groupList3.add(new Group(1331));
        groupList3.add(new Group(1332));
        groupList3.add(new Group(1333));
        groupList3.add(new Group(2331));
        groupList3.add(new Group(2332));
        groupList3.add(new Group(3331));
        groupList3.add(new Group(3332));
        groupList3.add(new Group(3333));
        Stream stream3 = new Stream(groupList3, "Поток 3");
        streamList.add(stream3);

        List<Group> groupList1 = new ArrayList<>();
        groupList1.add(new Group(1131));
        groupList1.add(new Group(1132));
        groupList1.add(new Group(2131));
        groupList1.add(new Group(2132));
        Stream stream1 = new Stream(groupList1, "Поток 1");
        streamList.add(stream1);

        List<Group> groupList4 = new ArrayList<>();
        groupList4.add(new Group(3431));
        groupList4.add(new Group(4431));
        Stream stream4 = new Stream(groupList4, "Поток 4");
        streamList.add(stream4);

        List<Group> groupList2 = new ArrayList<>();
        groupList2.add(new Group(1231));
        groupList2.add(new Group(1232));
        groupList2.add(new Group(1233));
        groupList2.add(new Group(2231));
        groupList2.add(new Group(2232));
        groupList2.add(new Group(2233));
        Stream stream2 = new Stream(groupList2, "Поток 2");
        streamList.add(stream2);

        System.out.println("Сделаем проверку реализации Iterable для класса Stream");
        for (Stream stream: streamList){
            System.out.println(stream);
            for (Group gr: stream){
                System.out.println(gr);
//                System.out.println(gr.getStudentList());
            }
            System.out.println();
        }

        StreamService streamService = new StreamService();
        System.out.println("Тестируем сортировку списка потоков по количеству групп в потоке");
        for (Stream stream: streamService.getSortedStreamListByGroupsQuantity(streamList)) {
            streamService.printStream(stream);
            System.out.println();
        }

    }

}
