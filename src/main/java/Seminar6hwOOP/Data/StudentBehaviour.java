package Seminar6hwOOP.Data;

import java.time.LocalDateTime;

public interface StudentBehaviour {
    String isStudyDay(LocalDateTime inputDate);
    boolean passExam();
//    boolean willGoStudy();
}
