package Seminar3Repeat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(4, "Самсонов", "Олег", "Витальевич"));
        studentList.add(new Student(2, "Комаров", "Александр", "Сергеевич"));
        studentList.add(new Student(1, "Ванин", "Никита", "Александрович"));
        studentList.add(new Student(3, "Сергеева", "Алина", "Владимировна"));
        StudentGroup studentGroup1 = new StudentGroup(studentList);
        studentGroup1.addStudent(new Student(7, "Макарова", "Анастасия", "Ивановна"));
        studentGroup1.addStudent(new Student(6, "Сергеева", "Елена", "Дмитриевна"));
        studentGroup1.addStudent(new Student(5, "ванин", "Виктор", "Андреевич"));
//        System.out.println(studentGroup1.getGroupList());
//        System.out.println(studentList);
//
//        System.out.println("Тестируем Iterator");
//        StudentGroupIterator studGrIterator = new StudentGroupIterator(studentGroup1);
//        while(studGrIterator.hasNext()){
//            Student student = studGrIterator.next();
//            if (student.getStudentId()==1)
//                studGrIterator.remove();
//            else
//                System.out.println(student);
//        }
//        System.out.println();
//        studGrIterator = new StudentGroupIterator(studentGroup1);
//        while(studGrIterator.hasNext()){
//            System.out.println(studGrIterator.next());
//         }
//
//        System.out.println("Тестируем Iterable");
//        for (Student student: studentGroup1){
//            System.out.println(student);
//        }

        StudentGroupService studentGroup1service = new StudentGroupService(studentGroup1);

//        System.out.println("Тестируем удаление студента по ФИО");
//        studentGroup1service.printStudentGroup();
//        System.out.println();
//        studentGroup1service.removeStudentByFIO("Ванин", "Никита", "Александрович");
//        studentGroup1service.printStudentGroup();

////        Если напрямую работать с коллекцией через ForEach, то удалить элемент из нее без break не выйдет - Джава выдаст ошибку
//        for (Student stud: studentList) {
//            if (stud.getFirstName().equals("Комаров") &&
//                    stud.getSecondName().equals("Александр") &&
//                    stud.getLastName().equals("Сергеевич")) {
//                studentList.remove(stud);
//                break;
//            }
//        }
//        for (Student stud: studentList)
//            System.out.println(stud);
//
//        System.out.println("Тестируем сортировку после имплементации Comparable");
//        studentGroup1service.printStudentGroup();
//        System.out.println();
//        for (Student stud: studentGroup1service.getSortedGroupListByID())
//            System.out.println(stud);
//        System.out.println();
//        studentGroup1service.printStudentGroup();

        System.out.println("Тестируем сортировку по ФИО");
        studentGroup1service.printStudentGroup();
        System.out.println();
        for (Student stud: studentGroup1service.getSortedGroupListByFIO())
            System.out.println(stud);
    }
}
