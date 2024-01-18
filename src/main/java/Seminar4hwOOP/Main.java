package Seminar4hwOOP;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        UserController controller = new StudentController();
//        System.out.println(controller.create("Ivanov","Roman","Andreevich"));
//        test(controller.create("Ivanov","Roman","Andreevich"));
//        System.out.println(controller.create("Sergeev","Nikolay","Pavlovich"));
//        System.out.println();


        TeacherController controller2 = new TeacherController();
        System.out.println(controller2.create("Novikov","Aleksandr","Alekseevich"));
        System.out.println();

        TeacherView teacherView = new TeacherView();
        TeacherCollective teacherCollective = new TeacherCollective();
        TeacherCollectiveService teacherCollectiveService = new TeacherCollectiveService(teacherCollective);
        List<Teacher> teacherList = teacherCollective.getTeacherList();
        teacherList.add(controller2.create("Loginov","Aleksandr","Vasilevich"));
        teacherList.add(controller2.create("Pavlov","Sergey","Ivanovich"));
        teacherList.add(controller2.create("Karpov","Evgeniy","Petrovich"));
        teacherView.sendOnConsole(teacherList);
        System.out.println();
        System.out.println("Тестируем редактирования конкретного учителя по ID");
        teacherCollectiveService.editTeacherById();
        teacherView.sendOnConsole(teacherList);
        test(controller2.create("Novikov","Aleksandr","Alekseevich"));
        test2(controller2);
    }
    public static void test(User user){};
    public static void test2(UserController userController){};
}
