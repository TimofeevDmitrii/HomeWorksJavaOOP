package Seminar3oopIteratorAnotherVariant;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTestStudentGroupImp {
    public static void main(String[] args) {
        List<PlainStudent> plainStudentList = new ArrayList<>();
        plainStudentList.add(new PlainStudent(4, "Самсонов", "Олег", "Витальевич"));
        plainStudentList.add(new PlainStudent(2, "Комаров", "Александр", "Сергеевич"));
        plainStudentList.add(new PlainStudent(1, "Ванин", "Никита", "Александрович"));
        plainStudentList.add(new PlainStudent(3, "Сергеева", "Алина", "Владимировна"));
        StudentGroupImp studentGroup1 = new StudentGroupImp(plainStudentList);
        studentGroup1.addStudent(new PlainStudent(5, "Макарова", "Анастасия", "Ивановна"));

        System.out.println("Тестируем Iterable");
        for (PlainStudent plainStudent :studentGroup1){
            System.out.println(plainStudent);
        }

        System.out.println();
        System.out.println("Тестируем Iterator");
        Iterator<PlainStudent> studGroup1iterator = studentGroup1;
        while(studGroup1iterator.hasNext()){
            System.out.println(studGroup1iterator.next());
        }
    }
}
