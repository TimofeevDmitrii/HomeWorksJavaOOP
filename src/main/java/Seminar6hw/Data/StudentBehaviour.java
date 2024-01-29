package Seminar6hw.Data;

import java.time.LocalDateTime;

public interface StudentBehaviour {
    String isStudyDay(LocalDateTime inputDate);
    boolean passExam();
}
