package Seminar6hwOOPsolid.Service;

import Seminar6hwOOPsolid.Data.FullTimeStudent;
import Seminar6hwOOPsolid.Data.PartTimeStudent;

public class StudentServiceV2 extends StudentService {
    public FullTimeStudent createFullTimeStudent(String firstName, String secondName, String lastName, int id){
        return new FullTimeStudent(firstName,secondName,lastName, id);
    }

    public PartTimeStudent createPartTimeStudent(String firstName, String secondName, String lastName, int id){
        return new PartTimeStudent(firstName,secondName,lastName, id);
    }
}
