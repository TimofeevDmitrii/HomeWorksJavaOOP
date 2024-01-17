package Seminar4hwOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }

    public void removeStudentByFIO(String firstName, String secondName, String lastName) {
        StudentGroupIterator studentIterator = new StudentGroupIterator(studentGroup);

        while (studentIterator.hasNext()) {
            Student currStudent = studentIterator.next();
            if (currStudent.getFirstName().equals(firstName) &&
                    currStudent.getSecondName().equals(secondName) &&
                    currStudent.getLastName().equals(lastName)) {
                studentIterator.remove();
            }
        }

        //Как ни странно, но через ForEach тоже получится удалить, причем и без использования break.
        //Видимо, потому что это обусловлено логикой работы StudentGroupIterator
//        for (Student currStudent: studentGroup){
//        if (currStudent.getFirstName().equals(firstName) &&
//                currStudent.getSecondName().equals(secondName) &&
//                currStudent.getLastName().equals(lastName)) {
//                studentGroup.getGroupList().remove(currStudent);
//                break;
//            }
//        }

    }

    public void printStudentGroup(){
        for (Student student: studentGroup)
            System.out.println(student);
    }

    public List<Student> getSortedGroupListByID(){
        List<Student> sortedStudentList = new ArrayList<>(studentGroup.getGroupList());
        Collections.sort(sortedStudentList);
        return sortedStudentList;
    }

    public List<Student> getSortedGroupListByFIO(){
        List<Student> sortedStudentList = new ArrayList<>(studentGroup.getGroupList());
        sortedStudentList.sort(new UserComparator());
        return sortedStudentList;
    }
}
