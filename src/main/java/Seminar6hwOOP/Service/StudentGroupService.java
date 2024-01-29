package Seminar6hwOOP.Service;

import Seminar6hwOOP.Data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    // удален Конструктор и поле для StudentGroup; при необходимости обработки какого-либо
    // объекта класса StudentGroup будет необходимо передавать его в качестве параметра на вход
    // какой-либо функции из класса StudentGroupService

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> groupList, int groupNumber){
        StudentGroup studentGroup = new StudentGroup(teacher, groupList, groupNumber);
        for (Student student: studentGroup)
            student.setGroupNumber(groupNumber);
        return studentGroup;
    }

    public void removeStudentByFIO(StudentGroup studentGroup, String firstName, String secondName, String lastName) {
        StudentGroupIterator studentIterator = new StudentGroupIterator(studentGroup);

        while (studentIterator.hasNext()) {
            Student currStudent = studentIterator.next();
            if (currStudent.getFirstName().equals(firstName) &&
                    currStudent.getSecondName().equals(secondName) &&
                    currStudent.getLastName().equals(lastName)) {
                studentIterator.remove();
            }
        }


    }

    // printStudentGroup вынесен в StudentGroupView - дополнительный пример Simple responsibility

    public List<Student> getSortedGroupListByID(StudentGroup studentGroup){
        List<Student> sortedStudentList = new ArrayList<>(studentGroup.getGroupList());
        Collections.sort(sortedStudentList);
        return sortedStudentList;
    }

    public List<Student> getSortedGroupListByFIO(StudentGroup studentGroup){
        List<Student> sortedStudentList = new ArrayList<>(studentGroup.getGroupList());
        sortedStudentList.sort(new UserComparator());
        return sortedStudentList;
    }
}
