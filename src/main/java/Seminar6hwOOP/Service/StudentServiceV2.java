package Seminar6hwOOP.Service;

import Seminar6hwOOP.Data.FullTimeStudent;
import Seminar6hwOOP.Data.PartTimeStudent;

public class StudentServiceV2 extends StudentService {
    public FullTimeStudent createFullTimeStudent(String firstName, String secondName, String lastName, int id){
        return new FullTimeStudent(firstName,secondName,lastName, id);
    }

    public PartTimeStudent createPartTimeStudent(String firstName, String secondName, String lastName, int id){
        return new PartTimeStudent(firstName,secondName,lastName, id);
    }
}
