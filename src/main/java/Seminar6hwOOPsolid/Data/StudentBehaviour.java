package Seminar6hwOOPsolid.Data;

import java.time.LocalDateTime;

public interface StudentBehaviour {
    String isStudyDay(LocalDateTime inputDate);
    boolean passExam();
}
