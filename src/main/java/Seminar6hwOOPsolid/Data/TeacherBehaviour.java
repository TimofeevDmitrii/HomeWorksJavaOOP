package Seminar6hwOOPsolid.Data;

import java.time.LocalDateTime;

public interface TeacherBehaviour {
    String isWorkDay(LocalDateTime inputDate);
    String checkExam(Student student);
}
