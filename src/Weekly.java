import java.time.LocalDate;
import java.time.LocalDateTime;

public class Weekly extends Task{
    public Weekly(String name, String taskDescription, taskType task_type, LocalDateTime dateTime) {
        super(name, taskDescription, task_type, dateTime);
    }

    @Override
    public boolean nextRepeat(LocalDate dateForChecking) {
        return(dateForChecking.isAfter(getDateTime().toLocalDate())|| dateForChecking.isEqual(getDateTime().toLocalDate())) &&
                dateForChecking.getDayOfWeek() == getDateTime().getDayOfWeek();
    }
}
