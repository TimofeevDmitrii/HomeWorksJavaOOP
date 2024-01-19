package Seminar5hwOOP;

import Seminar5hwOOP.Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Aleksanrov","Andrey","Sergeevich");
        controller.createStudent("Filatov","Georgiy","Aleksandrovich");
        controller.printAllStudents();
        System.out.println();

        controller.createTeacher("Potapov","Uriy","Ivanovich");
        controller.createTeacher("Dmitriev","Pavel","Valerievich");

        controller.createStudent("Dovlatov","Semen","Arkadievich");
        controller.createStudent("Ponomarev","Dmitriy","Pavlovich");
        controller.printAllStudents();

    }
}
