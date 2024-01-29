package Seminar6hwOOP.Service;

import Seminar6hwOOP.Data.FullTimeStudent;
import Seminar6hwOOP.Data.PartTimeStudent;

public class StudentService {

    public PartTimeStudent createPartTimeStudent(String firstName, String secondName, String lastName) {
        return new PartTimeStudent(firstName, secondName, lastName);
    }

    public FullTimeStudent createFullTimeStudent(String firstName, String secondName, String lastName) {
        return new FullTimeStudent(firstName, secondName, lastName);
    }
}
