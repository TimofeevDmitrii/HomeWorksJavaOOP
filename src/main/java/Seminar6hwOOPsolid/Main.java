package Seminar6hwOOPsolid;

import Seminar6hwOOPsolid.Controller.Controller;
import Seminar6hwOOPsolid.Controller.IdCounter;
import Seminar6hwOOPsolid.Data.StudentGroup;
import Seminar6hwOOPsolid.Data.Teacher;
import Seminar6hwOOPsolid.View.StudentView;
import Seminar6hwOOPsolid.View.TeacherView;
import Seminar6hwOOPsolid.Data.Student;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        -------------Вариант1---------------------//
        StudentView studentView = new StudentView();
//        StudentView2 studentView2 = new StudentView2();

        TeacherView teacherView = new TeacherView();
//        TeacherView2 teacherView2 = new TeacherView2();

        IdCounter idCounter = new IdCounter();
//        IdCounterV2 idCounterV2 = new IdCounterV2();

        Controller controller = new Controller(idCounter, studentView, teacherView);
        controller.createStudent("ooo","ttiio", "ppp");
        controller.createStudent("ppp","uukl","ollk");
        controller.createStudent("iii","PPP","kkkl");
        controller.createTeacher("iieer","cvjjm","uujo");
        controller.createStudent("eewq","jjiiio","nnds");
        controller.createTeacher("eerr","ooow","qqac");
        controller.printAllTeachers();
        System.out.println();
        controller.printAllStudents();
        System.out.println();
        List<Student> allStudentsList = controller.getAllStudents();
        List<Student> studGroupList1 = new ArrayList<>();
        studGroupList1.add(allStudentsList.get(0));
        studGroupList1.add(allStudentsList.get(2));
        studGroupList1.add(allStudentsList.get(3));
        List<Teacher> allTeachersList = controller.getAllTeachers();
        controller.createStudentGroup(allTeachersList.get(0), studGroupList1, 111);
        List<StudentGroup> allStudGroups = controller.getAllStudentGroups();
        StudentGroup studentGroup1 = allStudGroups.get(0);
        controller.printStudentGroup(studentGroup1);
        System.out.println();

        LocalDateTime localDateTime = LocalDateTime.of(2024,01,24,0,0,0);
        // для примера возьмем 24.01.2024 - это среда
        for (Student student: allStudGroups.get(0)){
            System.out.print(student+": ");
            controller.isStudyDayForStudent(student, localDateTime);
        }
        System.out.println();

        LocalDateTime localDateTime2 = LocalDateTime.of(2024,01,27,0,0,0);
        // для примера возьмем 27.01.2024 - это суббота
        for (Student student: allStudGroups.get(0)){
            System.out.print(student+": ");
            controller.isStudyDayForStudent(student, localDateTime2);
        }
        System.out.println();
        controller.printAllStudents();





        //---------------Вариант2----------------------//

////        StudentView studentView = new StudentView();
//        StudentView2 studentView2 = new StudentView2();
//
////        TeacherView teacherView = new TeacherView();
//        TeacherView2 teacherView2 = new TeacherView2();
//
////        IdCounter idCounter = new IdCounter();
//        IdCounterV2 idCounterV2 = new IdCounterV2();
//
//        ControllerV2 controllerV2 = new ControllerV2(idCounterV2, studentView2, teacherView2);
//        controllerV2.createStudent("ooo","ttiio", "ppp");
//        controllerV2.createStudent("ppp","uukl","ollk");
//        controllerV2.createFullTimeStudent("iii","PPP","kkkl");
//        controllerV2.createTeacher("iieer","cvjjm","uujo");
//        controllerV2.createStudent("eewq","jjiiio","nnds");
//        controllerV2.createPartTimeStudent("aasdf","HHJ","pplkm");
//        controllerV2.createTeacher("eerr","ooow","qqac");
//        controllerV2.printAllTeachers();
//        System.out.println();
//        controllerV2.printAllStudents();
//        System.out.println();
//        List<Student> allStudentsList = controllerV2.getAllStudents();
//        List<Student> studGroupList1 = new ArrayList<>();
//        studGroupList1.add(allStudentsList.get(0));
//        studGroupList1.add(allStudentsList.get(2));
//        studGroupList1.add(allStudentsList.get(3));
//        studGroupList1.add(allStudentsList.get(4));
//        List<Teacher> allTeachersList = controllerV2.getAllTeachers();
//        controllerV2.createStudentGroup(allTeachersList.get(0), studGroupList1, 112);
//        List<StudentGroup> allStudGroups = controllerV2.getAllStudentGroups();
//        StudentGroup studentGroup1 = allStudGroups.get(0);
//        controllerV2.printStudentGroup(studentGroup1);
//        System.out.println();
//
//        LocalDateTime localDateTime = LocalDateTime.of(2024,01,24,0,0,0);
//        // для примера возьмем 24.01.2024 - это среда
//        for (Student student: allStudGroups.get(0)){
//            System.out.print(student+": ");
//            controllerV2.isStudyDayForStudent(student, localDateTime);
//        }
//        System.out.println();
//
//        LocalDateTime localDateTime2 = LocalDateTime.of(2024,01,27,0,0,0);
//        // для примера возьмем 24.01.2024 - 27.01.2024 - это суббота
//        for (Student student: allStudGroups.get(0)){
//            System.out.print(student+": ");
//            controllerV2.isStudyDayForStudent(student, localDateTime2);
//        }
//        System.out.println();
//        controllerV2.printAllStudents();






//        List<User> userList = new ArrayList<>();
//        PartTimeStudent partTimeStudent1 = new PartTimeStudent("ooo","ttiio", "ppp", 3);
//        FullTimeStudent fullTimeStudent1 = new FullTimeStudent("ppp","uukl","ollk",1);
//        Teacher teacher1 = new Teacher("iii","PPP","kkkl",2);
//        userList.add(partTimeStudent1);
//        userList.add(fullTimeStudent1);
//        userList.add(teacher1);
//        Collections.sort(userList);
//        for (User user: userList)
//            System.out.println(user);
    }
}
