package Seminar5hwOOP.Service;

import Seminar5hwOOP.Data.StudyGroup;
import Seminar5hwOOP.Data.Student;
import Seminar5hwOOP.Data.Teacher;
import Seminar5hwOOP.Data.User;

import java.util.ArrayList;
import java.util.List;

public class StudGroupService {

    public StudyGroup createStudGroup(Teacher teacher, List<Student> studentList, int groupNumber){
        Teacher copyTeacher = new Teacher(teacher.getFirstName(), teacher.getSecondName(), teacher.getLastName(), teacher.getTeacherId());
//        List<Student> copyStudentList = new ArrayList<>(studentList); - такой вариант не даст полной копии списка в данном случае (новые объекты класса Student не будут созданы)
        List<Student> copyStudentList = new ArrayList<>();
        for (Student student:studentList){
            copyStudentList.add(new Student(student.getFirstName(), student.getSecondName(), student.getLastName(), student.getStudentId()));
        }
        int copyGroupNumber=groupNumber;
        return new StudyGroup(copyTeacher,copyStudentList, copyGroupNumber);
        // В итоге возвращаем экземпляр StudGroup, в котором данные полностью скопированы с входных данных
        // (т.е. полностью новый (скопированный), автономный экземпляр учебной группы)
    }

    public boolean checkUserInThisGroup(StudyGroup studyGroup, User user){
        if (user instanceof Teacher){
            return (user.equals(studyGroup.getTeacher()));
        }
        else if (user instanceof Student){
            for (Student student: studyGroup.getStudentList()){
                if (user.equals(student)){
                    return true;
                }
            }
        }
        return false;
    }
}
