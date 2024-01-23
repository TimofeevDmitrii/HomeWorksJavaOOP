package Seminar5hwOOP.Controller;


import Seminar5hwOOP.Data.StudyGroup;
import Seminar5hwOOP.Data.Student;
import Seminar5hwOOP.Data.Teacher;
import Seminar5hwOOP.Data.User;
import Seminar5hwOOP.Service.DataService;
import Seminar5hwOOP.Service.StudGroupService;
import Seminar5hwOOP.Service.Type;
import Seminar5hwOOP.View.StudGroupView;
import Seminar5hwOOP.View.UserView;

import java.util.List;


public class Controller {
    private final DataService dataService = new DataService();
    private final UserView userView = new UserView();
    private final StudGroupService studGroupService = new StudGroupService();
    private final StudGroupView studGroupView = new StudGroupView();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void printAllStudents(){
        List<Student> studentList = dataService.getAllStudents();
        for(Student student: studentList)
            userView.printOnConsole(student);
    }

    public List<Student> getAllStudents(){
        return dataService.getAllStudents();
    }

    public List<Teacher> getAllTeachers(){
        return dataService.getAllTeachers();
    }

    public StudyGroup createStudGroup(Teacher teacher, List<Student> studentList, int groupNumber){
        return studGroupService.createStudGroup(teacher, studentList, groupNumber);
    }

    public void printStudGroup(StudyGroup studyGroup){
        studGroupView.printOnConsole(studyGroup);
    }

    public void isUserInThisGroup(StudyGroup studyGroup, User user){
        if (studGroupService.checkUserInThisGroup(studyGroup, user))
            System.out.print("В группе №" + studyGroup.getGroupNumber() + " есть пользователь ");
        else
            System.out.print("В группе №" + studyGroup.getGroupNumber() + " нет пользователя ");

        userView.printOnConsole(user);
    }
}
