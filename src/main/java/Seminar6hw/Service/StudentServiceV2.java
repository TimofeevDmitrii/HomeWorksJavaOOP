package Seminar6hw.Service;

import Seminar6hw.Data.FullTimeStudent;
import Seminar6hw.Data.PartTimeStudent;

public class StudentServiceV2 extends StudentService {
    public FullTimeStudent createFullTimeStudent(String firstName, String secondName, String lastName, int id){
        return new FullTimeStudent(firstName,secondName,lastName, id);
    }

    public PartTimeStudent createPartTimeStudent(String firstName, String secondName, String lastName, int id){
        return new PartTimeStudent(firstName,secondName,lastName, id);
    }
}
