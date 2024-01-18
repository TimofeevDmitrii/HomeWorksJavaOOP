package Seminar4hwOOP;

import java.util.Scanner;

public class TeacherCollectiveService {
    TeacherCollective teacherCollective;

    public TeacherCollectiveService(TeacherCollective teacherCollective) {
        this.teacherCollective = teacherCollective;
    }

    private void showEditMenu(){
        System.out.println("1. Фамилия");
        System.out.println("2. Имя");
        System.out.println("3. Отчество");
        System.out.println("4. Выход");
    }

    public void editTeacherById(){
        for (Teacher teacher: teacherCollective.getTeacherList())
            System.out.println(teacher);
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        while(choose!=2){
            System.out.println("1. Выбрать учителя для редактирования по фамилии");
            System.out.println("2. Выход");
            choose = Integer.parseInt(sc.next());
            if (choose==1){
                System.out.print("Выберете учителя для редактирования по ID\nВведите ID:");
                int currId = Integer.parseInt(sc.next());
                boolean findId = false;
                Teacher editTeacher = null;
                for (Teacher teacher: teacherCollective.getTeacherList()) {
                    if (teacher.getTeacherId() == currId) {
                        findId = true;
                        editTeacher = teacher;
                        break;
                    }
                }
                if (findId) {
                    int chooseEdit = 0;
                    while (chooseEdit!=4) {
                        showEditMenu();
                        chooseEdit = Integer.parseInt(sc.next());
                        if (chooseEdit == 1) {
                            System.out.println("Введите фамилию: ");
                            editTeacher.setFirstName(sc.next());
                        } else if (chooseEdit == 2) {
                            System.out.println("Введите имя: ");
                            editTeacher.setSecondName(sc.next());
                        } else if (chooseEdit == 3) {
                            System.out.println("Введите Отчество: ");
                            editTeacher.setLastName(sc.next());
                        }
                    }
                }
                else
                    System.out.println("Учителя с таким ID нет");
            }
        }
    }
}
