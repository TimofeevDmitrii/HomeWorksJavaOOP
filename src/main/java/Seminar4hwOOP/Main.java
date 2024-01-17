package Seminar4hwOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserController controller = new StudentController();
        System.out.println(controller.create(0,"Ivanov","Roman","Andreevich"));
        test(controller.create(0,"Ivanov","Roman","Andreevich"));
        System.out.println();

        TeacherController controller2 = new TeacherController();
        System.out.println(controller2.create(5,"Novikov","Aleksandr","Alekseevich"));
        System.out.println();

        TeacherView teacherView = new TeacherView();
        List<Teacher> teachLst = new ArrayList<>();
        teachLst.add(controller2.create(1,"Loginov","Aleksandr","Vasilevich"));
        teachLst.add(controller2.create(7,"Pavlov","Sergey","Ivanovich"));
        teacherView.sendOnConsole(teachLst);
        test(controller2.create(5,"Novikov","Aleksandr","Alekseevich"));
        test2(controller2);
    }
    public static void test(User user){};
    public static void test2(UserController userController){};
}
